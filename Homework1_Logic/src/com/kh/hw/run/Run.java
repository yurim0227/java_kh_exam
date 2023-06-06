package com.kh.hw.run;

import com.kh.hw.view.Menu;
import com.kh.hw.controller.Function;

public class Run {
	public static void main(String[] args) {
//		Run에서 Menu 사용, Menu에서 Function 사용
//		Run클래스에 main()를 구현하여 main()메소드에는 Menu클래스의 displayMenu()메소드 실행
		new Menu().displayMenu();
		new Function().calculator();
		new Function().totalCalculator();
		new Function().printProfile();
		new Function().printScore();
		new Function().printStarNumber();
		new Function().sumRandom();
		new Function().exceptGugu();
		new Function().diceGame();
	}
}