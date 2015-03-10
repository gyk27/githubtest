package com.unittest;

import com.test.SampleClass;

import junit.framework.TestCase;

public class TestSalary extends TestCase {

	public final void testCalSalaray100() {
		assertEquals(7500, new SampleClass().calSalaray(7000, "AM"));
	}
	
	public final void testCalSalaray200() {
		assertEquals(3200, new SampleClass().calSalaray(3000, "AM"));
	}
	
	public final void testCalSalaray300() {
		assertEquals(5000, new SampleClass().calSalaray(4000, "M"));
	}

}
