package bank;

public class Account {

	// 속성
	private String ano;
	private String owner;
	private int balance;

	// 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.balance = balance;
		this.owner = owner;
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
