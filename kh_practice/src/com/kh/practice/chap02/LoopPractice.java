package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
//	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//	단, 입력한 수는 1보다 크거나 같아야 합니다.
//	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//
//	ex.
//	1이상의 숫자를 입력하세요 : 4 	1이상의 숫자를 입력하세요 : 0
//	1 2 3 4 				1 이상의 숫자를 입력해주세요.
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = 1;
		if(num1 >= 1) {
			while(num2 <= num1) {
				System.out.printf("%d ", num2);
//				System.out.print(num2+" ");
				num2++;
			}
		}	else System.out.println("1 이상의 숫자를 입력해주세요.");
	}
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//	ex.
//	1이상의 숫자를 입력하세요 : 4 	1이상의 숫자를 입력하세요 : 0
//	1 2 3 4 				1 이상의 숫자를 입력해주세요.
//							1이상의 숫자를 입력하세요 : 8
//							1 2 3 4 5 6 7 8
	public void practice2() {
//		boolean b = true;
//		
//		while(b) {			
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			int num1 = sc.nextInt();
//			if(num1 < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			} else {
//				for(int num2=1; num2<=num1; num2++) {
//					System.out.print(num2 + " ");
//				}
//				b = false;
//			}
//		}
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = 1;
		while(num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num1 = sc.nextInt();
		}
		while(num2 <= num1) {
			System.out.printf("%d ", num2);
			num2++;
		}
	}
//	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//	단, 입력한 수는 1보다 크거나 같아야 합니다.
//
//	ex.
//	1이상의 숫자를 입력하세요 : 4 	1이상의 숫자를 입력하세요 : 0
//	4 3 2 1 				1 이상의 숫자를 입력해주세요.
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num >= 1) {
			for(int i=1; num>=i; num--) {
				System.out.print(num + " ");
			}
		}	else System.out.println("1 이상의 숫자를 입력해주세요.");
	}
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//	ex.
//	1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
//	4 3 2 1 1 이상의 숫자를 입력해주세요.
//	1이상의 숫자를 입력하세요 : 8
//	8 7 6 5 4 3 2 1
	public void practice4() {
		boolean b = true;
		while(b) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num >= 1) {
				for(int i=1; num>=i; num--) {
					System.out.print(num + " ");
				}
				b = false;
			}	else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
//	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
//
//	ex.
//	정수를 하나 입력하세요 : 8
//	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
			if(i < num) {
				System.out.print(i+" + ");
			}	else System.out.print(i+" = ");
		}
		System.out.println(sum);
	}
//	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//
//	ex.
//	첫 번째 숫자 : 8 	첫 번째 숫자 : 4 	첫 번째 숫자 : 9
//	두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
//	4 5 6 7 8 		4 5 6 7 8 		1 이상의 숫자를 입력해주세요.
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if(num1 >= 1 && num2 >= 1) {
			if(num1 > num2) {
				while(num2 <= num1) {
					System.out.print(num2+" ");
					num2++;
				}
			}	else if(num1 <= num2) {
				while(num1 <= num2) {
					System.out.print(num1+" ");
					num1++;
				}
			}
		}	else System.out.println("1 이상의 숫자를 입력해주세요");
	}
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//
//	ex.
//	첫 번째 숫자 : 8 	첫 번째 숫자 : 4 	첫 번째 숫자 : 9
//	두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
//	4 5 6 7 8 		4 5 6 7 8 		1 이상의 숫자를 입력해주세요.
//
//	첫 번째 숫자 : 6
//	두 번째 숫자 : 2
//	2 3 4 5 6
	public void practice7() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if(num1 >= 1 && num2 >= 1) {
			if(num1 > num2) {
				while(num2 <= num1) {
					System.out.print(num2+" ");
					num2++;
				}
			}	else if(num1 <= num2) {
				while(num1 <= num2) {
					System.out.print(num1+" ");
					num1++;
				}
			}
		}	else {
			while(true) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				System.out.print("첫 번째 숫자 : ");
				num1 = sc.nextInt();
				System.out.print("두 번째 숫자 : ");
				num2 = sc.nextInt();
				if(num1 >= 1 && num2 >= 1) {
					if(num1 > num2) {
						while(num2 <= num1) {
							System.out.print(num2+" ");
							num2++;
						}
					}	else if(num1 <= num2) {
						while(num1 <= num2) {
							System.out.print(num1+" ");
							num1++;
						}
					}
					break;
				}
			}
		}
	}
