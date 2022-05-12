package com.co.shl.main;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.co.shl.beans.Employee;
import com.co.shl.beans.EmployeeService;

public class PayrollSystem {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext fileSysac = new FileSystemXmlApplicationContext("beans.xml");
		//원래는 4.0에는 ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); 이렇게 쓰는데
		//Spring Framework 5.0 이후는 FileSystemXmlApplication을 쓴다.
		EmployeeService es = (EmployeeService)fileSysac.getBean("esbean");
		System.out.println("A Unique Employee Id: " + es.generateEmployeeId());
		EmployeeService es2 = (EmployeeService)fileSysac.getBean("esbean2");
		System.out.println("B Unique Employee Id: " + es2.generateEmployeeId());
		
//		property로 값을 주입하는 메서드 및 추가 주입 값을 출력
		Employee employee = (Employee)fileSysac.getBean("employee");
		System.out.printf("property로 값을 주입해서 얻은 결과: %s\n",employee);
		
//		constructor-arg로 값을 주입하는 메서드
		Employee employee2 = (Employee)fileSysac.getBean("employee2");
		System.out.printf("constructor-arg로 값을 주입해서 얻은 결과: %s\n",employee2);
		
//		p로 값을 주입하는 메서드
		Employee employee3 = (Employee)fileSysac.getBean("employee3");
		System.out.printf("p로 값을 주입해서 얻은 결과: %s\n",employee3);

		
	}

}
