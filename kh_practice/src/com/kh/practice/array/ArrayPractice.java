package com.kh.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
//	메소드 명 : public void practice1(){}
//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//	순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//
//	ex.
//	1 2 3 4 5 6 7 8 9 10
	public void practice1() {
		int[] iArr = new int[10];
		for(int i=0; i<iArr.length; i++) {
			System.out.print((i+1)+" ");
		}
	}
//	메소드 명 : public void practice2(){}
//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//	역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//
//	ex.
//	10 9 8 7 6 5 4 3 2 1
	public void practice2() {
		int[] iArr = new int[10];
		for(int i=iArr.length; i>0; i--) {
			System.out.print(i+" ");
		}
	}
//	메소드 명 : public void practice3(){}
//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//	ex.
//	양의 정수 : 5
//	1 2 3 4 5
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] iArr = new int[num];
		for(int i=0; i<iArr.length; i++) {
			System.out.print((i+1)+" ");
		}
	}
//	메소드 명 : public void practice4(){}
//	길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//	배열 인덱스를 활용해서 귤을 출력하세요.
//
//	ex.
//	귤
	public void practice4() {
		String[] strArr = new String[] {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(strArr[1]);
	}
//	메소드 명 : public void practice5(){}
//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//	ex.
//	문자열 : application
//	문자 : i
//	application에 i가 존재하는 위치(인덱스) : 4 8
//	i 개수 : 2
	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		char[] chArr = new char[str.length()];
		int[] idx = new int[str.length()];
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			chArr[i] = str.charAt(i);
			if(ch == chArr[i]) {
				idx[count] = i;
				count++;
			}
		}
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
		for(int i=0; i<count; i++) {
			System.out.print(idx[i]+" ");
		}
		System.out.println();
		System.out.println(ch+" 개수 : "+count);
	}
//	메소드 명 : public void practice6(){}
//	“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//	범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//
//	ex.
//	0 ~ 6 사이 숫자 입력 : 4 	0 ~ 6 사이 숫자 입력 : 7
//	금요일 					잘못 입력하셨습니다.
	public void practice6() {
		char[] chArr = new char[] {'월', '화', '수', '목', '금', '토', '일'};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num < 0 || num >= chArr.length) {
			System.out.println("잘못 입력하셨습니다.");
		}	else System.out.println(chArr[num]+"요일");
	}
//	메소드 명 : public void practice7(){}
//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//
//	ex.
//	정수 : 5
//	배열 0번째 인덱스에 넣을 값 : 4
//	배열 1번째 인덱스에 넣을 값 : -4
//	배열 2번째 인덱스에 넣을 값 : 3
//	배열 3번째 인덱스에 넣을 값 : -3
//	배열 4번째 인덱스에 넣을 값 : 2
//	4 -4 3 -3 2
//	총 합 : 2
	public void practice7() {
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		int[] iArr = new int[num1];
		int sum = 0;
		for(int i=0; i<iArr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();
			iArr[i] = num2;
			sum += iArr[i];
		}
//		System.out.println(Arrays.toString(iArr));
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i]+" ");
		}
		System.out.println();
		System.out.println("총합 : "+sum);
	}
//	메소드 명 : public void practice8(){}
//	3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요.
//
//	ex.
//	정수 : 4
//	다시 입력하세요.
//	정수 : -6
//	다시 입력하세요.
//	정수 : 5
//	1, 2, 3, 2, 1
	public void practice8() {
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int count = 0;
			if(num >= 3 && !(num % 2 == 0)) {
				int[] iArr = new int[num];
				for(int i=0; i<iArr.length; i++) {
					if(i <= iArr.length / 2) {
						count++;
						System.out.print(count+", ");
					} else {
						count--;
						if(i == iArr.length-1) {
							System.out.println(count);
						}	else System.out.print(count+", ");
					}
				}
				break;
			}	else System.out.println("다시 입력하세요.");
		}
	}
