package com.shlee.hello;


public class project_005 {
	public static void main(String[] args) {
		int [] arr = {24, 55, 23, 53, 44};
		
		System.out.println("배열: " + arr); //메모리 access가 호출된다.
		
		System.out.println("배열중 첫 번째 자리: " + arr[0]); //24
		System.out.println("배열중 두 번째 자리: " + arr[1]); //55
		System.out.println("배열중 세 번째 자리: " + arr[2]); //23
		System.out.println("배열중 네 번째 자리: " + arr[3]); //53
		System.out.println("배열중 다섯 번째 자리: " + arr[4]); //44
		//System.out.println("배열중 여섯 번째 자리: " + arr[5]); 
		//여섯 번째 자리 같은 경우 arraylist안에 없기 때문에 예외처리 된다.
		//java.lang.ArrayIndexOutOfBoundsException로처리 된다
		for(int i = 0; i < arr.length;i++) { //갯수를 몰라도 끝가지 출력가능 이때 arr.length로 쓸수있다
			System.out.println("arr 원소 " + i + " 번 값: " + arr[i]);
			if(i != (arr.length - 1)) {
				System.out.print(", ");
			}
			System.out.println();
		}
		int [] arr2 = new int[5]; //int형으로 5개를 원소로 받도록 메모리할당
		//동적 할당
		int[] arr3 = arr; //shallow copy -> 주소복사
		int[] arr4 = new int[arr.length];
		for(int i=0; i<arr4.length; i++) {
			arr4[i] = arr[i]; //deep copy -> 원소 값 복사
		}
		arr3[5] = 78;
		System.out.println("arr4[5] : "+ arr4[5]);
		System.out.println("arr3[5] : "+ arr3[5]);
		System.out.println("arr[4] :"+ arr[4]);

		
	}

}
