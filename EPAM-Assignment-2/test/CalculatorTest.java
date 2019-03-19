/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import epam.excercise2.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andhare
 */
public class CalculatorTest {
    
    Calculator cc = new Calculator();
    
        @Test
	public void testAddition() {
		assertEquals(10, cc.Addition(5,5));
		assertEquals(6, cc.Addition(10,-4));
		assertEquals(0, cc.Addition(5,-5));
		assertEquals(-6, cc.Addition(-10,4));
		assertEquals(6, cc.Addition(0,6));
	}
        
        @Test
	public void testSubstraction() {
		assertEquals(0, cc.Substraction(5,5));
		assertEquals(6, cc.Substraction(10,4));
		assertEquals(3, cc.Substraction(5,2));
		assertEquals(-6, cc.Substraction(4,10));
		assertEquals(-6, cc.Substraction(0,6));
	}
        
	@Test
	public void testMultiplication()
	{
		assertEquals(25, cc.Multiplication(5,5));
		assertEquals(-40, cc.Multiplication(10,-4));
		assertEquals(-25, cc.Multiplication(5,-5));
		assertEquals(40, cc.Multiplication(-10,-4));
		assertEquals(0, cc.Multiplication(0,6));
		
	}
	@Test
	public void testDivision()
	{
		assertEquals(1, cc.Division (5,5));
		assertEquals(5, cc.Division(25,5));
		assertEquals(-5, cc.Division(-25,5));
		assertEquals(-5, cc.Division(25,-5));
		assertEquals(5, cc.Division(-25,-5));
        }
    
}
