package encapsule;

import java.util.Scanner;

/*
 * @ date 2015.06
 * @author : itbank
 * @story : �����ڸ����� �ﰢ�� ���ϱ�
 */


public class TriangleMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է� :");
		double garo = scanner.nextDouble();
		System.out.println("���� �Է�");
		double sero = scanner.nextDouble();
		/*
		 * double Ÿ���� �Ķ���� ��  int Ÿ���� ���� �Ҵ��ص� �ƹ� ������ �߻����� �ʴ� ����
		 * �ڹ� ���� ������ ���� Ÿ���� ū Ÿ�Կ� ���� ���� �ϱ� �����̴�.
		 * �ٸ� ���� �ս��� ���Ҽ� ����
		 */
		TriangleVO triangle = new TriangleVO(garo,sero);
		
		System.out.println(triangle.getArea());
	}
	

		
	}


