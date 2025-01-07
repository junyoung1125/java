package practice;

public class Practice {

	public static void main(String[] args) {
		
		//객체 생성
		Subway sw = new Subway("전포역","검정",10);
		//객체 상호작용
		sw.speedUp(20);
		sw.speedDown(5);
		sw.show();

		
	}

}
