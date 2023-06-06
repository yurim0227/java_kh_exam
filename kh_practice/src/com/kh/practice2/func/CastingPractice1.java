package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	Scanner sc = new Scanner(System.in);
//	Class Name : com.kh.practice2.func.CastingPractice1
//	실행 클래스 : com.kh.practice2.run.Run
//
//	키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
//
//	ex.
//	문자 : A
//
//	A unicode : 65
	public void method1() {
		System.out.print("문자 : ");
		char char1 = sc.nextLine().charAt(0);
		System.out.print(char1+" unicode : "+(int)char1);
	}
//	Class Name : com.kh.practice2.func.CastingPractice2
//	실행 클래스 : com.kh.practice2.run.Run
//
//	실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
//	이 때 총점과 평균은 정수형으로 처리하세요.
//
//	ex.
//	국어 : 90.0
//	영어 : 90.0
//	수학 : 90.0
//
//	총점 : 270
//	평균 : 90
	public void method2() {
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		double sum = (int)(kor + eng + math);
		System.out.println("총점 : "+(int)sum);
		double avg = sum / 3;
		System.out.print("평균 : "+(int)avg);
	}
//	Class Name : com.kh.practice2.func.CastingPractice3
//	실행 클래스 : com.kh.practice2.run.Run
//
//	선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
//	주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		
		System.out.println( (double)iNum1 / iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum ); // 3
		System.out.println( (int)(iNum1 / fNum) ); // 3
		
		System.out.println( iNum1 / fNum );// 3.3333333
		System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335
		
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( (char)((int)ch + iNum1) ); // 'K'
		System.out.println( (char)(ch + iNum1) ); // 'K'
	}
}