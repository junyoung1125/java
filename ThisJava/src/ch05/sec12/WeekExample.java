//package ch05.sec12;
////p199 실습하기
//
//import java.util.Calendar;
//
//public class WeekExample {
//
//	public static  void main(String[] args) {
//
//		// week 열거 타입 변수 선언
//		week today = null;
//
//		// Calendar 얻기
//		Calendar cal = Calendar.getInstance();
//
//		// 오늘의 요일 얻기(1~7)
//		int week = cal.get(Calendar.DAY_OF_WEEK);
//
//		// 숫자를 열거 상수로 변환해서 변수에 대입
//		switch (week) {
//		case 1:	today = week.SUNDAY;	break;
//		case 2:	today = week.MONDAY;	break;
//		case 3:	today = week.TUESDAY;	break;
//		case 4:	today = week.WEDNESDAY;	break;
//		case 5:	today = week.THURSDAY;	break;
//		case 6:	today = week.FRIDAY;	break;
//		case 7:	today = week.SATURDAY;	break;
//		}
//
//	}
//
//}
