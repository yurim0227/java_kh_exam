package com.kh.practice1.run;

import com.kh.practice1.func.VariablePractice1;

public class Run {
//	public Run() {
//		super();
//	}
	
	public static void main(String[] args) {
//		new VariablePractice1().method1();
//		new VariablePractice1().method2();
//		new VariablePractice1().method3();
//		new VariablePractice1().method4();
		
		// 객체/인스턴스 vp1을 생성
		VariablePractice1 vp1 = new VariablePractice1();
//		vp1.method1();
		// 객체/인스턴스 vp2을 생성
		VariablePractice1 vp2 = new VariablePractice1();
//		vp2.method2();
		// 객체/인스턴스 vp3을 생성
//		VariablePractice1 vp3 = new VariablePractice1();
//		vp3.method3();
		// 객체/인스턴스 vp4을 생성
//		VariablePractice1 vp4 = new VariablePractice1();
//		vp4.method4();
		
//		vp1.v1=11;
//		System.out.println(vp1.v1);	// 11
//		System.out.println(vp2.v1);	// 10
//		
//		vp1.sv=12;
//		System.out.println(vp1.sv);	// 12
//		System.out.println(vp2.sv);	// 12
		
		System.out.println(VariablePractice1.cnt);
		
		//객체/인스턴스 vp을 생성
		VariablePractice1 vp = new VariablePractice1();
		
		vp.cnt = 11;	// warning 발생
		VariablePractice1.cnt = 11;
//		vp.method1();
//		vp.method2();
//		vp.method3();
//		vp.method4();
		
//		int a;	// warning 발생 - 생성만 하고 활용하지 않아서
//		a = 10;
//		a++;
	}
}
