package encapsule;

import java.util.Scanner;

public class KaufMain {
	public static void main(String[] args) {
		KaupVO kaupVO = new KaupVO();
		// ��ü�� �����ϴ� ����
		// Ŭ������ ��ü�� = new �����ڸ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();
	//height ��  weight �� �Ķ���� ���� �����ϴ� ����
		String msg = kaupVO.getKaup(height,weight);
		// ��ü��(�ν��Ͻ� �������� = ��������).�޼ҵ� �̸�
		//��ü�� �޼ҵ带 ȣ���ϴ� ����
		
		System.out.println("ī��������[Ű="+height+"cm, ������="+weight+"kg, ī��������="+msg+"]");
		}

}
