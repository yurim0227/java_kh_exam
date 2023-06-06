package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	
//	메소드 명 : public void practice1(){}
//	3행 3열짜리 문자열 배열을 선언 및 할당하고
//	인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
//
//	ex.
//	(0, 0)(0, 1)(0, 2)
//	(1, 0)(1, 1)(1, 2)
//	(2, 0)(2, 1)(2, 2)
	public void practice1() {
		String[][] strArr = new String[3][3];
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				strArr[i][j] = "("+i+", "+j+")";
				System.out.print(strArr[i][j]);
			}
			System.out.println();
		}
//		System.out.println(Arrays.deepToString(strArr));
	}
//	메소드 명 : public void practice2(){}
//	4행 4열짜리 정수형 배열을 선언 및 할당하고
//	1) 1 ~ 16까지 값을 차례대로 저장하세요.
//	2) 저장된 값들을 차례대로 출력하세요.
//
//	ex.
//	1 2 3 4
//	5 6 7 8
//	9 10 11 12
//	13 14 15 16
	public void practice2() {
		String[][] strArr = new String[4][4];
		int count = 1;
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				strArr[i][j] = count + " ";
				System.out.print(strArr[i][j]);
				count++;
			}
			System.out.println();
		}
	}
//	메소드 명 : public void practice3(){}
//	4행 4열짜리 정수형 배열을 선언 및 할당하고
//	1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//	2) 저장된 값들을 차례대로 출력하세요.
//
//	ex.
//	16 15 14 13
//	12 11 10 9
//	8 7 6 5
//	4 3 2 1
	public void practice3() {
		String[][] strArr = new String[4][4];
		int count = 16;
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				strArr[i][j] = count + " ";
				System.out.print(strArr[i][j]);
				count--;
			}
			System.out.println();
		}
	}
//	메소드 명 : public void practice4(){}
//	4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//	아래의 내용처럼 처리하세요.
//
//	ex.
//	6 	6 	1 	13
//	4 	10 	8 	22
//	8 	6 	5 	19
//	18 	22 	14 	108
	public void practice4() {
		int[][] iArr = new int[4][4];
		Random mRandom = new Random();
		for(int i=0; i<iArr.length-1; i++) {
			for(int j=0; j<iArr[i].length-1; j++) {
				int num = mRandom.nextInt(10)+1;
				iArr[i][j] = num;
				iArr[iArr.length-1][j] += iArr[i][j];
				iArr[i][iArr.length-1] += iArr[i][j];
				iArr[iArr.length-1][iArr.length-1] += iArr[i][j];
				iArr[iArr.length-1][iArr.length-1] += iArr[i][j];
			}
		}
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j]+" ");
			}
			System.out.println();
		}
	}
//	메소드 명 : public void practice5(){}
//	2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
//	“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//	크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//	(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
//
//	ex.
//	행 크기 : 5
//	열 크기 : 4
//	T P M B
//	U I H S
//	Q M B H
//	H B I X
//	G F X I
	public void practice5() {
		int mRandom = 0;
		while(true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			if(row >= 1 && row <= 10) {
				while(true) {
					System.out.print("열 크기 : ");
					int column = sc.nextInt();
					if(column >= 1 && column <= 10) {
						int[][] iArr = new int[row][column];
						for(int i=0; i<iArr.length; i++) {
							for(int j=0; j<iArr[i].length; j++) {
								mRandom = (int)((Math.random()*(90-64)+1)+64);
								iArr[i][j] = mRandom;
								System.out.print((char)iArr[i][j]+" ");
							}
							System.out.println();
						}
					} else {
						System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
						continue;
					}	break;
				}
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}	break;
		}
	}
//	메소드 명 : public void practice6(){}
//	String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
//	"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
//
//	위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제4 흐름’과 같은 방식으로 출력하세요.
//	단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"}, {"원", "열", "니", "로", "시"},
			{"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			for(int i=0; i<strArr.length; i++) {
				for(int j=0; j<strArr[i].length; j++) {
					System.out.print(strArr[j][i]+" ");
				}
			}
	}
//	메소드 명 : public void practice7(){}
//	사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
//	문자형 가변 배열을 선언 및 할당하세요.
//	그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
//
//	ex.
//	행의 크기 : 4
//	0행의 열 크기 : 2
//	1행의 열 크기 : 6
//	2행의 열 크기 : 3
//	3행의 열 크기 : 5
//	a b
//	c d e f g h
//	i j k
//	l m n o p
	public void practice7() {
		int iArr[][];
		int num = 97;
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		iArr = new int[row][];
		for(int i=0; i<row; i++) {
			System.out.print(i+"행의 열 크기 : ");
			int column = sc.nextInt();
			iArr[i] = new int[column];
		}
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				iArr[i][j] = num++;
				System.out.print((char)iArr[i][j]+" ");
			}
			System.out.println();
		}
	}
