import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalcTest {

	@Test
	void twoPlusTwoShouldEqualFour(){
		SimpleCalculator calculator = new SimpleCalculator(); // create a calculator object to call the add() method on
		assertEquals(4, calculator.add(2, 2)); // we use assertEqual to verify that add(2,2) should = 4 param: expect result, actual result

		
	}
	
	@Test
	void threePlusSevenShouldEqualTen(){
		SimpleCalculator calculator = new SimpleCalculator(); 
		assertEquals(10, calculator.add(3, 7)); 

	}
	
	@Test
	void fiftyNineShouldReturnF() {
		var grader = new SimpleCalculator(); // var is a class type
		assertEquals('F', grader.determineLetterGrade(59));
	}
	
	@Test
	void sixtyNineShouldReturnD() {
		var grader = new SimpleCalculator();
		assertEquals('D', grader.determineLetterGrade(69));
	}
	
	@Test
	void seventyNineShouldReturnC() {
		var grader = new SimpleCalculator(); 
		assertEquals('C', grader.determineLetterGrade(79));
	}
	@Test
	void eightyNineShouldReturnB() {
		var grader = new SimpleCalculator(); 
		assertEquals('B', grader.determineLetterGrade(89));
	}
	@Test
	void ninetyNineShouldReturnA() {
		var grader = new SimpleCalculator(); 
		assertEquals('A', grader.determineLetterGrade(99));
	}
	
	@Test
	void zeroReturnF() {
		var grader = new SimpleCalculator(); 
		assertEquals('F', grader.determineLetterGrade(0));
	}

	@Test
	void sixtyShouldReturnD() {
		var grader = new SimpleCalculator(); 
		assertEquals('D', grader.determineLetterGrade(60));
	}
	@Test
	void seventyShouldReturnC() {
		var grader = new SimpleCalculator(); 
		assertEquals('C', grader.determineLetterGrade(70));
	}
	@Test
	void eightyShouldReturnB() {
		var grader = new SimpleCalculator(); 
		assertEquals('B', grader.determineLetterGrade(80));
	}
	
	@Test
	void nintyShouldReturnA() {
		var grader = new SimpleCalculator(); 
		assertEquals('A', grader.determineLetterGrade(90));
	}
	
	@Test
	void negativeOneShouldReturnIllegalArgumentException() {
		var grader = new SimpleCalculator(); //verify when this peace of code executed, it throws an illegal exception
		assertThrows(IllegalArgumentException.class, () ->{ 
			grader.determineLetterGrade(-1);
		});
		
	}
	
	
	
	
	
	

}
