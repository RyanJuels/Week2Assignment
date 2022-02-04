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

public class testGeometry2 {
	double base, height;
	geometry triangle;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		base = 5;
		height = 7;
		triangle = new geometry();
	}

	@Test
	public void test() {
		double area = triangle.triangleArea(base, height);
		assertTrue(area == 17.5);
	}

}
