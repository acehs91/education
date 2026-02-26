package oop03;

import static java.lang.Math.*;
import static java.lang.System.*;

/*
	Math 클래스
	: 기본적인 수학 계산에 유용한 메서드로 구성되어 있음
	  Math 클래스의 생성자는 접근제어자가 private이므로 -> 다른 클래스에서 인스턴스를 생성할 수 없음
	  => Math 클래스 내 멤버변수가 없고, 메서드도 static임
 */
public class Math05 {
	public static void main(String[] args) {
		double val = 90.7773;
		out.println("반올림 : " + Math.round(val));
		out.println("올림 : " + ceil(val));
		out.println("내림 : " + floor(val));
	}// /main
}
