package com.ezen.mybatis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.ezen.mybatis.domain.some.service.SomeServiceImpl;


public class JUnitTest {
	SomeServiceImpl service;
	
	@BeforeEach
	public void setUp() {
		service = new SomeServiceImpl();
	}
	@AfterEach
	public void destroy() {
		// 후행 작업(자원해제 등)
	}
	@Test
	public void sumTest() {
		Assertions.assertEquals(20, service.sum(10, 10));
		//Assert.assertEquals(20, service.sum(10, 10)); //assertEquals(expected, actual);
		//assertEquals(20, service.sum(10, 10)); //static import 활용
	}
	@Test
	public void getMessageTest() {
		assertNotNull(service);
		assertNotNull(service.getMessage());
	}
	
	@DisplayName("사용자 메소드명")
	@Test
	public void test() {
		 assertEquals(10, 10);	
	}
}


