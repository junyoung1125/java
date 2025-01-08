package ch05.sec08;

//p188 실습하기
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {

		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]); // 같은 객체 참조
		System.out.println(strArray[0] == strArray[2]); // 다른 객체를 참조
		System.out.println(strArray[0].equals(strArray[2])); // 문자열이 동일
	}

}
