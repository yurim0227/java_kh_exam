package com.kh.practice.list.music.run;

import com.kh.practice.list.music.view.MusicView;

public class Run {

	public static void main(String[] args) {
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 1
//		****** 마지막 위치에 곡 추가 ******
//		곡 명 : 소우주
//		가수 명 : 방탄소년단
//		추가 성공
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 2
//		****** 첫 위치에 곡 추가 ******
//		곡 명 : 작은 것들을 위한 시
//		가수 명 : 방탄소년단
//		추가 성공
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 3
//		****** 전체 곡 목록 출력 ******
//		[방탄소년단 - 작은 것들을 위한 시, 방탄소년단 - 소우주]
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 1
//		****** 마지막 위치에 곡 추가 ******
//		곡 명 : 주저하는 연인들을 위해
//		가수 명 : 잔나비
//		추가 성공
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 3
//		****** 전체 곡 목록 출력 ******
//		[방탄소년단 - 작은 것들을 위한 시, 방탄소년단 - 소우주, 잔나비 - 주저하는 연인들을 위해]
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 4
//		****** 특정 곡 검색 ******
//		검색할 곡 명 : 소우주
//		방탄소년단 - 소우주
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 5
//		****** 특정 곡 삭제 ******
//		삭제할 곡 명 : 소우주
//		방탄소년단 - 소우주을(를) 삭제했습니다.
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 6
//		****** 특정 곡 수정 ******
//		검색할 곡 명 : 작은 것들을 위한 시
//		수정할 곡 명 : 작은 것
//		수정할 가수 명 : 방탄소년단
//		방탄소년단 - 작은 것들을 위한 시가 값이 변경되었습니다.
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 3
//		****** 전체 곡 목록 출력 ******
//		[방탄소년단 - 작은 것, 잔나비 - 주저하는 연인들을 위해]
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 7
//		정렬 성공
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 3
//		****** 전체 곡 목록 출력 ******
//		[방탄소년단 - 작은 것, 잔나비 - 주저하는 연인들을 위해]
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 8
//		정렬 성공
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 3
//		****** 전체 곡 목록 출력 ******
//		[잔나비 - 주저하는 연인들을 위해, 방탄소년단 - 작은 것]
//		=====***** 메인 메뉴 *****=====
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 수정
//		7. 곡 명 오름차순 정렬
//		8. 가수 명 내림차순 정렬
//		9. 종료
//		메뉴 번호 입력 : 9
//		프로그램 종료
		String a = "김가";
		String b = "김나";
//		int  result = a.compareTo(b)*-1;
//		System.out.println(result);
		int result = a.compareTo(b);
		System.out.println(result);
		
		new MusicView().mainMenu();
	}

}
