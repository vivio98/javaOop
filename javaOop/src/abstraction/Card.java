package abstraction;

public class Card {
	static final int WIDTH=150;
	static final int HEIGHT=300;
	
	public static final String KIND ="��Ʈ";
			private int num;
	public Card() {
		this.num = (int)(Math.random()*13)+1;
		/*
		 * Math Ŭ������ ���а� ���õ� Ŭ����
		 * Math.ramdom() �޼ҵ�� ���� ������ �������ڸ�
		 * �߻���Ű�� ���� 13�� ����Ʈ ��, +1�� start ��
		 */
	}
	
public int getNum() {
	return num;
}

	 
	}
	
	

