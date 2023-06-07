package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	// ArrayList 객체 생성
	private List<Music> list = new ArrayList<Music>();
	
	public MusicController() {
		//list에 초기 곡 10곡 미리 입력해두기
		list.add(new Music("aa", "aaa"));
		list.add(new Music("bb", "bbb"));
		list.add(new Music("cc", "ccc"));
		list.add(new Music("dd", "ddd"));
		list.add(new Music("aa", "eee"));
		list.add(new Music("bb", "fff"));
		list.add(new Music("cc", "aaa"));
		list.add(new Music("dd", "bbb"));
		list.add(new Music("ee", "ccc"));
		list.add(new Music("ff", "ddd"));
	}
	public int addList(Music music) {
//		****** 마지막 위치에 곡 추가 ******
	// 마지막 리스트에 객체 저장, 1 리턴
		int result = 0;	// 0:추가실패, 1:추가성공
		if( list.add(music)) {
			result = 1;
		}
		return result;
	}
	public int addAtZero(Music music) {
//		****** 첫 위치에 곡 추가 ******
	// 첫 번째 리스트에 객체 저장, 1 리턴
		int result = 0;	// 0:추가실패, 1:추가성공
		int cnt = list.size();
		((ArrayList<Music>)list).add(0, music);
		int cntAfter = list.size();
		if(cnt < cntAfter) {
//			result = 1;
			result = cntAfter-cnt;
		}
		return result;
	}
	public List<Music> printAll() {
	// List 반환
		return list;
	}
	public Music searchMusic(String title) {
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		Music result = null;
		for(Music vo : list) {
			if( vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}
		return result;
	}
	public Music removeMusic(String title) {
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		//TODO
		return null;
	}
	public Music setMusic(String title, Music music) {
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		//TODO
		return null;
	}
	public int ascTitle() {
	// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		int result = 0;
		//TODO
		return result;
	}
	public int descSinger() {
	// 리스트 가수 명 내림차순 정렬, 1 리턴
		int result = 0;
		//TODO
		return result;
	}
}
