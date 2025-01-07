package ch05.sec04;

//p153 실습하기
public class NullPointerExceptionExample {

	public static void main(String[] args) {

		int[] intArray = null;
		intArray[0] = 10; // nullpointerexception

		String str = null;
//		System.out.println("총 문자 수 :"+str.length() );     nullpointerexception

	}

}
