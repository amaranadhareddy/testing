package com.sapient.service;

import java.util.List;

import com.sapient.dao.IDao;
import com.sapient.vo.Emp;

public class SerImpl implements ISer{

	private IDao dao;
	
	public void setDao(IDao dao) {
		System.out.println("injecting mocks");
		this.dao = dao;
	}

	@Override
	public List<Emp> viewEmployee(String order) {
		List<Emp> lst = dao.getEmployee();
		if(order.equals("id")){
			lst.sort((e1,e2)->((Integer)e1.geteId()).compareTo((Integer)e2.geteId()));
		}else if(order.equals("name")){
			lst.sort((e1,e2)->e1.geteName().compareTo(e2.geteName()));
		}else if(order.equals("sal")){
			lst.sort((e1,e2)->((Double)e1.getSal()).compareTo((Double)e2.getSal()));
		}else{
			return null;
		}
		return lst;
	}

}
