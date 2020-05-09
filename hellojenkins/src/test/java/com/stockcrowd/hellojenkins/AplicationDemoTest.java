package com.stockcrowd.hellojenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class AplicationDemoTest {

	@Test
	public void testAplicationProcedure() {

		
		AplicationDemo apli = new AplicationDemo();
		apli.aplicationProcedure();
		
		assertTrue(true == apli.aplicationProcedure());
		
	}

}
