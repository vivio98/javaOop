package abstraction;

import java.util.Scanner;


public class BankBookMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in );
		
		
		
		int accountNo = (int)((Math.random()*9999999)+11111110);
		//6자리 정수향랜덤숫자 발생
		//valueof() 자바 api 에 있는 java.lang.String 클래스의 메소드로 숫자형을 문자열로 바꿔주는 역할을한다 
		String strAccountNo = String.valueOf(accountNo);
		System.out.println("예금주 이름 :");
		String name = scanner.next();
		System.out.println("비밀번호");
		String pass = scanner.next();
		System.out.println("예금액 :");
		int inputMoney = scanner.nextInt();
		/*
		 * 객체(인스턴스)를 생성할 때 아주~~~주의 해야 할점
		 * 객체를 생성하는 클래스가 인터페이스 를 구현한 것이 아니라면
		 * 그대로 데이터 타입으로 사용해도 되나,
		 * 인터페이스를 구현한 클래스라면 
		 * 인터페이스 타입 + 인스턴스 = new 크랠스생성자()로
		 * 객체를 생성한다
		 */
		Account hong = new BankBook(strAccountNo,name,pass,inputMoney);
		System.out.println(hong.toString());
		System.out.println("입금액 :");
		int depositMoney = scanner.nextInt();// 파라미터주소
		System.out.println(hong.toString());
		System.out.println("출금액:");
		int withdrawMoney = scanner.nextInt();
		hong.withdraw(withdrawMoney);
		System.out.println(hong.toString());
		
		
			
	 
	}

}
