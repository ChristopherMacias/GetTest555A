package jaidenthetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculaterTest {

	@Test
	void testAdd() {
		calculater clcCalc = new calculater();
		if ( clcCalc.add(1, 5) !=6) {
		fail("Not yet implemented");
		}
	}

	@Test
	void testSubtract() {
	    calculater Subtract = new calculater();
		//assertEquals(calculater.subtract(7,5)6);
		//assertNotEqual(false, true);
		//assertNull()
		//assertNotnull()
		
		if ( Subtract.add(7, 5) !=2) {
		fail("Not yet implemented");
		}
		
		
	}

}
