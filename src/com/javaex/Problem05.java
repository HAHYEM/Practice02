package com.javaex;

public class Problem05 {
	public static void main(String[] args) {
		
		int random [] = new int[6];
	for(int i = 0; i < random.length; i++) {
		random[i] = (int) (Math.random() * 45 + 1);
		System.out.print(random[i] + "   ");
	}
	
	}
}
