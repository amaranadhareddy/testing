package com.sapient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.dao.DaoImpl;
import com.sapient.dao.IDao;
import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public class SerImpl implements ISer{
	
	private IDao dao;
	private static Logger logger  = LoggerFactory.getLogger("sapient");
	
	public SerImpl(){
		logger.trace("service constructor is invoked");
		setDao(new DaoImpl());
		
	}
	
	public void setDao(IDao dao) {
		logger.trace("setDao() invoked");
		logger.debug("injecting mock");
		this.dao = dao;
		logger.info("dao initialized");
	}
	
	@Override
	public boolean transferFund(int fid, int tid, double bal) throws IdException, BalException {
		logger.trace("transferFund() invoked in service");
		Account from = dao.getAccount(fid);
		logger.debug("from account retrieved");
		Account to = dao.getAccount(tid);
		logger.debug("to account retrieved");
		if(from.getBal()<bal)
			throw new BalException("not enough fund to transfer");
		from.setBal(from.getBal()-bal);
		to.setBal(to.getBal()+bal);
		logger.info("{} and {} updated succesfully",fid,tid);
		return true;
	}

}
