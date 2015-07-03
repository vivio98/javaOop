package encapsule;

import java.util.Scanner;
/*
 *  @0616
 *  @author 아뱅
 *  @story : 메인메소드에서 모듈화 로직의 분리 예제;
 */

public class LeapYearVO {
	public void getleapYear(int year) {
		
		
		System.out.println("입력된 해"+year);
		String msg = "";
		if (year % 4 == 0) { // 필터링 if 문에서 차례대로 연산식을 거쳐 참 거짓을 판별하면서
								// 하부로 값을 전달하는 행위
								// 필터링 방식은 결과값을 크게 주는 범위부터 작은 방향으로 진행
			msg = "윤년";
		} else if (year % 100 == 0) {
			msg = "평년";
		} else if (year % 400 == 0) {
			msg = "윤년";
		} else {
			msg = "평년";
		}
		System.out.println(msg);

	}

}
