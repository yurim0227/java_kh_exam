package com.kh.practice.list.music.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	// ArrayList 객체 생성
	private List<Music> list = new ArrayList<Music>();
	
	public MusicController() {
		//music.txt 파일에서 읽어서 list에 추가하여 초기화 함.
		//filePath에 list의 Music 객체들을 저장함.
		String filePath = "music.txt";
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
				){
			list = (List<Music>)ois.readObject();
			System.out.println(list);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//list에 초기 곡 10곡 미리 입력해두기
//		list.add(new Music("aa", "aaa"));
//		list.add(new Music("bb", "bbb"));
//		list.add(new Music("cc", "ccc"));
//		list.add(new Music("dd", "ddd"));
//		list.add(new Music("aa", "eee"));
//		list.add(new Music("bb", "fff"));
//		list.add(new Music("cc", "aaa"));
//		list.add(new Music("dd", "bbb"));
//		list.add(new Music("ee", "ccc"));
//		list.add(new Music("ff", "ddd"));
		
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
			if( vo.getTitle().equals(title)) {	// title이 같은 것을 찾아
				result = vo;	// 찾은 Music 객체vo를 return 하면 됨.
				break;
			}
		}
		return result;
	}
	public Music removeMusic(String title) {
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		Music result = null;
		for(Music vo : list) {
			if( vo.getTitle().equals(title)) {	// title이 같은 것을 찾아
				list.remove(vo);
				result = vo;	// 찾은 Music 객체vo를 return 하면 됨.
				break;
			}
		}
		return result;
	}
	public Music setMusic(String title, Music music) {
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		Music result = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				result = list.get(i);
				list.set(i, music);
				break;
			}
		}
//		for(Music vo : list) {
//			if( vo.getTitle().equals(title)) {	// title이 같은 것을 찾아
//				result = vo;	// 찾은 Music 객체vo를 return 하면 됨.
//				// 불가 vo = music;	// vo는 for문의 새로운 지역변수로 list와는 무관한 공간임
//				int findIdx = list.indexOf(vo);
//				list.set(findIdx, music);
//				break;
//			}
//		}
		return result;
	}
	public int ascTitle() {
	// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		int result = 0;
		try {
			for(int i = 0; i < list.size() - 1; i++) {
				for(int j = 0; j <  list.size() - 1 - i; j++) {
					if(list.get(j).getTitle().compareTo(list.get(j+1).getTitle()) > 0) {	// 오름차순
						// SWAP
						Music tmp = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, tmp);
					}
				}
			}
			result = 1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int descSinger() {
	// 리스트 가수 명 내림차순 정렬, 1 리턴
		// 착각하지 말자 list 에서 singer는 없다. list의 1개 객체에서 singer가 있다.
		//list.get(0).getSinger();
		int result = 0;
		try {
			for(int i = 0; i < list.size() - 1; i++) {
				for(int j = 0; j <  list.size() - 1 - i; j++) {
					if(list.get(j).getSinger().compareTo(list.get(j+1).getSinger()) < 0) {	// 내림차순
						// 정렬기준은 list의 Music 형태의 객체 중 singer 값으로 비교함.
						// SWAP // list에 있는 Music형태의 객체를 swap
						Music tmp = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, tmp);
						result = 1;
					}
				}
			}
			result = 1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int ascTitle2() {
		int result = 1;
//		ArrayList arrlist =  new ArrayList<Music>();
//		arrlist.add(new Music("a","vb"));
//		list.removeAll(arrlist);
		// void java.util.Collections.sort(List<Music> list, Comparator<> super Music> c)
		try {
			Collections.sort(list, new AscTitle());
		}catch(Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
	public int descSinger2() {
		int result = 1;
		try {
			Collections.sort(list);
		}catch(Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
	
	public int saveFile(String filePath) {
		int result = 0;	// 0 : 저장실패, 1: 저장성공
		
		//filePath에 list의 Music 객체들을 저장함.
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		BufferedOutputStream bos = null;
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
				){
//			fos = new FileOutputStream(filePath);
//			oos = new ObjectOutputStream(fos);
//			bos = new BufferedOutputStream(oos);
//			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
			oos.writeObject(list);
			oos.flush();
			result = 1;
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
//		} finally {
//			try {
//				if(oos!=null) oos.close();
//				//if(bos!=null) bos.close();
//				//if(fos!=null) fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		return result;
	}
}
