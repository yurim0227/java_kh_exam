package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
//	메소드 명 : public void practice1(){}
//	아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//	종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
//
//	ex.
//	1. 입력
//	2. 수정
//	3. 조회
//	4. 삭제
//	7. 종료
//	메뉴 번호를 입력하세요 : 3
//	조회 메뉴입니다.
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int mNum = sc.nextInt();
		switch(mNum) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
		default:
		}
	}
//	메소드 명 : public void practice2(){}
//	키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//	짝수가 아니면 “홀수다“를 출력하세요.
//	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
//
//	ex.
//	숫자를 한 개 입력하세요 : -8
//	양수만 입력해주세요.
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		}	else if(num > 0) {
			System.out.println("홀수다");
		}	else System.out.println("양수만 입력해주세요.");
	}
//	메소드 명 : public void practice3(){}
//	국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//	합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//	(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//	합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//	불합격인 경우에는 “불합격입니다.”를 출력하세요.
//	
//	ex 1. 		ex 2.
//	국어점수 : 88 국어점수 : 88
//	수학점수 : 50 수학점수 : 50
//	영어점수 : 40 영어점수 : 45
//	불합격입니다. 	국어 : 88
//				수학 : 50
//				영어 : 45
//				합계 : 183
//				평균 : 61.0
//				축하합니다, 합격입니다!
	public void practice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		int sum = kor + math + eng;
		double avg = sum / 3;
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다, 합격입니다!");
		}	else System.out.println("불합격입니다.");
	}
//	메소드 명 : public void practice4(){}
//	수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
//
//	ex 1.
//	1~12 사이의 정수 입력 : 8
//	8월은 여름입니다.
//
//	ex 2.
//	1~12 사이의 정수 입력 : 99
//	99월은 잘못 입력된 달입니다.
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println(num+"월은 겨울입니다.");
			break;
		case 2:
			System.out.println(num+"월은 겨울입니다.");
			break;
		case 3:
			System.out.println(num+"월은 봄입니다.");
			break;
		case 4:
			System.out.println(num+"월은 봄입니다.");
			break;
		case 5:
			System.out.println(num+"월은 봄입니다.");
			break;
		case 6:
			System.out.println(num+"월은 여름입니다.");
			break;
		case 7:
			System.out.println(num+"월은 여름입니다.");
			break;
		case 8:
			System.out.println(num+"월은 여름입니다.");
			break;
		case 9:
			System.out.println(num+"월은 가을입니다.");
			break;
		case 10:
			System.out.println(num+"월은 가을입니다.");
			break;
		case 11:
			System.out.println(num+"월은 가을입니다.");
			break;
		case 12:
			System.out.println(num+"월은 겨울입니다.");
			break;
		default:
			System.out.println(num+"월은 잘못 입력된 달입니다.");
		}
	}
//	메소드 명 : public void practice5(){}
//	아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
//	로그인 성공 시 “로그인 성공”,
//	아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//	비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
//
//	ex 1. 					ex 2. 					ex 3.
//	아이디 : myId 			아이디 : myId 			아이디 : my
//	비밀번호 : myPassword12 	비밀번호 : myPassword 		비밀번호 : myPassword12
//	로그인 성공 				비밀번호가 틀렸습니다. 		아이디가 틀렸습니다.
	public void practice5() {
		String id = "myId";
		String pw = "myPassword12";
		System.out.print("아이디 : ");
		String uId = sc.next();
		System.out.print("비밀번호 : ");
		String uPw = sc.next();
		if(uId.equals(id) && uPw.equals(pw)) {
			System.out.println("로그인 성공");
		}	else if(uId.equals(id) && !(uPw.equals(pw))) {
			System.out.println("비밀번호가 틀렸습니다.");
		}	else if(!(uId.equals(id)) && uPw.equals(pw)) {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
//	메소드 명 : public void practice6(){}
//	사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//	단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//	회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//	비회원은 게시글 조회만 가능합니다.
//
//	ex.
//	권한을 확인하고자 하는 회원 등급 : 관리자
//	회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.next();
		if(grade.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		}	else if(grade.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}	else if(grade.equals("비회원")) {
			System.out.println("게시글 조회");
		}
	}
//	메소드 명 : public void practice7(){}
//	키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//	저체중/정상체중/과체중/비만을 출력하세요.
//	BMI = 몸무게 / (키(m) * 키(m))
//	BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//	BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//	BMI가 30이상일 경우 고도 비만
//
//	ex.
//	키(m)를 입력해 주세요 : 1.65
//	몸무게(kg)를 입력해 주세요 : 58.4
//	BMI 지수 : 21.45087235996327
//	정상체중
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : "+bmi);
		if(bmi < 18.5) {
			System.out.println("저체중");
		}	else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		}	else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		}	else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		}	else System.out.println("고도비만");
	}
//	메소드 명 : public void practice8(){}
//	키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
//	(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//	“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
//
//	ex.
//	피연산자1 입력 : 15
//	피연산자2 입력 : 4
//	연산자를 입력(+,-,*,/,%) : /
//	15 / 4 = 3.750000
	public void practice8() {
		Scanner scan = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		if(num1 > 0) {
			System.out.print("피연산자2 입력 : ");
			float num2 = sc.nextFloat();
			if(num2 > 0) {
				System.out.print("연산자를 입력(+,-,*,/,%) : ");
				char o = scan.nextLine().charAt(0);
				if(o == '+') {
					System.out.printf("%d + %.0f = %f\n", num1, num2, num1 + num2);
				}	else if(o == '-') {
					System.out.printf("%d - %.0f = %f\n", num1, num2, num1 - num2);
				}	else if(o == '*') {
					System.out.printf("%d * %.0f = %f\n", num1, num2, num1 * num2);
				}	else if(o == '/') {
					System.out.printf("%d / %.0f = %f\n", num1, num2, num1 / num2);
				}	else if(o == '%') {
					System.out.println(num1+" % "+num2+" = "+(num1 % num2));
				} else System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}	else System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} 	else System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		scan.close();
	}
