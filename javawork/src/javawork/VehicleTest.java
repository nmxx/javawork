package javawork;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle ferrari=new Vehicle();
		ferrari.name="ferrari911";
		ferrari.size=20;
		ferrari.speed=200;
		
		ferrari.move();
		ferrari.speedUp(30);
		ferrari.setSpeed(180);
		ferrari.speedDown();
		ferrari.show();
	}

}
