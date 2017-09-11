package com.ibm.jp.teruz.sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloApiTest {
	
	private HelloApi api;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		api = new HelloApi();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHello() {
		assertEquals("Hello, hoge!", api.hello("hoge"));
	}

}
