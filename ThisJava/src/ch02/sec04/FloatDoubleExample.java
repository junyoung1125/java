package ch02.sec04;

//p49 실습하기
public class FloatDoubleExample {

	public static void main(String[] args) {

		// 정밀도 확인
		float var1 = 0.123456789123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2); // double 타입이 float 타입보다 약 2배정도의 유효자릿수를 가진다.

		// 10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6f;
		double var5 = 2e-3;
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
	}

}
