/**
 * 
 */
package edu.fiu.robotCar;

/**
 * @author simon
 *
 */
public class Arm {
	private int length;
	private String claw;
	
	public void open() {
		System.out.println("claw open");
	}

	public void close() {
		System.out.println("claw close");
	}
	
	public void up() {
		System.out.println("Arm move up");
	}
	
	public void down() {
		System.out.println("Arm move down");
	}
}
