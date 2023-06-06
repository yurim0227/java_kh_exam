package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	Employee e = new Employee();

	// 멤버 필드
	public void add(/* 매개변수 생략 */int empNo, String name, char gender, String phone) {
		// 받아온 매개변수만큼 매개변수 있는 생성자를 통해 값 저장
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	}
	public void add(int empNo, String name, char gender, String phone, String dept, 
			int salary, double bonus) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
	}
	public void modify(/* 매개변수 생략 */String phone) {
		// 받아온 매개변수를 이용하여 해당 정보 수정
		e.setPhone(phone);
	}
	public void modify(int salary) {
		e.setSalary(salary);
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	public Employee remove(){
	// 객체 e에 null을 저장하여 객체 삭제
		if(e.getName() == null) {
			System.out.println("삭제할 데이터가 없습니다.");
		}	else System.out.println("데이터 삭제에 성공하였습니다.");
		e = new Employee();
		return e;
	}
	public String inform(){
	// 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환
		if(e.getName() == null) {
			return null;
		}
		if(e.getDept() == null) {
			return e.getEmpNo() + " " + e.getName() + " " + e.getGender() + " " + e.getPhone()+ 
					" " + e.getDept() + " " + e.getSalary() + " " + e.getBonus();
		}
		return e.getEmpNo() + " " + e.getName() + " " + e.getGender() + " " + e.getPhone() + 
				" " + e.getDept() + " " + e.getSalary() + " " + e.getBonus();
	}
}
