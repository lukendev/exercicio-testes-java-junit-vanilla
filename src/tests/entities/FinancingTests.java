package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorHouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Financing(100000.0, 2000.0, 40);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenValidData() {
		
		double expectedValue = 90000.0;
		
		Financing f = new Financing(50000.0, 2000.0, 80);
		f.setTotalAmount(90000.0);
		
		Assertions.assertEquals(expectedValue, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
			f.setTotalAmount(100000.0);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateValueWhenValidData() {
		
		double expectedValue = 2000.0;
		
		Financing f = new Financing(90000.0, 6000.0, 80);
		f.setIncome(expectedValue);
		
		Assertions.assertEquals(expectedValue, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1000.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateValueWhenValidData() {
		
		int expectedValue = 80;
		
		Financing f = new Financing(90000.0, 6000.0, 40);
		f.setMonths(expectedValue);
		
		Assertions.assertEquals(expectedValue, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(40);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		
		double expectedValue = 20000.0;
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(expectedValue, f.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		
		double expectedValue = 1000.0;
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(expectedValue, f.quota());
	}
	
	

}
