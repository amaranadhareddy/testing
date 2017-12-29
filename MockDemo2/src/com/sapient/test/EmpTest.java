package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sapient.dao.IDao;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;
import com.sapient.vo.Emp;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class EmpTest {

	@Mock
	IDao dao;
	
	@InjectMocks
	ISer ser = new SerImpl();
	
	static List<Emp> idList = null;
	static List<Emp> nameList = null;
	static List<Emp> salList = null;
	static Emp e1 = new Emp(1003, "ram", 9000);
	static Emp e2 = new Emp(1001, "tarun", 19000);
	static Emp e3 = new Emp(1007, "anup", 8000);
	static Emp e4 = new Emp(1002, "shubham", 7000);
	@BeforeAll
	public static void beforeAll(){
		
		idList = new ArrayList<>();
		idList.add(e2);
		idList.add(e4);
		idList.add(e1);
		idList.add(e3);

		nameList = new ArrayList<>();
		nameList.add(e3);
		nameList.add(e1);
		nameList.add(e4);
		nameList.add(e2);
		
		salList = new ArrayList<>();
		salList.add(e4);
		salList.add(e3);
		salList.add(e1);
		salList.add(e2);
	}
	
	@BeforeEach
	public void before(){
		List<Emp> lst = new ArrayList<>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		when(dao.getEmployee()).thenReturn(lst);
	}
	
	@Test
	public void testEmp1(){
		List<Emp> actual = ser.viewEmployee("id");
		assertTrue(actual.size() == nameList.size());
	}
	
	@Test
	public void testEmp2(){
		List<Emp> actual = ser.viewEmployee("id");
		assertEquals(idList, actual);
	}
	
	@Test
	public void testEmp3(){
		List<Emp> actual = ser.viewEmployee("name");
		assertTrue(actual.size() == nameList.size());
	}
	
	@Test
	public void testEmp4(){
		List<Emp> actual = ser.viewEmployee("name");
		assertEquals(nameList, actual);
	}
	
	@Test
	public void testEmp5(){
		List<Emp> actual = ser.viewEmployee("sal");
		assertEquals(salList, actual);
	}
	
	@Test
	public void testEmp6(){
		List<Emp> actual = ser.viewEmployee("sal");
		assertTrue(actual.size() == nameList.size());
	}
	
	@Test
	public void testEmp7(){
		assertNull(ser.viewEmployee("aaa"));
	}
	
}
