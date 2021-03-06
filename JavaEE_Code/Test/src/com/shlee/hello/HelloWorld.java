package com.shlee.hello;

public class HelloWorld {
	public static void main(String[] args) {
		/* System.out.println("GOOD"); */
		/* 이하는 비트연산자 */
		System.out.println(2 << 2);// 8 2진: 0010 -> 2진: 1000 = 8
		System.out.println(3 >> 1);// 3 2진: 0011 -> 2진: 0001 = 1
		System.out.println(8 >> 1);// -8 2진: 1000 -> 2진 : 0100 = 4
		System.out.println(Integer.toBinaryString(-8));
		System.out.println(Integer.toBinaryString(2)); //2진수 0010
		System.out.println(Integer.toBinaryString(22)); // 0001 0110 16+4+2=22
		System.out.println(Integer.toHexString(100)); //16진수 64
		System.out.println(Integer.toOctalString(100)); //8진수 144
		/* 이하는 논리 연산자 */
		boolean xxx = false, yyy = true;
		// && and 양쪽 항이 다 true일때 true 리턴, 반면에 하나가 false이면 false리턴
		System.out.println(xxx + "&&" + yyy + "=" + (xxx && yyy));// false
		// || or 한쪽 항이라도 true일때 true리턴, 바면에 하나가 false이여도 true리턴
		// 모두가 false인 경우 false리턴
		System.out.println(xxx + "||" + yyy + "=" + (xxx || yyy));// false
		// ^ xor 한쪽 항이 다르면 true리턴
		System.out.println(xxx + "^" + yyy + "=" + (xxx ^ yyy));// true
		/* 3항연산자 */
		int sum = 3284;
		int a = 39, b = 92;
		System.out.println(sum >= 2000 ? "Pass" : "Falid"); //3284 > 2000 -> Pass
		System.out.println((a >= 20) || (b <= 70) ? "Very Health" : "Very Bad"); // 39 >= 20 || 92 <= 70 true || false -> true
		System.out.println((a >= 20) || (b <= 70) ? (a >= 20) && (a <= 70) ? "Very Nice" : "Very Health" : "Very Bad");
		// 39 >= 20 || 92 <= 70 true || false -> true, 39 >= 20 && 92 <= 70 true && false -> false, true ? false ? "Very Nice"
		
		
	}

}
