package com.shlee.hello;

public class Project_003 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) { //�ʱⰪ 1���� �����ؼ� 10���� ���� 2~9
			System.out.println("=====" + i + " ��=====");
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
			//���� for ��
			for(int s = 10 - 1; s >= i; s--) {
				System.out.print(" ");
			}
			//�� for ��
			for(int s = 1; s <= i; s ++) {			
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int k = 1; k <= 10; k++) {
			//���� for��
			for (int q = 1; q <= k; q++) {
				System.out.print(" ");
			}
			//�� for��
			for (int q = 10; q >= k; q--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}