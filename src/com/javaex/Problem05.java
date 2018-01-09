package com.javaex;

public class Problem05 {
	public static void main(String[] args) {
		

int[] random = new int[6];
int temp = 0;

for (int i = 0; i < 6; i++) {
	temp = (int) ((Math.random() * 45) + 1);
	random[i] = temp;

	for (int j = 0; j < i; j++) {
		if (random[i] == random[j]) {
			temp = (int) ((Math.random() * 45) + 1);
			random[i] = temp;
			temp -= 1;
			break;
		}
	}System.out.print(random[i]+"   ");
}



}

}
