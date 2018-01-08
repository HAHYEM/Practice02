package com.javaex;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("지폐 교환 금액");
		
		long money = sc.nextLong();
		
		System.out.println("입력한 금액 : " + money);
		
		int moneyPaper = 0;
		while(true){
			if(money>50000){
				moneyPaper = (int) money/50000;
				money = money%50000;
				System.out.println("5만원짜리 지폐 : " + moneyPaper + "장");
			}else if(money>10000){
				moneyPaper = (int) money/10000;
				money = money%10000;
				System.out.println("만원짜리 지폐 : " + moneyPaper + "장");
			}else if(money>5000){
				moneyPaper = (int) money/5000;
				money = money%5000;
				System.out.println("5천원짜리 지폐 : " + moneyPaper + "장");
			}else if(money>1000){
				moneyPaper = (int) money/1000;
				money = money%1000;
				System.out.println("천원짜리 지폐 : " + moneyPaper + "장");
			}else if(money>500){
				moneyPaper = (int) money/500;
				money = money%500;
				System.out.println("500원짜리 동전 : " + moneyPaper + "개");
			}else if(money>100){
				moneyPaper = (int) money/100;
				money = money%100;
				System.out.println("100원짜리 동전 : " + moneyPaper + "개");
			}else if(money>50){
				moneyPaper = (int) money/50;
				money = money%50;
				System.out.println("50원짜리 동전 : " + moneyPaper + "개");
			}else{
				System.out.println("1원짜리 동전 : " + money + "개");
				break;
			}
		}
		
	}

}