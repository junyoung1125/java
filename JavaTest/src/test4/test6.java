package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 
 * 날짜: 2025/01/17
 * 이름: 변준영
 * 내용: 리스트 연습문제
 */
public class test6 {

	public static void main(String[] args) {
		
		//60~100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		printList(createList());
	}//main end
	
	//scorelist 를 출력하고 총합을 구하는 메서드
	public static void  printList(List<Integer>scoreList){
		int total =0;
		int size= scoreList.size();	//리스트 크기
				
		for(int i=0; i<size; i++) {
			int score= scoreList.get(i);
			total += score;
			System.out.print(score);
		

		//마지막 숫자 뒤에는 '=' 출력, 그 외에는 '+'출력
		if( i ==size -1) {
			System.out.print("=");
		}else {
			System.out.print("+");
		}
	}
	System.out.println(total);	//총합 출력
}

//60~100 사이의 랜덤수 10개생성후 리스트에 저장하고 반환하는 메서드
public static List<Integer> createList() {
	List<Integer> scoreList = new ArrayList<>();
	Random rand= new Random();
	
	for(int i=1; i<=10; i++) {
		//60~100 사이 임의의 수
		int num= rand.nextInt(41)+ 60;
		scoreList.add(num);
	}
	return scoreList;
}
}