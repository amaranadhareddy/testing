package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.EmpService;
import com.sapient.service.Factory;
import com.sapient.service.NotFoundException;
import com.sapient.vo.Emp;

@RunWith(JUnitPlatform.class)
@DisplayName("Employee dao test")
public class EmpTest {
	
	@Test
	public void testEmp1(){
		Emp e1 = new Emp(1001, "ram", 9000);
		Emp e2 = new Emp(1001, "ram", 9000);
		assertEquals(e1, e2);
	}
	
	@Test
	@DisplayName("test employee by ID 1002")
	public void testEmp2() throws NotFoundException, ClassNotFoundException, SQLException{
		EmpService ser = Factory.getEmpSerivce();
		assumeTrue(ser!=null);
		Emp expected = new Emp(1002, "tom", 8000.0);
		assertEquals(expected, ser.getEmployee(1002));
	}
	
	@Test
	public void testEmp3() throws NotFoundException, ClassNotFoundException, SQLException{
		EmpService ser = Factory.getEmpSerivce();
		assumeTrue(ser!=null);
		Emp expected = new Emp(1003, "sam", 8000.0);
		Emp actual = ser.getEmployee(1003);
		assertAll("test all states",
				()->assertEquals(expected.getEmpId(), actual.getEmpId()),
				()->assertEquals(expected.getEmpName(), actual.getEmpName()),
				()->assertEquals(expected.getSal(), actual.getSal()));
	}
	
	@Test
	@DisplayName("exception expected")
	public void testEmp4() throws NotFoundException{
		EmpService ser = Factory.getEmpSerivce();
		assumeTrue(ser!=null);
		assertThrows(NotFoundException.class, ()->ser.getEmployee(1016));
	}
}
