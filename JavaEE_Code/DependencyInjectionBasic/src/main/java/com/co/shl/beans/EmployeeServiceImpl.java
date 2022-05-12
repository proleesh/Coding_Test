package com.co.shl.beans;

public class EmployeeServiceImpl implements EmployeeService {

	public Long generateEmployeeId() {
		// TODO Auto-generated method stub
		return System.currentTimeMillis();
		//시스템의 현재 시간에 기반해 각 메소드에서 고유한 직원ID를 만든다.
	}

}
