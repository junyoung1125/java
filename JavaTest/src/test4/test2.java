package test4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜: 2025/01/17
 * 이름: 변준영
 * 내용: 예외처리 연습문제
 */
class NotFoundException extends Exception {
	NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}

public class test2 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("찾을 숫자 입력 : ");
			int find = sc.nextInt();

			searchArray(find, arr);
			System.out.println("해당하는 숫자 찾음!!");

		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

		System.out.println("프로그램 정상 종료...");
	}

	// 메서드를 main 밖으로 이동
	public static void searchArray(int find, int[] arr) throws NotFoundException {
		for (int i : arr) {
			if (i == find) {
				return; // 숫자를 찾으면 메서드 종료
			}
		}
		throw new NotFoundException(); // 숫자를 찾지 못하면 예외 발생
	}
}
