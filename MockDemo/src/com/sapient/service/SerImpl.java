package com.sapient.service;

import com.sapient.dao.IDao;
import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public class SerImpl implements ISer{

	private IDao dao;
	public void setDao(IDao dao) {
		System.out.println("injecting mock");
		this.dao = dao;
	}
	
	@Override
	public boolean transferFund(int fid, int tid, double bal) throws IdException, BalException {
		Account from = dao.getAccount(fid);
		Account to = dao.getAccount(tid);
		if(from.getBal()<bal)
			throw new BalException("not enough fund to transfer");
		from.setBal(from.getBal()-bal);
		to.setBal(to.getBal()+bal);
		return true;
	}

}