//	사용자로부터 입력 받은 숫자의 단을 출력하세요.
//
//	ex.
//	숫자 : 4
//	===== 4단 =====
//	4 * 1 = 4
//	4 * 2 = 8
//	4 * 3 = 12
//	4 * 4 = 16
//	4 * 5 = 20
//	4 * 6 = 24
//	4 * 7 = 28
//	4 * 8 = 32
//	4 * 9 = 36
	public void practice8() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.println("===="+dan+"단====");
		for(int su=1; su<=9; su++) {
			System.out.println(dan+" * "+su+" = "+(dan * su));
		}
	}
//	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//	단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
//
//	숫자 : 4 				숫자 : 10
//	===== 4단 ===== 		9 이하의 숫자만 입력해주세요.
//	===== 5단 =====
//	===== 6단 =====
//	===== 7단 =====
//	===== 8단 =====
//	===== 9단 =====
//	(해당 단의 내용들은 길이 상 생략)
	public void practice9() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		if(dan <= 9) {
			for(; dan<=9; dan++) {
				System.out.println("===="+dan+"단====");
				for(int su=1; su<=9; su++) {
					System.out.println(dan+" * "+su+" = "+(dan * su));
				}
			}
		}	else System.out.println("9 이하의 숫자만 입력해주세요");
	}
//	위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
//	“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//
//	숫자 : 4 				숫자 : 10
//	===== 4단 ===== 		9 이하의 숫자만 입력해주세요.
//	===== 5단 ===== 		숫자 : 8
//	===== 6단 ===== 		===== 8단 =====
//	===== 7단 ===== 		===== 9단 =====
//	===== 8단 =====
//	===== 9단 =====
//	(해당 단의 내용들은 길이 상 생략)
	public void practice10() {
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			if(dan <= 9) {
				for(; dan<=9; dan++) {
					System.out.println("===="+dan+"단====");
					for(int su=1; su<=9; su++) {
						System.out.println(dan+" * "+su+" = "+(dan * su));
					}
				}
				break;
			}	else System.out.println("9 이하의 숫자만 입력해주세요");
		}
	}
//	사용자로부터 시작 숫자와 공차를 입력 받아
//	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//	단, 출력되는 숫자는 총 10개입니다.
//
//	* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//	ex) 2, 7, 12, 17, 22 ...
//	5 5 5 5 => 여기서 공차는 5
//
//	ex.
//	시작 숫자 : 4
//	공차 : 3
//	4 7 10 13 16 19 22 25 28 31
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int tole = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.print(num+" ");
			num += tole;
		}
	}
//	정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//	단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//	exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//	또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//	“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//	없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//	두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
	
//	연산자(+, -, *, /, %) : +
//	정수1 : 10
//	정수2 : 4
//	10 + 4 = 14
//
//	연산자(+, -, *, /, %) : / 	연산자(+, -, *, /, %) : /
//	정수1 : 10 					정수1 : 10
//	정수2 : 4 					정수2 : 0
//	10 / 4 = 2 					0으로 나눌 수 없습니다. 다시 입력해주세요.
//	연산자(+, -, *, /, %) : ^ 	연산자(+, -, *, /, %) : exit
//	정수1 : 10 					프로그램을 종료합니다.
//	정수2 : 4
//	없는 연산자입니다. 다시 입력해주세요.
	public void practice12() {
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String o = sc.nextLine();
			if(!(o.equals("+")) && !(o.equals("-")) && !(o.equals("*")) && !(o.equals("/")) 
					&& !(o.equals("%")) && !(o.equals("exit"))) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}	else if(o.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}	else {
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();
				if(o.equals("/") && num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				}	else if(o.equals("+")) {
					System.out.println(num1+" "+o+" "+num2+" = "+(num1 + num2));
				}	else if(o.equals("-")) {
					System.out.println(num1+" "+o+" "+num2+" = "+(num1 - num2));
				}	else if(o.equals("*")) {
					System.out.println(num1+" "+o+" "+num2+" = "+(num1 * num2));
				}	else if(o.equals("/")) {
					System.out.println(num1+" "+o+" "+num2+" = "+(num1 / num2));
				}	else if(o.equals("%")) {
					System.out.println(num1+" "+o+" "+num2+" = "+(num1 % num2));
				}
				break;
			}
		}
	}
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 4
//	*
//	**
//	***
//	****
	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 4
