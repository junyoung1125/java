package test3;

/*
 * 
 * 날짜: 2025/01/10
 * 이름: 변준영
 * 내용: 추상클래스, 다형성 연습문제
 * 
 */
???
class Shape {
	public abstarct void draw();

}

class Triangle extends???{

	@override
	public void draw() {
		System.out.println("draw Triangle!");
	}

	class Circle extends???{

	@override
	public void draw() {
		System.out.println("draw Circle!");
	}
	}
}

public class Test9 {

	public static void main(String[] args) {
		Test09 here = new Test09();
		
		Circle circle= new Circle();
		Triangle triangle= new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}

	public void draw(???obj) {
		obj.draw();
	}
}
