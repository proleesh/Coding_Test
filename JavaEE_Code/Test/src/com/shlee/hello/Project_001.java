package com.shlee.hello;

import java.util.Scanner;

public class Project_001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 자동차 성능 점수값을 입력하세요 : ");
		Integer car_score_1 = sc.nextInt();
		double car001 = car_score_1 + 0.5 + 0.3 + 0.2;
		System.out.println("2번 자동차 성능 점수값을 입력하세요 : ");	
		Integer car_score_2 = sc.nextInt();
		double car002 = car_score_2 + 0.5 + 0.3 + 0.2;
		System.out.println("3번 자동차 성능 점수값을 입력하세요 : ");
		Integer car_score_3 = sc.nextInt();
		double car003 = car_score_3 + 0.5 + 0.3 + 0.2;
		System.out.println("4번 자동차 성능 점수값을 입력하세요 : ");
		Integer car_score_4 = sc.nextInt();
		double car004 = car_score_4 + 0.5 + 0.3 + 0.2;
		System.out.println("5번 자동차 성능 점수값을 입력하세요 : ");
		Integer car_score_5 = sc.nextInt();
		double car005 = car_score_5 + 0.5 + 0.3 + 0.2;

		double avg = (double) (car001 + car002 + car003 + car004 + car005) / 5;
		System.out.println("평균점수는 : " + avg);
		if(avg >= 80) {
			 System.out.println("차의 상태가 엄청 우수합니다.");
		}else if(avg >= 70) {
			System.out.println("차의 상태가 보통 입니다. ");
		}else {
			System.out.println("차를 바꾸세요. ");
		}

	}

}
