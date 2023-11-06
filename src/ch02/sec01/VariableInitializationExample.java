package ch02.sec01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// 변수 value 선언
		int value;
		
		value = 1; //변수 초기화를 진행하지 않으면 아래와 같은 에러가 
		
		// 연산 결과를 result의 초기값으로 대입
		int result = value + 10;

		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
//		Error Message:
//		The local variable value may not have been initialized
		
		
	}

}