//	****
//	***
//	**
//	*
	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	메소드 명 : public void practice015(){}
//	사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//	단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//
//	* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//	ex) 2, 3, 5, 7, 11 ...
//
//	ex.
//	숫자 : 5 		숫자 : 9 			숫자 : 0
//	소수입니다. 	소수가 아닙니다. 	잘못 입력하셨습니다.
	public void practice15() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count = 0;
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}	else {
			for(int i=1; i<=num; i++) {
				if(num % i == 0) {
					count += 1;
				}
			}
			if(count == 2) {
				System.out.println("소수입니다.");
			}	else System.out.println("소수가 아닙니다.");
		}
	}
//	메소드 명 : public void practice16 (){}
//	위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
//	“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
//
//	* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//	ex) 2, 3, 5, 7, 11 ...
//
//	ex.
//	숫자 : 5 		숫자 : 9 			숫자 : 0
//	소수입니다. 	소수가 아닙니다. 	잘못 입력하셨습니다.
//
//	숫자 : 13
//	소수입니다.
	public void practice16() {
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			int count = 0;
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다.");
			}	else {
				for(int i=1; i<=num; i++) {
					if(num % i == 0) {
						count += 1;
					}
				}
				if(count == 2) {
					System.out.println("소수입니다.");
				}	else System.out.println("소수가 아닙니다.");
				break;
			}
		}
	}
//	메소드 명 : public void practice17(){}
//	2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//	단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//
//	ex.
//	숫자 : 11
//	2 3 5 7 11
//	2부터 11까지 소수의 개수는 5개입니다.
	public void practice17() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count = 0;
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}	else {
			for(int i=1; i<=num; i++) {
				int k = i;
				for(int j=2; j<=i ;) {
					if(i == 2) {
						break;
					}
					if(i % j == 0) {
						k = 1;
						break;
					}
					break;
				}
				for(int j=3; j<=i ;) {
					if(i == 3) {
						break;
					}
					if(i % j == 0) {
						k = 1;
						break;
					}
					break;
				}
				if(k!=1) {
					System.out.print(k+" ");
					count += 1;
				}
			}
			System.out.println();
			System.out.println("2부터 "+num+"까지 소수의 개수는 "+count+"개입니다.");
		}
	}
//	메소드 명 : public void practice18(){}
//	1부터 사용자에게 입력 받은 수까지 중에서
//	1) 2와 3의 배수를 모두 출력하고
//	2) 2와 3의 공배수의 개수를 출력하세요.
//
//	* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//	모두 나머지가 0이 나오는 수
//
//	ex.
//	자연수 하나를 입력하세요 : 15
//	2 3 4 6 8 9 10 12 14 15
//	count : 2
	public void practice18() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		int arrayCount = 0;
		int array [] = new int[num];
//		int gcf = 0;
//		for(int i=1; i<=3; i++) {
//			if(2 % i == 0 && 3 % i ==0) {
//				gcf = i;
//			}
//		}
//		int lcm = 2 * 3 / gcf;
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				array[arrayCount] = i;
				count++;
				arrayCount++;
			}	else if(i % 2 == 0) {
				array[arrayCount] = i;
				arrayCount++;
			}	else if(i % 3 == 0) {
				array[arrayCount] = i;
				arrayCount++;
			}
		}
		for(int i=0; i<=(arrayCount-1); i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("count : "+count);
	}
//	메소드 명 : public void practice19(){}
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 4
//	   *
//	  **
//	 ***
//	****
	public void practice19() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int star = 1;
		int gap = num - 1;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=gap; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
			gap--;
		}
	}
//	메소드 명 : public void practice20(){}
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 3
//	*
//	**
//	***
//	**
//	*
	public void practice20() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	메소드 명 : public void practice21(){}
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 4
//	   *
//	  ***
//	 *****
//	*******
	public void practice21() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i<=num-1; i++) {
			int k = i;
			for(int j=num-2; j>=k; j--) {
				System.out.print(" ");
			}
			for(int l=0; l<k*2+1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	메소드 명 : public void practice22(){}
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 5
//	*****
//	* 	*
//	* 	*
//	* 	*
//	*****
	public void practice22() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int gap = num - 2;
		for(int i=1; i<=num; i++) {
			if(i == 1 || i == num) {
				for(int j=1; j<=num; j++) {
					System.out.print("*");
				}
			}	else {
				System.out.print("*");
				for(int j=1; j<=gap; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}