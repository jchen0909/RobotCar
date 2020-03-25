/**
 * 
 */
package edu.fiu.robotCar;

/**
 * @author simon
 *
 */
public class Sensor {
	private String UltrasonicSensor;
	private String opticalSensors;
	private String photoResistor;
	
	public void detect() {
		System.out.println("There is a hole in front of the robot");
		
	}
	
	public void getDistence() {
		System.out.println("close to barrier, make action");
	}
}
