package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 * 날짜: 2025/01/17
 * 이름: 변준영
 * 내용: 로또번호 연습문제
 */
public class test7 {

	public static void main(String[] args) {

		for (int count = 1; count <= 5; count++) {
			System.out.println(makeLotto());
		}
	}

	public static Set<Integer> makeLotto() {
		Set<Integer> lottoSet = new HashSet<>(); // 중복되지 않는 번호를 저장할 set

		// 무한 루프를 사용해 6개의 고유번호 생성
		for (;;) {
			int num = (int) (Math.random() * 45) + 1; // 1~45사이 랜덤 번호 생성
			lottoSet.add(num); // Hashset에 번호를 추가(중복이면 자동으로 무시됨)
			if (lottoSet.size() == 6) { // set에 6개의 번호가 들어가면 종료
				break;
			}
		}
		// 정렬을 위해 TreeSet 사용
		Set<Integer> treeSet = new TreeSet<>(lottoSet);

		return treeSet;
	}
}
