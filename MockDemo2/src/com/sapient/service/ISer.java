package com.sapient.service;

import java.util.List;

import com.sapient.vo.Emp;

public interface ISer {

	List<Emp> viewEmployee(String order);
}
