package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	StudentController ssm = new StudentController();
	// 멤버 필드
	public StudentMenu() {
		// ========== 학생 정보 출력 ==========
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		// ========== 학생 성적 출력 ==========
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		// ========== 성적 결과 출력 ==========
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		System.out.println("========== 학생 정보 출력 ==========");
		for(int i=0; i<ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());
		}
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : "+ssm.sumScore());
		System.out.println("학생 점수 평균 : "+ssm.avgScore()[1]);
		System.out.println("========== 성적 결과 출력 ==========");
		for(int i=0; i<ssm.printStudent().length; i++) {
			if(ssm.printStudent()[i].getScore() >= ssm.CUT_LINE) {
				System.out.println(ssm.printStudent()[i].getName()+" 학생은 통과입니다.");
			}	else System.out.println(ssm.printStudent()[i].getName()+" 학생은 재시험 대상입니다.");
		}
	}
}
