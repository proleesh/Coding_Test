package com.shlee.hello;

import java.util.Scanner;

public class Project_001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1�� �ڵ��� ���� �������� �Է��ϼ��� : ");
		Integer car_score_1 = sc.nextInt();
		double car001 = car_score_1 + 0.5 + 0.3 + 0.2;
		System.out.println("2�� �ڵ��� ���� �������� �Է��ϼ��� : ");	
		Integer car_score_2 = sc.nextInt();
		double car002 = car_score_2 + 0.5 + 0.3 + 0.2;
		System.out.println("3�� �ڵ��� ���� �������� �Է��ϼ��� : ");
		Integer car_score_3 = sc.nextInt();
		double car003 = car_score_3 + 0.5 + 0.3 + 0.2;
		System.out.println("4�� �ڵ��� ���� �������� �Է��ϼ��� : ");
		Integer car_score_4 = sc.nextInt();
		double car004 = car_score_4 + 0.5 + 0.3 + 0.2;
		System.out.println("5�� �ڵ��� ���� �������� �Է��ϼ��� : ");
		Integer car_score_5 = sc.nextInt();
		double car005 = car_score_5 + 0.5 + 0.3 + 0.2;

		double avg = (double) (car001 + car002 + car003 + car004 + car005) / 5;
		System.out.println("��������� : " + avg);
		if(avg >= 80) {
			 System.out.println("���� ���°� ��û ����մϴ�.");
		}else if(avg >= 70) {
			System.out.println("���� ���°� ���� �Դϴ�. ");
		}else {
			System.out.println("���� �ٲټ���. ");
		}

	}

}
