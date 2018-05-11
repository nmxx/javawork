package javawork;

public class Vehicle {
	String name;
	int speed;
	int size;
	
	public void move() {
		System.out.println(name+"快速的移动");
	}
	
	public void setSpeed(int speed) {
		System.out.println("以"+speed+"每秒的速度移动");
		}
	
	public void speedUp(int a) {
		System.out.println("以"+a+"米每秒的加速度加速行驶");
		
	}
	
	public void speedDown() {
		System.out.println("以10米每秒的加速度减速行驶");
	}
	public void show() {
		System.out.println("品牌:"+name+"\n"+" "+"速度:"+speed+"\n"+" "+"体积:"+size);
	}
}
