package abstraction;

import java.util.Scanner;


public class BankBookMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in );
		
		
		
		int accountNo = (int)((Math.random()*9999999)+11111110);
		//6�ڸ� �����ⷣ������ �߻�
		//valueof() �ڹ� api �� �ִ� java.lang.String Ŭ������ �޼ҵ�� �������� ���ڿ��� �ٲ��ִ� �������Ѵ� 
		String strAccountNo = String.valueOf(accountNo);
		System.out.println("������ �̸� :");
		String name = scanner.next();
		System.out.println("��й�ȣ");
		String pass = scanner.next();
		System.out.println("���ݾ� :");
		int inputMoney = scanner.nextInt();
		/*
		 * ��ü(�ν��Ͻ�)�� ������ �� ����~~~���� �ؾ� ����
		 * ��ü�� �����ϴ� Ŭ������ �������̽� �� ������ ���� �ƴ϶��
		 * �״�� ������ Ÿ������ ����ص� �ǳ�,
		 * �������̽��� ������ Ŭ������� 
		 * �������̽� Ÿ�� + �ν��Ͻ� = new ũ����������()��
		 * ��ü�� �����Ѵ�
		 */
		Account hong = new BankBook(strAccountNo,name,pass,inputMoney);
		System.out.println(hong.toString());
		System.out.println("�Աݾ� :");
		int depositMoney = scanner.nextInt();// �Ķ�����ּ�
		System.out.println(hong.toString());
		System.out.println("��ݾ�:");
		int withdrawMoney = scanner.nextInt();
		hong.withdraw(withdrawMoney);
		System.out.println(hong.toString());
		
		
			
	 
	}

}
