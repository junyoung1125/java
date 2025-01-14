package sub1;

public class Apple { // extends Object 암묵적으로 Object 클래스를 상속

	private String country; // 속성
	private int price;

	public Apple(String country, int price) { // 생성자
		this.country = country;
		this.price = price;

	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";

	}

}
