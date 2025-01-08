package sub3;

import java.io.ObjectInputStream.GetField;

//싱글톤 객체
public class Calc {

	private static Calc instance = new Calc();

	public static Calc getInstance() {
		return instance;
	}
	private Calc() {}

	public int plus(int x, int y) {
		return x + y;
	}

	public int minus(int x, int y) {
		return x - y;
	}

	public int multi(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		return x / y;
	}
}
