package com.shlee.hello;

import java.util.Scanner;

public class Project_004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하고 싶은 숫자를 입력 : ");
		Integer a  = sc.nextInt();
		while(a<5) {
			a++;
			if(a == 3) {
				continue;//여기서 다시 올라가서 계산
			}
			System.out.println("a의 값은 : " + a);
			
		}
		System.out.println("입력하고 싶은 값을 입력: ");
		Integer k = sc.nextInt();
		//do~ while문에서는 초기값 지정하지 않아도 정상 돌아감
		//물론여기서는 초기값 설정해주었지만
		do {
			//만일 초기값을 지정해주지 않는 경우
			//초기값을 구문안에서 선언을 해주어야 한다
			//k = number;
			
			System.out.println("한번은 돌아가요" + k);
		}while(k-->0);
	}

}
