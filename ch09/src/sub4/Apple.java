package sub4;

import java.io.Serializable;

//직렬화를 위해 Serializable 인터페이스 구현
public class Apple implements Serializable{


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
		System.out.println(country);
		System.out.println(price);
		
	}

}
