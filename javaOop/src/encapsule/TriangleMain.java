package encapsule;

import java.util.Scanner;

/*
 * @ date 2015.06
 * @author : itbank
 * @story : 생성자만으로 삼각형 구하기
 */


public class TriangleMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로 입력 :");
		double garo = scanner.nextDouble();
		System.out.println("세로 입력");
		double sero = scanner.nextDouble();
		/*
		 * double 타입의 파라미터 에  int 타입의 값을 할당해도 아무 문제가 발생하지 않는 것은
		 * 자바 내부 적으로 작은 타입은 큰 타입에 적용 가능 하기 때문이다.
		 * 다만 값의 손실은 피할수 없다
		 */
		TriangleVO triangle = new TriangleVO(garo,sero);
		
		System.out.println(triangle.getArea());
	}
	

		
	}


