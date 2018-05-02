package javawork;

import java.util.Scanner;

public class Work02 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		   System.out.println("分数");
		   int score =scanner.nextInt();
		if(score>=90) {
			System.out.println("一个优秀的分数，你好棒啊");
		}
		else if(score>=80){
			System.out.println("一个评为良好的分数，加油啊");
		}
		else if(score>=70) {
			System.out.println("一个评为良的分数，再加把劲");
		}
		else if(score>=60){
			System.out.println("一个刚刚及格的分数，还需努力");
		}
		else if(score<60) {
			System.out.println("杯具");
		}
	}

}
