package com.shlee.hello;

import java.util.Scanner;

public class Project_002 {
	public static void main(String[] args) {

		int salary = 4200000; // 기본 월급 420만

		// 직급별 월급 계산
		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 직급의 직업번을 입력하세요 : ");
		int position = sc.nextInt();
		
		switch (position) {
		case  1001:
			System.out.println("당신은 부장입니다.");
			System.out.println("당신의 월급은 다음과 같습니다. ");
			float director = (float) (salary + (0.5 * salary));
			System.out.println(director + "원");
			break;
		case 1002: 
			System.out.println("당신은 인턴입니다.");
			System.out.println("당신의 월급은 다음과 같습니다. ");
			float intern = (float) (salary + (0.1 * salary));
			System.out.println(intern + "원");
			break;
		case 1003:
			System.out.println("당신은 과장입니다. ");
			System.out.println("당신의 월급은 다음과 같습니다. ");
			float manager = (float) (salary + (0.3 * salary));
			System.out.println(manager + "원");
			break;
		case 1004:
			System.out.println("당신은 대리입니다. ");
			System.out.println("당신의 월급은 다음과 같습니다. ");
			float deputy = (float) (salary + (0.2 * salary));
			System.out.println(deputy + "원");
			break;
		default:
			System.out.println("오류입니다. ");
			System.out.println("프로그램을 중지시킵니다. ");
		}
	}

}
