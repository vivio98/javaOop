package polymorphism;

import java.util.Scanner;

/*
 * @ Date : 2015.06
 * @ Author : itbank
 * @ story : Ŀ�� ��ü Ŭ������ ���� ������
 *        �� �� �ڿ����ε��� �����غ��� ����Ŭ����
 *        �����ε� = ������(polymorphise)
 */
public class CoffeeMain2 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());
		System.out.println("�Ǹ��ڴ� Ŀ�� ���� ������ ������ �ּ���");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
		
		
	}

}
