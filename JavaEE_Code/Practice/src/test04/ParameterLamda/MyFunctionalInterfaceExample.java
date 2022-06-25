package test04.ParameterLamda;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi= (x) -> { 
//			String str = "method call1";
//			System.out.println(str);
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x + 5); };
		fi.method(2);
		
		//매개변수가 하나인 경우 괄호를 생략할 수 있다.
		//실행문이 하나라면 중괄호 {}는 생략이 가능하다
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
}











