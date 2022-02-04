/**
 * @author Ryan Juelsgaard - rjuelsgaard
 * CIS175 - Spring 2022
 * Feb 3, 2022
 */
package JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Class.geometry;

public class testGeometry1 {
	double side1, side2;
	geometry triangle;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		side1 = 3;
		side2 = 4;
		triangle = new geometry();
	}

	@Test
	public void test() {
		double hypotenus = triangle.hypotenus(side1, side2);
		assertTrue(hypotenus == 5);
	}

}
