package io.pn.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculaterServiceTest {
	
	@InjectMocks
	CalculatorService calcService;
	
	Integer x;
	Integer y;
	
	@BeforeEach
	void init() {
		x = 10;
		y = 5 ;
		System.out.println("Before each application started");
	}
	
	@BeforeAll
	static void endOnAllTest() {
		System.out.println("Started Before All...!");
	}
	
	@Test
	@DisplayName("Add Test Has been Tested..!")
	void addTest() {
	 var res = calcService.add(x, y);
	 Assertions.assertEquals(res, 15);
	 System.out.println("add Test successful..");
	}
	@Test
	@DisplayName("sub Test Has been Tested..!")
	void subTest() {
	 var res = calcService.sub(x, y);
	 Assertions.assertEquals(res, 5);
	 System.out.println("sub Test successful..");
	}
	
	
	@AfterEach
	void destroy() {
		x = null;
		y = null;
		System.out.println("Before Each has Been initilized..!");
	}
	@AfterAll
	static void startOnAllTest() {
		System.out.println("Started After All...!");
	}
	
}
