package test4;

import java.util.Scanner;

/*
 * 
 * 날짜: 2025/01/17
 * 이름: 변준영
 * 내용: 자바 예외처리 연습문제
 */
<<<<<<< HEAD

=======
class LoginException extends Exception {

	public LoginException(String msg) {
		super(msg);
	}
}
>>>>>>> 7e56a0ac51b358fd99c3e236981d292c07746dec

public class test3 {

	public static void main(String[] args) {

		String userId = "a101";
		String userPw = "abc1234";

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 :");
		String inputId = sc.nextLine();

		System.out.print("비밀번호 :");
		String inputPw = sc.nextLine();

		try {
			if (!userId.equals(inputId)) {
				throw new LoginException("아이디가 올바르지 않습니다.");
			} else if (!userPw.equals(inputPw)) {
				throw new LoginException("비밀번호가 올바르지 않습니다.");

			} else {
				System.out.println("로그인 성공!");
			}
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}

	}
}