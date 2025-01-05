package test1;

public class PracticeTest {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 9; i++) { // 1~9행을 반복
			if (i <= 5) { // 5행까지는 증가
				count++;
			} else { // 이후에는 감소
				count--;
			}

			// 공백 출력
			for (int j = 1; j <= 5 - count; j++) {
				System.out.print(" ");
			}

			// 별 출력
			for (int k = 1; k <= 2 * count - 1; k++) {
				System.out.print("*");
			}

			// 행 끝에 줄바꿈
			System.out.println();
		}
	}
}
