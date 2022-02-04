/**
 * @author Ryan Juelsgaard - rjuelsgaard
 * CIS175 - Spring 2022
 * Feb 3, 2022
 */
package Class;
import java.lang.Math;

public class geometry {
	public double hypotenus(double side1, double side2) {
		
		return Math.sqrt((side1*side1) + (side2 * side2));
	}
	public double triangleArea(double base, double height) {
		return ((base * height) * .5);
	}
}
