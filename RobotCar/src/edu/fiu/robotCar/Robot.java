/**
 * 
 */
package edu.fiu.robotCar;

/**
 * @author simon
 *
 */
public class Robot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Bluetooth myBluetooth = new Bluetooth();
			myBluetooth.connect();
			myBluetooth.disconnect();
			
			Input myInput = new Input();
			myInput.pressKey();
			
			Buzzer myBuzzer = new Buzzer();
			myBuzzer.makeSound();
			
			Arm myArm = new Arm();
			myArm.up();
			myArm.down();
			myArm.close();
			myArm.open();
			
			Sensor mySensor = new Sensor();
			mySensor.detect();
			mySensor.getDistence();
			
			Camera myCamera = new Camera();
			myCamera.takePhoto();
			myCamera.recordVideo();
			
			Light myLight = new Light();
			myLight.lightUp();
			myLight.lightDown();
			
			Transmission myTrans = new Transmission();
			myTrans.moveBackword();
			myTrans.moveForword();
			myTrans.turnLeft();
			myTrans.turnRight();
			
			Output myOut = new Output();
			myOut.characterShow();
			myOut.colorShow();
			
	}

}
