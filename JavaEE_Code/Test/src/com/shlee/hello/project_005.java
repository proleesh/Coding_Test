package com.shlee.hello;


public class project_005 {
	public static void main(String[] args) {
		int [] arr = {24, 55, 23, 53, 44};
		
		System.out.println("�迭: " + arr); //�޸� access�� ȣ��ȴ�.
		
		System.out.println("�迭�� ù ��° �ڸ�: " + arr[0]); //24
		System.out.println("�迭�� �� ��° �ڸ�: " + arr[1]); //55
		System.out.println("�迭�� �� ��° �ڸ�: " + arr[2]); //23
		System.out.println("�迭�� �� ��° �ڸ�: " + arr[3]); //53
		System.out.println("�迭�� �ټ� ��° �ڸ�: " + arr[4]); //44
		//System.out.println("�迭�� ���� ��° �ڸ�: " + arr[5]); 
		//���� ��° �ڸ� ���� ��� arraylist�ȿ� ���� ������ ����ó�� �ȴ�.
		//java.lang.ArrayIndexOutOfBoundsException��ó�� �ȴ�
		for(int i = 0; i < arr.length;i++) { //������ ���� ������ ��°��� �̶� arr.length�� �����ִ�
			System.out.println("arr ���� " + i + " �� ��: " + arr[i]);
			if(i != (arr.length - 1)) {
				System.out.print(", ");
			}
			System.out.println();
		}
		int [] arr2 = new int[5]; //int������ 5���� ���ҷ� �޵��� �޸��Ҵ�
		//���� �Ҵ�
		int[] arr3 = arr; //shallow copy -> �ּҺ���
		int[] arr4 = new int[arr.length];
		for(int i=0; i<arr4.length; i++) {
			arr4[i] = arr[i]; //deep copy -> ���� �� ����
		}
		arr3[5] = 78;
		System.out.println("arr4[5] : "+ arr4[5]);
		System.out.println("arr3[5] : "+ arr3[5]);
		System.out.println("arr[4] :"+ arr[4]);

		
	}

}