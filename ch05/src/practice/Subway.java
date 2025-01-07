package practice;

public class Subway {

	// 속성
	private String Subway;
	private String color;
	private int speed;

	// 생성자
	public Subway(String Subway, String color, int speed) {
		this.Subway = Subway;
		this.color = color;
		this.speed = speed;
	}

	// 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}

	public void speedDown(int speed) {
		this.speed -= speed;
	}

	public void show() {
		System.out.println("역 명: " + this.Subway);
		System.out.println("열차 색: " + this.color);
		System.out.println("현재 속도: " + this.speed);
	}
}
