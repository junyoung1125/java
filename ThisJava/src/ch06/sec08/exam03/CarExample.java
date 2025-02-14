package ch06.sec08.exam03;

//p239 실습하기
public class CarExample {

	public static void main(String[] args) {

		// Car 객체 생성
		Car myCar = new Car();

		// 리턴값이 없는 setGas() 메서드 호출
		myCar.setGas(5);

		// isLeftGas() 메서드를 호출해서 받은 리턴값이 true일 경우 if 블록 진행
		if (myCar.isLeftGas()) {
			System.out.println("출발합니다.");
		}
		// 리턴값이 없는 run() 메서드 호출
		myCar.run();

		System.out.println("가스를 주입하세요");
	}

}
