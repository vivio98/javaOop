package encapsule;

import java.util.Scanner;

public class AverageMainStep2 {
	public static void main(String[] args) {
		/*
		 * ���� main() �� AverageVOStep2 �� ��ü(�ν��Ͻ�)��
		 * ����� ���̹Ƿ� ������Ÿ��(=Ŭ������)��
		 * AverageVOStep2 �� �ٲ� �ش�.
		 */
		AverageVOStep2 hulk = new AverageVOStep2();
		AverageVOStep2 iron = new AverageVOStep2();
		AverageVOStep2 hawk = new AverageVOStep2();
		
		hulk.name ="��ũ";
		iron.name ="���̾�";
		hawk.name ="ȣũ";
		
		Scanner  scanner = new Scanner(System.in);
		System.out.println("��ũ�� �������� :");
		hulk.kor = scanner.nextInt();
		System.out.println("��ũ�� �������� :");
		hulk.eng = scanner.nextInt();
		System.out.println("���̾��� �������� :");
		iron.kor = scanner.nextInt();
		System.out.println("���̾��� �������� :");
		iron.eng = scanner.nextInt();
		System.out.println("ȣũ�� �������� :");
		hawk.kor = scanner.nextInt();
		System.out.println("ȣũ�� �������� :");
		hawk.eng = scanner.nextInt();
		/*������ ��հ��*/
	    hulk.tot = hulk.calcTot(hulk.kor, hulk.eng);
	    hulk.avg = hulk.calcAvg(hulk.tot);
	    iron.tot = iron.calcTot(iron.kor, iron.eng);
	    iron.avg = iron.calcAvg(iron.tot);
	    hawk.tot = hawk.calcTot(hawk.kor, hawk.eng);
	    
	    System.out.println("==="+hulk.name+"�� ����ǥ===");
		 System.out.println("���� :"+hulk.kor);
		 System.out.println("���� :"+hulk.eng);
		 System.out.println("�հ� :"+hulk.tot);
		 System.out.println("��� :"+hulk.avg);
		 System.out.println();
		 /*
		  * ���ϴ� �ܾ ü���� �ϴ� ��Ŭ���� ����Ű CTRL + F
		  * replace ��ư Ŭ��
		  */
		 System.out.println("==="+iron+"�� ����ǥ===");
		 System.out.println("���� :"+iron.kor);
		 System.out.println("���� :"+iron.eng);
		 System.out.println("�հ� :"+iron.tot);
		 System.out.println("��� :"+iron.avg);
		 System.out.println();
		 System.out.println("==="+hawk+"�� ����ǥ===");
		 System.out.println("���� :"+hawk.kor);
		 System.out.println("���� :"+hawk.eng);
		 System.out.println("�հ� :"+hawk.tot);
		 System.out.println("��� :"+hawk.avg);
		 System.out.println();
		 
	    
		
		
		
	}
	
}
	


