package encapsule;

import java.util.Scanner;


/*
 *  @ STroy : ī���������� �����ִ� ���(������Ʈ)
 */

public class KaupVO {
	// �޼ҵ� = ����������(public) + ����(void) + �޼ҵ� �̸� +() + {}
	public String getKaup(double height,double weight){
		
		/*
		 * �Ʒ����� double Ÿ���� �������
		 * int Ÿ���� ������ �Ҵ��ؾ� �ϹǷ�
		 * ĳ������ �Ͼ����, ���� ��Ŭ������
		 * �����ϴ� �ڵ��ϼ� ������� �ذ��Ѵ�.
		 */
		int idx = (int) ((weight/(height*height))*10000);
		String msg = "";
		if(idx>30){
			msg = "��";
		}else if(idx>24){
			msg = "��ü��";
		}else if(idx>20){
			msg = "����";
		}else if(idx>15){
			msg = "��ü��";
		}else if(idx>13){
			msg = "����";
		}else if(idx>10){
			msg = "�������";
			
		
			
		}
		return msg;
	/*
	 *  idx>24 ... msg = "��ü��"
	 *  idx>20 ... msg = "����"
	 *  idx>15 ... msg = "��ü��"
	 *  idx>13 ... msg = "����"
	 *  idx>10 ... msg = "�������"
	 *  �̵����� �ƴϸ� msg = "�Ҹ���"
	 */
		
	}
	
}
