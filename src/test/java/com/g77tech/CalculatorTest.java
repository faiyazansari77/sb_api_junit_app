package com.g77tech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.g77tech.beans.Calculator;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator c = new Calculator();
		int actualResult = c.add(10, 20);
		assertEquals(30, actualResult);
	}
	
	@Test
	public void mulTest() {
		Calculator c = new Calculator();
		int actualResult = c.mul(10, 20);
		assertEquals(200, actualResult);
	}
	

}
