package test;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class PayMain {
	public static void mian(String[] args){
		PayVO hong = new PayVO();
		PayVO kang = new PayVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름음 입력하세요(홍길동)");
		hong.setName(scanner.next());
		System.out.println("이름음 입력하세요(강감찬)");
		kang.setName(scanner.next());
		System.out.println("홍길동의 본봉을 입력하세요");
		hong.setSalary(scanner.nextInt());
		System.out.println("강감찬의 본봉을 입력하세요");
		kang.setSalary(scanner.nextInt());
		
		hong.setIncome(hong.getIncome());
		kang.setIncome(kang.getSalary());
		
		System.out.println("==="+hong.getName()+"의 6월 급여내역 ===");
		System.out.println("본봉   :"+hong.getSalary()+"만원" );
		System.out.println("세금 :"+hong.getSalary()* PayVO.TAX+"만원");
		System.out.println("실급여 :"+kang.getIncome() );
		
	}

}
