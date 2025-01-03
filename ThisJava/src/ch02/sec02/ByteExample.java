package ch02.sec02;

//p44 실습하기
public class ByteExample {

	public static void main(String[] args) {

		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6= 128;	컴파일 에러(byte는 127의 값까지만 받을 수 있기 때문에 오류 발생

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
