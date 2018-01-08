package com.javaex;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 쓰시오");
		double[] data = new double[5];
		double sum =0;
		
		for(int i = 0; i < data.length; i++) {
			
		data[i] = sc.nextDouble();
		sum += data[i];
		}
		
		System.out.println("평균은 " + sum/5);
	}
}