//	메소드 명 : public void practice8(){}
//	1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
//	2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
//	1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
//
//	<출석부>
//	1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
//	7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
//	
//	메소드 명 : public void practice8(){}
//	ex.
//	== 1분단 ==
//	강건강 남나나
//	도대담 류라라
//	문미미 박보배
//	== 2분단 ==
//	송성실 윤예의
//	진재주 차천축
//	피풍표 홍하하
	public void practice8() {
		int value1 = 0;
		int value2 = 6;
		String strArr1[] = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String strArr2[][] = new String[3][2];
		String strArr3[][] = new String[3][2];
		System.out.println("== 1분단 ==");
		for(int i=0; i<strArr2.length; i++) {
			for(int j=0; j<strArr2[i].length; j++) {
				strArr2[i][j] = strArr1[value1];
				value1++;
				System.out.print(strArr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<strArr3.length; i++) {
			for(int j=0; j<strArr3[i].length; j++) {
				strArr3[i][j] = strArr1[value2];
				value2++;
				System.out.print(strArr3[i][j]+" ");
			}
			System.out.println();
		}
	}
//	메소드 명 : public void practice9(){}
//	위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
//	해당 학생이 어느 자리에 앉았는지 출력하세요.
//
//	ex.
//	== 1분단 ==
//	강건강 남나나
//	도대담 류라라
//	문미미 박보배
//	== 2분단 ==
//	송성실 윤예의
//	진재주 차천축
//	피풍표 홍하하
//	============================
//	검색할 학생 이름을 입력하세요 : 차천축
//	검색하신 차천축 학생은 2분단 두 번째 줄 오른쪽에 있습니다.
	public void practice9() {
		int value1 = 0;
		int value2 = 6;
		String strArr1[] = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String strArr2[][] = new String[3][2];
		String strArr3[][] = new String[3][2];
		System.out.println("== 1분단 ==");
		for(int i=0; i<strArr2.length; i++) {
			for(int j=0; j<strArr2[i].length; j++) {
				strArr2[i][j] = strArr1[value1];
				value1++;
				System.out.print(strArr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<strArr3.length; i++) {
			for(int j=0; j<strArr3[i].length; j++) {
				strArr3[i][j] = strArr1[value2];
				value2++;
				System.out.print(strArr3[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		for(int i=0; i<strArr2.length; i++) {
			for(int j=0; j<strArr2[i].length; j++) {
				if(name.equals(strArr2[i][j])) {
					if(j == 0) {
						System.out.print("검색하신 "+name+" 학생은 1분단 "+(i+1)+"번째 줄 왼쪽에 있습니다.");
					}	else	{
						System.out.print("검색하신 "+name+" 학생은 1분단 "+(i+1)+"번째 줄 오른쪽에 있습니다.");
					}
				}	else {
					for(int k=0; k<strArr3.length; k++) {
						for(int l=0; l<strArr3[i].length; l++) {
							if(name.equals(strArr3[k][l])) {
								if(l == 0) {
									System.out.print("검색하신 "+name+" 학생은 2분단 "+(k+1)+"번째 줄 왼쪽에 있습니다.");
									return;
								}	else	{
									System.out.print("검색하신 "+name+" 학생은 2분단 "+(k+1)+"번째 줄 오른쪽에 있습니다.");
									return;
								}
							}
						}
					}
				}
			}
		}
	}
//	메소드 명 : public void practice10(){}
//	String 2차원 배열 6행 6열을 만들고 행의 맨 위와 열의 맨 앞은 각 인덱스를 저장하세요.
//	그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
//
//	ex.
//	행 인덱스 입력 : 4
//	열 인덱스 입력 : 2
//		0 1 2 3 4
//	0
//	1
//	2
//	3
//	4 		X
	public void practice10() {
		String strArr[][] = new String[6][6];
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			if(row >= 0 && row <= 5) {
				while(true) {
					System.out.print("열 인덱스 입력 : ");
					int column = sc.nextInt();
					if(column >= 0 && column <= 5) {
						System.out.print("  ");
						for(int i=0; i<strArr.length-1; i++) {
							System.out.print(i+" ");
						}
						System.out.println();
						for(int i=0; i<strArr.length-1; i++) {
							System.out.print(i+" ");
							for(int j=0; j<strArr[i].length-1; j++) {
								if(i == row && j == column) {
									strArr[row][column] = "X";
									System.out.print(strArr[i][j]+" ");
								} else {					
									strArr[i][j] = " ";
									System.out.print(strArr[i][j]+" ");
								}
							}
							System.out.println();
						}
					} else {
						System.out.println("잘못 입력했습니다.");
						continue;
					}	break;
				}
			} else {
				System.out.println("잘못 입력했습니다.");
				continue;
			}	break;
		}
	}
//	메소드 명 : public void practice11(){}
//	실습문제10과 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
//
//	ex.
//	행 인덱스 입력 : 2 		행 인덱스 입력 : 3
//	열 인덱스 입력 : 2 		열 인덱스 입력 : 1
//		0 1 2 3 4 			0 1 2 3 4
//	0 					0
//	1 					1
//	2 		X 			2 		X
//	3 					3 	  X
//	4 					4
//
//	행 인덱스 입력 >> 99
//	프로그램 종료
	public void practice11() {
		String strArr[][] = new String[6][6];
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			if(row == 99) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			while(true) {
				if(row >= 0 && row <= 5) {
					while(true) {
						System.out.print("열 인덱스 입력 : ");
						int column = sc.nextInt();
						if(column >= 0 && column <= 5) {
							System.out.print("  ");
							for(int i=0; i<strArr.length-1; i++) {
								System.out.print(i+" ");
							}
							System.out.println();
							for(int i=0; i<strArr.length-1; i++) {
								System.out.print(i+" ");
								for(int j=0; j<strArr[i].length-1; j++) {
									if(i == row && j == column) {
										strArr[row][column] = "X";
										System.out.print(strArr[i][j]+" ");
									} else {					
										strArr[i][j] = " ";
										System.out.print(strArr[i][j]+" ");
									}
								}
								System.out.println();
							}
						} else {
							System.out.println("잘못 입력했습니다.");
							continue;
						}	break;
					}
				} else {
					System.out.println("잘못 입력했습니다.");
					continue;
				}	break;
			}
		}
	}
}
