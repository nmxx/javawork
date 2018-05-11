package javawork;

public class MyTime {
	 private int hour;
	 private int minute;
	 private int second;
	 
	 public MyTime() {
		 System.out.println();
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void hour(int hour) {
		 System.out.println();
	 }
	 public void minute(int minute) {
		 System.out.println();
	}
	 public void second(int second) {
		 System.out.println();
	 }
	 public void display() {
		 System.out.println("时:"+hour+"\n"+"分:"+minute+"\n"+"秒:"
	 +second);
	 }
}
