package ch04.sec02;

//p113 실습하기
public class IfExapmple {

	public static void main(String[] args) {

		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		}

		if (score < 90)
			System.out.println("점수가 90보다 적습니다.");
		System.out.println("등급은 B입니다.");
	}
}
