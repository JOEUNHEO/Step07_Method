package test.main;

import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		// MyUtil 클래스의 printMsg() 메소드를 호출해 보세요.
		MyUtil.printMsg("hi!");
		
		String str = "안녕!";
		MyUtil.printMsg(str);// 받은 인자인 변수와 메소드안에서 정의된 지역 변수는 메소드 실행순서 때 만들어진다.
	}
}
