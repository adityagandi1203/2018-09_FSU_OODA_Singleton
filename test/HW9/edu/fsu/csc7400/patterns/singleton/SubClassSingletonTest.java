package HW9.edu.fsu.csc7400.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * BaseSingletonTest will do a basic test of the base singleton
 * 
 * @author orlando
 */
class SubClassSingletonTest {
	
	private SubClassSingleton singleton;
/*
 * typecasted the subclass for the instance creation
 * */

	@BeforeEach
	void setUp() throws Exception {
		singleton = (SubClassSingleton)SubClassSingleton.getInstance();
	}
	/*checked the instance creation
	*/
	@Test
	void testGetInstance() {
		assertEquals(
				1,
				SubClassSingleton.getInstance().getSomeState());
	}

	@Test
	void testSetSomeState() {
		singleton.setSomeState(3);
		assertEquals(
				3,
				singleton.getSomeState());
	}

	@Test
	void testGetSomeState() {
		singleton.setSomeState(-1);
		assertEquals(
				-1,
				singleton.getSomeState());
	}

	@Test
	void testDoSomething() {
		singleton.doSomething();
		assertEquals(
				2,
				singleton.getSomeState());
	}

	@Test
	void testNewFunction() {
		assertEquals(
				100,
				singleton.newFunction());
	}

}
