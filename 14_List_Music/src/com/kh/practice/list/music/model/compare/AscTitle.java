package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{
	@Override
	public int compare(Music o, Music o2) {
		// Title의 내림차순으로 정렬하는 기준을 마련한다.
		int result = 0;
		result = o.getTitle().compareTo(o2.getTitle());
		System.out.println("compare 정렬확인: "+result+" - "+o.getTitle());
		return result;
	}
}
