package com.sapient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IdException;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;

public class TransferClient {

	private static Logger logger = LoggerFactory.getLogger("sapient");
	
	public static void main(String[] args){
		logger.trace("main thread started");
		ISer ser = new SerImpl();
		logger.debug("service instance created");
		try {
			logger.info("transfer the amount 5000 from account id 1001 to 1002");
			ser.transferFund(1001, 1002, 5000);
			logger.info("succesfully transferred");
		} catch (IdException | BalException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
		}
		
		try {
			logger.info("transfer the amount 5000 from account id 1003 to 1002");
			ser.transferFund(1003, 1002, 5000);
			logger.info("succesfully transferred");
		} catch (IdException | BalException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
		}
		
		
	}
}
