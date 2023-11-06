package ch06.sec07.exam04;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	Car() {}
	
	Car(String model) {
		this.model = model;
		// this는 현재 객체를 말하며, 
		// this.model은 현재 객체의 데이터(필드)로서의 model을 뜻한다.
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
