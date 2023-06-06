package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private int existMemberNum;
	private Member[] strArr = new Member[5];
	
	public boolean checkId(String inputId) {
		return true;
	}
	public void insertMember(String id, String name, String password, String email,
			char gender, int age) {
	}
	public String searchId(String id) {
		return null;
	}
	public Member[] searchName(String name) {
		return strArr;
	}
	public Member[] searchEmail(String Email) {
		return strArr;
	}
	public boolean updatePassword(String id, String password) {
		return true;
	}
	public boolean updateEmail(String id, String email) {
		return true;
	}
	public boolean delete(String id) {
		return true;
	}
	public void delete() {
		
	}
	public Member[] printAll(){
		return strArr;
	}
}
