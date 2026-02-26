package oop01;

/*
 생성할 때마다 참조주솟값 각각 할당
 = 각 인스턴스의 멤버변수는 다른값을 유지하지만, 메서드 내용은 같은 클래스 생성시 동일함
*/

public class ObjectInstance02Sync {
	public static void main(String[] args) {
		
		Tv myTv1 = new Tv(); //기존  ObjectInstance01.java 안에 클래스 끌어옴
		Tv myTv2 = new Tv();
			
		System.out.println("기본채널은 " + myTv1.channel); // 0
		System.out.println("기본채널은 " + myTv2.channel); // 0
		
		myTv1.channel = 7;
		
		System.out.println("myTv1 채널은 " + myTv1.channel); // 7
		System.out.println("myTv2 채널은 " + myTv2.channel); // 0
	}
}

