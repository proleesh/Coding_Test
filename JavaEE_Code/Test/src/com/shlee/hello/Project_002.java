package com.shlee.hello;

import java.util.Scanner;

public class Project_002 {
	public static void main(String[] args) {

		int salary = 4200000; // �⺻ ���� 420��

		// ���޺� ���� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("����� ������ �������� �Է��ϼ��� : ");
		int position = sc.nextInt();
		
		switch (position) {
		case  1001:
			System.out.println("����� �����Դϴ�.");
			System.out.println("����� ������ ������ �����ϴ�. ");
			float director = (float) (salary + (0.5 * salary));
			System.out.println(director + "��");
			break;
		case 1002: 
			System.out.println("����� �����Դϴ�.");
			System.out.println("����� ������ ������ �����ϴ�. ");
			float intern = (float) (salary + (0.1 * salary));
			System.out.println(intern + "��");
			break;
		case 1003:
			System.out.println("����� �����Դϴ�. ");
			System.out.println("����� ������ ������ �����ϴ�. ");
			float manager = (float) (salary + (0.3 * salary));
			System.out.println(manager + "��");
			break;
		case 1004:
			System.out.println("����� �븮�Դϴ�. ");
			System.out.println("����� ������ ������ �����ϴ�. ");
			float deputy = (float) (salary + (0.2 * salary));
			System.out.println(deputy + "��");
			break;
		default:
			System.out.println("�����Դϴ�. ");
			System.out.println("���α׷��� ������ŵ�ϴ�. ");
		}
	}

}