package test2;

/*
 * 
 * 날짜: 2025/01/10
 * 이름: 변준영
 * 내용: 자바 배열 최대값 찾기
 * 
 */
public class Test02 {

	public static void main(String[] args) {
		int arr[] = { 17, 92, 18, 33, 58, 7, 26, 42, 98 };

		int maxNum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
			 maxNum= arr[i];			}
		}
		System.out.println("배열 arr에서 가장 큰 수 :" + maxNum);
	}

}
