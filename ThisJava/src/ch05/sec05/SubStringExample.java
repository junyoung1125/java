package ch05.sec05;

//p163 실습하기
public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-123456";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		String thirdNum = ssn.substring(3, 7);
		System.out.println(thirdNum);
	}

}
