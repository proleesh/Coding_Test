package com.shlee.hello;

public class HelloWorld {
	public static void main(String[] args) {
		/* System.out.println("GOOD"); */
		/* ���ϴ� ��Ʈ������ */
		System.out.println(2 << 2);// 8 2��: 0010 -> 2��: 1000 = 8
		System.out.println(3 >> 1);// 3 2��: 0011 -> 2��: 0001 = 1
		System.out.println(8 >> 1);// -8 2��: 1000 -> 2�� : 0100 = 4
		System.out.println(Integer.toBinaryString(-8));
		System.out.println(Integer.toBinaryString(2)); //2���� 0010
		System.out.println(Integer.toBinaryString(22)); // 0001 0110 16+4+2=22
		System.out.println(Integer.toHexString(100)); //16���� 64
		System.out.println(Integer.toOctalString(100)); //8���� 144
		/* ���ϴ� ���� ������ */
		boolean xxx = false, yyy = true;
		// && and ���� ���� �� true�϶� true ����, �ݸ鿡 �ϳ��� false�̸� false����
		System.out.println(xxx + "&&" + yyy + "=" + (xxx && yyy));// false
		// || or ���� ���̶� true�϶� true����, �ٸ鿡 �ϳ��� false�̿��� true����
		// ��ΰ� false�� ��� false����
		System.out.println(xxx + "||" + yyy + "=" + (xxx || yyy));// false
		// ^ xor ���� ���� �ٸ��� true����
		System.out.println(xxx + "^" + yyy + "=" + (xxx ^ yyy));// true
		/* 3�׿����� */
		int sum = 3284;
		int a = 39, b = 92;
		System.out.println(sum >= 2000 ? "Pass" : "Falid"); //3284 > 2000 -> Pass
		System.out.println((a >= 20) || (b <= 70) ? "Very Health" : "Very Bad"); // 39 >= 20 || 92 <= 70 true || false -> true
		System.out.println((a >= 20) || (b <= 70) ? (a >= 20) && (a <= 70) ? "Very Nice" : "Very Health" : "Very Bad");
		// 39 >= 20 || 92 <= 70 true || false -> true, 39 >= 20 && 92 <= 70 true && false -> false, true ? false ? "Very Nice"
		
		
	}

}