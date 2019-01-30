package com.techelevator;

import org.junit.Test;

import junit.framework.Assert;

public class PostalServiceFirstClassTest {

	@Test
	public void testPostalService() {
		PostalServiceFirstClass postalService = new PostalServiceFirstClass();
		postalService.isFirstClass(); //first class
		Assert.assertEquals(4,postalService.calculateRate(100, 5));
	}

}