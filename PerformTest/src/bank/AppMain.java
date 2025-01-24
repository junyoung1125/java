package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {

	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();

	public static void main(String[] args) {

		boolean isRunning = true;
		while (isRunning) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				isRunning = false;
			}
		}
		System.out.println("프로그램 종료");

	}// main end

	private static void createAccount() {

		Account cA1 = new Account("110-11-1001", "김유신", 10000);
		System.out.println("----------계좌생성-----------");
		System.out.println("계좌번호 :" + cA1.getAno());
		System.out.println("계좌주: " + cA1.getOwner());
		System.out.println("초기입금액: " + cA1.getBalance());
		System.out.println("결과: 계좌가 생성되었습니다.");

		Account cA2 = new Account("110-11-1002", "김춘추", 20000);
		System.out.println("----------계좌생성-----------");
		System.out.println("계좌번호 :" + cA2.getAno());
		System.out.println("계좌주: " + cA2.getOwner());
		System.out.println("초기입금액: " + cA2.getBalance());
		System.out.println("결과: 계좌가 생성되었습니다.");

	}

	private static void accountList() {
		Account aL1 = new Account("110-11-1001", "김유신", 10000);
		Account aL2 = new Account("110-11-1002", "김춘추", 20000);
		System.out.println("-------계좌목록---------");
		System.out.print(aL1.getAno());
		System.out.print(aL1.getOwner());
		System.out.println(aL1.getBalance());
		
		System.out.print(aL2.getAno());
		System.out.print(aL2.getOwner());
		System.out.println(aL2.getBalance());
	}

	private static void deposit() {

		Account de1 = new Account("110-11-1101", "", 5000);

		System.out.println("계좌번호: " + de1.getAno());
		System.out.println("예금액: " + de1.getBalance());
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	private static void withdraw() {

		Account wd1 = new Account("110-11-1002", "", 3000);
		System.out.println("--------출금--------");
		System.out.println("계좌번호 :" + wd1.getAno());
		System.out.println("출금액:" + wd1.getBalance());
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	private static Account findAccount(String ano) {
		Account fA1 = new Account("110-11-1101", "김유신", 15000);
		Account fA2 = new Account("110-11-1002", "김춘추", 17000);
		return fA2;
	}
}