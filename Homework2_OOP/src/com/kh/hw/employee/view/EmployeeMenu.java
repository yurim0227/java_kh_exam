package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	// 멤버 필드

	public EmployeeMenu() {
		// 1. 사원 추가 ==> insertEmp()
		// 2. 사원 수정 ==> updateEmp()
		// 3. 사원 삭제 ==> deleteEmp()
		// 4. 사원 출력 ==> printEmp()
		// 9. 프로그램 종료 ==> “프로그램을 종료합니다.” 출력 후 프로그램 종료
		// 메뉴 번호를 누르세요 :
		// 번호를 잘못 입력했으면 잘못 입력했다는 안내가 뜸
		
		boolean b = true;
		while(b) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				insertEmp();
				break;
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("번호를 잘못 입력했습니다.");
			}
		}
	}

	public void insertEmp() {
		// 사원 번호 :
		// 사원 이름 :
		// 사원 성별 :
		// 전화 번호 :
		// 추가 정보를 더 입력하시겠습니까?(y/n) :
		// 추가적인 정보를 더 입력한다고 했을 시(y 또는 Y)
		// 사원부서, 사원 연봉, 보너스 율을 추가로 더 받고
		// 모든 데이터를 EmployeeController의 add메소드 인자로 보냄
		// 추가정보를 입력하지 않겠다고 하면 기본정보만 add메소드 인자로 보냄
		boolean b = true;
		while(b) {
			System.out.print("사원 번호 : ");
			int empNo = sc.nextInt();
			System.out.print("사원 이름 : ");
			String name = sc.next();
			System.out.print("사원 성별 : ");
			char gender = sc.next().charAt(0);
			System.out.print("전화 번호 : ");
			String phone = sc.next();
			System.out.print("추가 정보를 더 입력하시겠습니까? (y/n) : ");
			char answer = sc.next().charAt(0);
			if(answer == 'y') {
				System.out.print("사원 부서 : ");
				String dept = sc.next();
				System.out.print("사원 연봉 : ");
				int salary = sc.nextInt();
				System.out.print("보너스 율 : ");
				double bonus = sc.nextDouble();
				ec.add(empNo, name, gender, phone, dept, 
						salary, bonus);
				b = false;
			}	else if(answer == 'n') {
				ec.add(empNo, name, gender, phone);
				b = false;
			}	else {
				System.out.println("잘못 입력했습니다.");
				b = false;
			}
		}
	}

	public void updateEmp() {
		// 가장 최신의 사원 정보를 수정하게 됩니다.
		// 사원의 어떤 정보를 수정하시겠습니까?
		// 1. 전화번호
		// 2. 사원 연봉
		// 3. 보너스 율
		// 9. 돌아가기
		// 메뉴 번호를 누르세요 :
		// 사용자가 수정하고 싶은 내용에 대한 번호를 입력하면
		// 수정할 XXX : 라고 안내문을 출력 후 사용자에게 값을 받고
		// 받은 값을 EmployeeController의 modify() 인자로 넣어 전달
		// 9번을 입력하면 “메인메뉴로 돌아갑니다” 출력 후 메인 메뉴로
		// 잘못 입력할 경우 “잘못 입력하셨습니다.” 출력 후 메인메뉴로
		
		boolean b = true;
		while(b) {
			System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화번호");
			System.out.println("2. 사원 연봉");
			System.out.println("3. 보너스 율");
			System.out.println("9. 돌아가기");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.print("수정할 전화번호 : ");
				String phone = sc.next();
				ec.modify(phone);
				b = false;
				break;
			case 2:
				System.out.print("수정할 사원 연봉 : ");
				int salary = sc.nextInt();
				ec.modify(salary);
				b = false;
				break;
			case 3:
				System.out.print("수정할 보너스 율 : ");
				double bonus = sc.nextDouble();
				ec.modify(bonus);
				b = false;
				break;
			case 9:
				System.out.println("메인메뉴로 돌아갑니다.");
				b = false;
				break;
			default:
				System.out.println("번호를 잘못 입력했습니다.");
				b = false;
			}
		}
	}
	
	public void deleteEmp(){
		// 정말 삭제할 것인지 물어본 후 삭제하겠다고 하면
		// EmployeeController의 remove()메소드를 호출하여 반환 값에 따라
		// 데이터 삭제에 실패하였는지 성공하였는지 출력
		
		boolean b = true;
		while(b) {
			System.out.print("정말 삭제하시겠습니까? (y/n) : ");
			char answer = sc.next().charAt(0);
			if(answer == 'y') {
				ec.remove();
				b = false;
			}	else if(answer == 'n') {
				System.out.println("메인메뉴로 돌아갑니다.");
				b = false;
			}	else {
				System.out.println("잘못 입력했습니다.");
				b = false;
		}
	}
}
	public void printEmp(){
		// 사원정보가 있다면 사원정보 출력, 없다면 “사원 데이터가 없습니다”출력
		if(ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다.");
		}	else System.out.println(ec.inform());
	}
}
