package javawork;

import java.util.Scanner;

public class Work06 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入");
		int[] arry=new int[6];
		System.out.println(arry.length);
		int min;
		for(int i=0;i<=arry.length;i++) {
			for(int j=i+1;j<=arry.length;j++) {
				if(arry[i]>=arry[j]);
				min=arry[i];
				arry[i]=arry[j];
				arry[j]=min;	
		}
	  }
		for(int i=0;i<=arry.length;i++)
		System.out.println(arry[i]);
	}
}
