package sub8;

/*
 * 날짜: 2025/01/10
 * 이름: 변준영
 * 내용: Java 인터페이스 실습하기
 */
public class InterfaceTest {

	public static void main(String[] args) {

		// 인터페이스 예제1- 표준화된 공통 클래스 구조설계
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();

		lg.powerOn();
		lg.chDown();
		lg.soundDown();
		lg.powerOff();

		samsung.powerOn();
		samsung.powerOff();
		samsung.soundDown();

		// 인터페이스 예제2- 유연성(다형성을 통한 결합도 완화)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);

		socket.switchOn();
		socket.switchOff();

		// 인터페이스 예제3- 다중상속 효과
		SmartTv stv = new SmartTv();
		stv.process();

	}

}
