package javawork;

import java.util.Scanner;

public class Work04 {
	public static void main(String[] args) {
		int i = 1;
		int pro;
		int j = 1;
		while (i <= 9) {
			j = 1;
			while (j <= 9) {
				pro = i * j;
				System.out.println(i + "*" + j + "=" + pro);
				++j;
			}
			System.out.println("\n");
			i++;
		}
	}
}
