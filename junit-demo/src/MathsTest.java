import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathsTest {
	static Maths maths;

	@BeforeClass
	public static void finalInit() {
		maths = new Maths();// Arrange
		System.out.println("run before every test case only once ");
	}

	@Before
	public void init() {
		maths = new Maths();// Arrange
		System.out.println("run before every test case");
	}
	
	@Test
	public void testCompare() {
		boolean result = maths.compare(1, 1);
		assertTrue(result);
	}
	
	@Test
	public void testCompareWithNotEqualNUmbers() {
		boolean result = maths.compare(1, -1);
		assertFalse(result);
	}
	//considered successful only if exception is thrown
	@Test(expected = IllegalArgumentException.class)
	public void testCompareWithException() {
		maths.compare(-1, -1);
	}
	
	@Test
	public void compareArrays() {
		int[] n1 = new int[] {1,2,3,4};
		int[] n2 = new int[] {1,2,3,4};
		assertArrayEquals(n1, n2);
	}
	
	@Test
	public void testAdd() {
		System.out.println("testAdd");
		int result = maths.add(1, 2);// act
		assertEquals(3, result);// assert
	}

	@Test
	public void testAddNegativeNumbers() {
		System.out.println("testAddNegativeNumbers");
		int result = maths.add(-1, -2);// act
		assertEquals(-3, result);
	}

	@After
	public void postcall() {
		System.out.println("clean up work.");
		maths = null;
	}

	@AfterClass
	public static void postcallAfterAllMethods() {// called only once
		System.out.println("final clean up work.");
		maths = null;
	}
}
