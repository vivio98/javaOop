package test;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class PayMain {
	public static void mian(String[] args){
		PayVO hong = new PayVO();
		PayVO kang = new PayVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���(ȫ�浿)");
		hong.setName(scanner.next());
		System.out.println("�̸��� �Է��ϼ���(������)");
		kang.setName(scanner.next());
		System.out.println("ȫ�浿�� ������ �Է��ϼ���");
		hong.setSalary(scanner.nextInt());
		System.out.println("�������� ������ �Է��ϼ���");
		kang.setSalary(scanner.nextInt());
		
		hong.setIncome(hong.getIncome());
		kang.setIncome(kang.getSalary());
		
		System.out.println("==="+hong.getName()+"�� 6�� �޿����� ===");
		System.out.println("����   :"+hong.getSalary()+"����" );
		System.out.println("���� :"+hong.getSalary()* PayVO.TAX+"����");
		System.out.println("�Ǳ޿� :"+kang.getIncome() );
		
	}

}