//	메소드 명 : public void practice9(){}
//	중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
//	평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//	이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//	70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
//	
//	ex 1.
//	중간 고사 점수 : 80
//	기말 고사 점수 : 30
//	과제 점수 : 60
//	출석 회수 : 18
//	================= 결과 =================
//	중간 고사 점수(20) : 16.0
//	기말 고사 점수(30) : 9.0
//	과제 점수 (30) : 18.0
//	출석 점수 (20) : 18.0
//	총점 : 61.0
//	Fail [점수 미달]
//			
//	ex 2.
//	중간 고사 점수 : 80
//	기말 고사 점수 : 90
//	과제 점수 : 50
//	출석 회수 : 15
//	================= 결과 =================
//	중간 고사 점수(20) : 16.0
//	기말 고사 점수(30) : 27.0
//	과제 점수 (30) : 15.0
//	출석 점수 (20) : 15.0
//	총점 : 73.0
//	PASS
//	
//	ex 3.
//	중간 고사 점수 : 100
//	기말 고사 점수 : 80
//	과제 점수 : 40
//	출석 회수 : 10
//	================= 결과 =================
//	Fail [출석 회수 부족 (10/20)]
	public void practice9() {
		System.out.print("중간고사 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		int score2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		int score3 = sc.nextInt();
		System.out.print("출석 회수 : ");
		int score4 = sc.nextInt();
		System.out.println("================= 결과 =================");
		double totalScore = score1 * 0.2 + score2 * 0.3 + score3 * 0.3 + score4;
		if(totalScore >= 70) {
			if(score4 <= 20 * 0.7) {
				System.out.println("Fail [출석 회수 부족 ("+score4+"/20)]");
			}	else {
				System.out.println("중간 고사 점수(20) : "+(score1 * 0.2));
				System.out.println("기말 고사 점수(30) : "+(score2 * 0.3));
				System.out.println("과제 점수 (30) : "+(score3 * 0.3));
				System.out.println("출석 점수 (20) : "+(double)score4);
				System.out.println("총점 : "+totalScore);
				System.out.println("PASS");
			}
		}	else {
			if(score4 <= 20 * 0.7) {
				System.out.println("Fail [출석 회수 부족 ("+score4+"/20)]");
			}	else {
				System.out.println("중간 고사 점수(20) : "+(score1 * 0.2));
				System.out.println("기말 고사 점수(30) : "+(score2 * 0.3));
				System.out.println("과제 점수 (30) : "+(score3 * 0.3));
				System.out.println("출석 점수 (20) : "+(double)score4);
				System.out.println("총점 : "+totalScore);
				System.out.println("Fail [점수 미달]");
			}
		}
	}
//	메소드 명 : public void practice10(){}
//	앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
//
//	ex.
//	실행할 기능을 선택하세요.
//	1. 메뉴 출력
//	2. 짝수/홀수
//	3. 합격/불합격
//	4. 계절
//	5. 로그인
//	6. 권한 확인
//	7. BMI
//	8. 계산기
//	9. P/F
//	선택 : 4 (실습문제4 실행)
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		if(num == 1) {
			practice1();
		}	else if(num == 2) {
			practice2();
		}	else if(num == 3) {
			practice3();
		}	else if(num == 4) {
			practice4();
		}	else if(num == 5) {
			practice5();
		}	else if(num == 6) {
			practice6();
		}	else if(num == 7) {
			practice7();
		}	else if(num == 8) {
			practice8();
		}	else if(num == 9) {
			practice9();
		}	else System.out.println("다시 선택하세요.");
	}
//	메소드 명 : public void practice11(){}
//	정수를 이용해서 4자리 비밀번호를 만들려고 하는데
//	이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 ‘생성 성공’
//	중복 값이 있으면 ‘중복 값 있음‘
//	자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
//	단, 제일 앞자리 수의 값은 1~9 사이 정수
//
//	ex.
//	비밀번호 입력(1000~9999) : 56555 	비밀번호 입력(1000~9999) : 1234
//	자리수 안맞음 						성공
//	비밀번호 입력(1000~9999) : 5685
//	실패
	public void practice11() {
		try {
			System.out.print("비밀번호 입력(1000~9999) : ");
			String pw = sc.nextLine();
			char ch1 = pw.charAt(0);
			char ch2 = pw.charAt(1);
			char ch3 = pw.charAt(2);
			char ch4 = pw.charAt(3);
//			System.out.println(ch1 - '0');
			int pw2 = Integer.valueOf(pw);
			if(pw2 >= 1000 && pw2 <= 9999) {
				if(ch1 == ch2 || ch1 == ch3 || ch1 == ch4 || ch2 == ch3 || ch2 == ch4 || ch3 == ch4) {
					System.out.println("중복 값 있음");
				}	else System.out.println("생성 성공");
			}	else System.out.println("자리 수 안 맞음");
		}	catch(Exception e) {
			System.out.println("자리 수 안 맞음");
//			e.printStackTrace();
		}
	}
}