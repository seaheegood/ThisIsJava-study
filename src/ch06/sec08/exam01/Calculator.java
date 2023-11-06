package ch06.sec08.exam01;

public class Calculator {
	// 리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 리턴값이 있는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 호출 시 두 정수 값을 전달받고,
	// 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result; // 리턴값 지정
	}
	
	// 호출 시 두 정수 값을 전달받고,
	// 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result; // 리턴값 지정
	}
}

// 메소드를 호출하는 것은 메소드 블록을 실행하는 것을 뜻한다.
// 클래스에서 메소드를 선언했다고 해서 바로 호출할 수 있는 것은 아니다.
// 메소드는 객체의 동작이므로 객체가 존재하지 않으면 메소드를 호출할 수 없다.

// 클래스로부터 객체가 생성된 후에 메소드는 생성자와 다른 메소드 내부에서 호출될 수 있고,
// 객체 외부에서도 호출될 수 있다. 
