package step1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int A= sc.nextInt();
		int B= sc.nextInt();
		
		int B1= B%10;
		int B2= (B/10)%10;
		int B3= B/100;
		
		int step1= A*B1;
		int step2= A*B2;
		int step3= A*B3;
		int result= A*B;
		
		System.out.println(step1);
		System.out.println(step2);
		System.out.println(step3);
		System.out.println(result);
		
		sc.close();
	}

}
