package encapsule;
/*
 * @
 * @
 * @ Stroy ����ȭ�� ���� ����
 * ����ȭ�� �ʵ忡 �ִ� �����Ͱ��� �ƹ��� �������� ���ϰ� �ϰ� 
 * getter �� setter �� ���� ���� �� ȹ���� ��ü��
 * �����Ϳ� ���� �ϵ��� �ϴ� �����̴�.
 */
/*
 * ���������� private
 * ���ȼ��� ����. ������Ʈ�� �������� �����
 * ���۳�Ʈ�� ������ �ּ�ȭ �Ͽ� �������� ���� �Ҽ� ����
 * ������ ����
 */
import java.util.Scanner;

public class AverageMainStep3 {
	public static void main(String[] args) {
		
	AverageVOStep3 hulk = new AverageVOStep3();
	AverageVOStep3 iron = new AverageVOStep3();
    AverageVOStep3 hawk = new AverageVOStep3();
    /*
     * AverageVOStep3 �� Ŭ���� �̸�
     * hulk , iron , hawk �� �ν��Ͻ� (��ü)
     * new �� ������ Ű����
     * averageVOStep3() Ŭ���� �̸��� ���������� �޼ҵ� ǥ��() �� 
     * �ִ� �̰��� ������
     */
   Scanner scanner = new Scanner(System.in);
    System.out.println("�̸��� �Է����ּ���(��ũ)"); 
    hulk.setName(scanner.next()); 
    System.out.println("�̸��Է����ּ���(���̾�)");
    iron.setName(scanner.next());
    hawk.setName(scanner.next());
    
/*���� ����
	System.out.println("��ũ�� �������� :");
	hulk.setKor(scanner.nextInt());	
	hulk.kor = scanner.nextInt();
		System.out.println("��ũ�� �������� :");
		hulk.setEng(scanner.nextInt());
		hulk.eng = scanner.nextInt();
		System.out.println("���̾��� �������� :");
		iron.setKor(scanner.nextInt());
		iron.kor = scanner.nextInt();
		System.out.println("���̾��� �������� :");
		iron.setEng(scanner.nextInt());
		iron.eng = scanner.nextInt();
		System.out.println("ȣũ�� �������� :");
		hawk.setKor(scanner.nextInt());
		hawk.kor = scanner.nextInt();
		System.out.println("ȣũ�� �������� :");
		hawk.setEng(scanner.nextInt());
		hawk.eng = scanner.nextInt();
		*/
	/*��հ��*/
		hulk.setAvg(hulk.getTot());
		iron.setAvg(iron.getTot());
		hawk.setAvg(hawk.getTot());
		/*�������*/
		hulk.setTot(hulk.getKor(), hulk.getEng() );
		iron.setTot(iron.getKor(),hulk.getEng() );
		hawk.setTot(hawk.getKor(), hulk.getEng());
		
		System.out.println("��ũ�� ���� :"+hulk.getTot());
	//	System.out.println(���̾��� );
		System.out.println();
	}
	

}
