package com.shlee.hello;

import java.util.Scanner;

public class Project_004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��ϰ� ���� ���ڸ� �Է� : ");
		Integer a  = sc.nextInt();
		while(a<5) {
			a++;
			if(a == 3) {
				continue;//���⼭ �ٽ� �ö󰡼� ���
			}
			System.out.println("a�� ���� : " + a);
			
		}
		System.out.println("�Է��ϰ� ���� ���� �Է�: ");
		Integer k = sc.nextInt();
		//do~ while�������� �ʱⰪ �������� �ʾƵ� ���� ���ư�
		//���п��⼭�� �ʱⰪ �������־�����
		do {
			//���� �ʱⰪ�� ���������� �ʴ� ���
			//�ʱⰪ�� �����ȿ��� ������ ���־�� �Ѵ�
			//k = number;
			
			System.out.println("�ѹ��� ���ư���" + k);
		}while(k-->0);
	}

}