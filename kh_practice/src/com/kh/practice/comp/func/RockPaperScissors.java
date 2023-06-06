package com.kh.practice.comp.func;

import java.util.*;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);
//	메소드 명 : public void rps(){}
//	사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
//	랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
//	사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을 멈추고
//	몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
//	
//	당신의 이름을 입력해주세요 : 박신우
//	가위바위보 : 가위
//	컴퓨터 : 가위
//	박신우 : 가위
//	비겼습니다.
//	
//	가위바위보 : 가위
//	컴퓨터 : 바위
//	박신우 : 가위
//	졌습니다 ᅲᅲ
//	
//	가위바위보 :
//	보
//	컴퓨터 :
//	보
//	박신우 :
//	보
//	비겼습니다.
//
//	가위바위보 : 바위
//	컴퓨터 : 바위
//	박신우 : 바위
//	비겼습니다.
//
//	가위바위보 : 가위
//	컴퓨터 : 바위
//	박신우 : 가위
//	졌습니다 ᅲᅲ
//
//	가위바위보 :
//	보
//	컴퓨터 : 바위
//	박신우 :
//	보
//	이겼습니다!
//	
//	가위바위보 :
//	보
//	컴퓨터 : 바위
//	박신우 :
//	보
//	이겼습니다!
//	
//
//	가위바위보 : 안ᄋᄅ
//	잘못 입력하셨습니다.
//	
//	가위바위보 : 가위
//	컴퓨터 : 가위
//	박신우 : 가위
//	비겼습니다.
//	
//	가위바위보 : exit
//	8전 2승 4무 2패
	public void rps() {
		int totalCount = 0;
		int count1 = 0; // 승
		int count2 = 0;	// 무
		int count3 = 0;	// 패
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		while(true) {
			Random mRandom = new Random();
			int com = mRandom.nextInt(3)+1;
			System.out.print("가위바위보 : ");
			String human = sc.nextLine();
			if(human.equals("가위") || human.equals("바위") || human.equals("보")) {
				if(com == 1) {
					System.out.println("컴퓨터 : 가위");
					System.out.println(name+" : "+human);
					if(human.equals("가위")) {
						System.out.println("비겼습니다.");
						totalCount++;
						count2++;
					}	else if(human.equals("바위")) {
						System.out.println("이겼습니다!");
						totalCount++;
						count1++;
					}	else {
						System.out.println("졌습니다 ㅠㅠ");
						totalCount++;
						count3++;
					}
				}	else if(com == 2) {
					System.out.println("컴퓨터 : 바위");
					System.out.println(name+" : "+human);
					if(human.equals("가위")) {
						System.out.println("졌습니다 ㅠㅠ");
						totalCount++;
						count3++;
					}	else if(human.equals("바위")) {
						System.out.println("비겼습니다.");
						totalCount++;
						count2++;
					}	else {
						System.out.println("이겼습니다!");
						totalCount++;
						count1++;
					}
				}		else {
					System.out.println("컴퓨터 : 보");
					System.out.println(name+" : "+human);
					if(human.equals("가위")) {
						System.out.println("이겼습니다!");
						totalCount++;
						count1++;
					}	else if(human.equals("바위")) {
						System.out.println("졌습니다 ㅠㅠ");
						totalCount++;
						count3++;
					}	else {
						System.out.println("비겼습니다.");
						totalCount++;
						count2++;
					}
				}
			}	else if(human.equals("exit")) {
				System.out.println(totalCount+"전 "+count1+"승 "+count2+"무 "+count3+"패");
				break;
			}	else System.out.println("잘못 입력하셨습니다.");
		}
	}
}