//	메소드 명 : public void practice9(){}
//	사용자가 입력한 값이 배열에 있는지 검색하여
//	있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//	단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//
//	ex.
//	치킨 이름을 입력하세요 : 양념 	치킨 이름을 입력하세요 : 불닭
//	양념치킨 배달 가능 			불닭치킨은 없는 메뉴입니다.
	public void practice9() {
		String[] strArr = new String[] {"후라이드","양념","간장"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.next();
		int count = 0;
		for(int i=0; i<strArr.length; i++) {
			if(str.equals(strArr[i])) {
				System.out.println(str+"치킨 배달 가능");
				count++;
				break;
			}	
		}
		if(count == 0) {
			System.out.println(str+"치킨은 없는 메뉴입니다.");
		}
	}
//	메소드 명 : public void practice10(){}
//	주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//	단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//
//	ex.
//	주민등록번호(-포함) : 123456-1234567
//	123456-1******
	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] chArr = new char[str.length()];
		for(int i=0; i<chArr.length; i++) {
			if(i < 8) {
				chArr[i] = str.charAt(i);
				System.out.print(chArr[i]);
			}	else System.out.print("*");
		}
	}
//	메소드 명 : public void practice11(){}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//
//	ex.
//	9 7 6 2 5 10 7 2 9 6
	public void practice11() {
		int[] iArr = new int[10];
		for(int i=0; i<iArr.length; i++) {
			Random mRandom = new Random();
			int num = mRandom.nextInt(10)+1;
			System.out.print(num+" ");
		}
	}
//	메소드 명 : public void practice12(){}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//
//	ex.
//	5 3 2 7 4 8 6 10 9 10
//	최대값 : 10
//	최소값 : 2
	public void practice12() {
		int[] iArr = new int[10];
		Random mRandom = new Random();
		int max = 0;
		int min = 11;
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = mRandom.nextInt(10)+1;
			System.out.print(iArr[i]+" ");
			if(iArr[i] > max) {
				max = iArr[i];
			}
			if(iArr[i] < min) {
				min = iArr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
//	메소드 명 : public void practice13(){}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//
//	ex.
//	4 1 3 6 9 5 8 10 7 2
	public void practice13() {
		Random mRandom = new Random();
		int[] iArr = new int[10];
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = mRandom.nextInt(10)+1;
			for(int j=0; j<i; j++) {
				if(iArr[i] == iArr[j]) {
					i--;
				}
			}
		}
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i]+" ");
		}
	}
//	메소드 명 : public void practice14(){}
//	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
//
//	ex.
//	3 4 15 17 28 40
	public void practice14() {
		Random mRandom = new Random();
		int[] iArr = new int[6];
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = mRandom.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(iArr[i] == iArr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(iArr);
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i]+" ");
		}
	}
//	메소드 명 : public void practice15(){}
//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//	문자의 개수와 함께 출력하세요.
//
//	ex.
//	문자열 : application
//	문자열에 있는 문자 : a, p, l, i, c, t, o, n
//	문자 개수 : 8
	public void practice15() {
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] chArr = new char[str.length()];
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = str.charAt(i);
			if(i == chArr.length-1) {
				System.out.print(chArr[i]);
			}	else System.out.print(chArr[i]+", ");
			count++;
			for(int j=0; j<i; j++) {
				if(chArr[i] == chArr[j]) {
					count--;
				}
			}
		}
		System.out.println();
		System.out.println("문자 개수 : "+count);
	}
//	메소드 명 : public void practice16(){}
//	사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
//	
//	ex.
//	배열의 크기를 입력하세요 : 3
//	1번째 문자열 : 자바의 정석
//	2번째 문자열 : 알고리즘
//	3번째 문자열 : C프로그래밍
//	더 값을 입력하시겠습니까?(Y/N) : y
//	더 입력하고 싶은 개수 : 2
//	4번째 문자열 : 인간관계
//	5번째 문자열 : 자기계발
//	더 값을 입력하시겠습니까?(Y/N) : y
//	더 입력하고 싶은 개수 : 1
//	6번째 문자열 : 영단어600
//	더 값을 입력하시겠습니까?(Y/N) : n
//	[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		int count = 1;
		String str = null;
		ArrayList<String> strList = new ArrayList<>();
		for(int i=0; i<num1; i++) {
			System.out.print(count+"번째 문자열 : ");
			str = sc.nextLine();
			strList.add(str);
			count++;
			
		}
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char answer = sc.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num2 = sc.nextInt();
				sc.nextLine();
				for(int i=0; i<num2; i++) {
					System.out.print(count+"번째 문자열 : ");
					str = sc.nextLine();
					strList.add(str);
					count++;
				}
			}	else if(answer == 'N' || answer == 'n') {
				System.out.print("[");
				for(int i=0; i<strList.size(); i++) {
					if(i == strList.size()-1) {
						System.out.print(strList.get(i));
					}	else System.out.print(strList.get(i)+", ");
				}
				System.out.print("]");
				break;
			}	else {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
