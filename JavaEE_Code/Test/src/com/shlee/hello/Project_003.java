package com.shlee.hello;

public class Project_003 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) { //초기값 1부터 시작해서 10이하 까지 2~9
			System.out.println("=====" + i + " 단=====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));			}
		}
		for (int star = 1; star <= 5; star ++) {
			for (int stars = 1; stars <= star; stars ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int a = 1; a <= 5; a++) {

			for (int b = 5; b >= a; b--) {

				System.out.print("*");

			}
			System.out.println("");
		}
		
		for(int i = 1; i <= 10; i++){
			//공백 for 문
			for(int s = 10 - 1; s >= i; s--) {
				System.out.print(" ");
			}
			//별 for 문
			for(int s = 1; s <= i; s ++) {			
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int k = 1; k <= 10; k++) {
			//공백 for문
			for (int q = 10 - 9; q <= k; q++) {
				System.out.print(" ");
			}
			//별 for문
			for (int q = 10; q >= k; q--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
