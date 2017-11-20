package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		// MyUtil 클래스의 getNum() 메소드를 호출해 보세요.
		
		int a = MyUtil.getNum();
		
		// MyUtil 클래스의 getMessage() 메소드를 호출하고
		// 리턴되는 값을 msg 라는 지역변수에 저장해 보세요.
		
		String msg = MyUtil.getMessage();
		
		// MyUtil 클래스에 정의된 getName() 메소드를 호출하고
		// 리턴되는 갑을 name 이라는 지역 변수에 저장해 보세요.
		
		String name = new MyUtil().getName();
	}	
}
