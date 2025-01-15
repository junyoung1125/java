package sub4;

public class Apple {

	// 속성
	private String country;
	private int price;

	// 생성자
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}

	public void show() {
		System.out.println("원산지: " + country);
		System.out.println("가격: " + price);
	}

}
