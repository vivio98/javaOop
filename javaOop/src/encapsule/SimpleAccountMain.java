package encapsule;

import java.util.Scanner;

public class SimpleAccountMain {
	public static void main(String[] args) {
		/*
		 * ��ü������� ������ɿ� ���� ����� ���ȭ�� ��Ų �� 
		 * ���뼺�� ���̱� ���� ���߹���Դϴ�.
		 * ���� ������¸� �𵨷� �� �����Դϴ�.
		 * Ŭ���� �ΰ��� �����ϼ���.
		 * 1.SimpleAccountVO.java
		 * 2.SimpleAccount.java
		 * 
		 * 2�� Ŭ������ �ִ� �޼ҵ�� ������ �����ϴ�.
		 * public string name(String name){
		 * return name;
		 * }
		 * public int jango(int money){
		 * int jango = money+100;
		 * return jango;
		 * }
		 */
		// ��ĳ�ʷ� �̸�(name)�� �Աݾ�(money)�� �Է¹޽��ϴ�.
		//��ĳ�ʿ� System.outprintln() �� �ݵ�� main() ��  �־���մϴ�.
		Scanner scanner = new Scanner(System.in);
		/*
		 * Scanner �� Ŭ����,scanner �� �ν��Ͻ� (��ü)��� �θ��ϴ�.
		 */
	SimpleAccountVO simpleAccountVO = new SimpleAccountVO();
	String inputName = scanner.next(); // ���ڿ��� �Է¹��� ����  next() �����
	int inputMoney = scanner.nextInt(); // ���ڰ��� �Է¹��� ���� nextInt() �����
	String name = simpleAccountVO.name(inputName);
	int jango =simpleAccountVO.jango(inputMoney); 
	System.out.println(name+"��"+inputMoney+"���� �ԱݵǾ����ϴ�."
				+"�ܰ��"+jango+" �����Դϴ�.");
		
		
	}

}
