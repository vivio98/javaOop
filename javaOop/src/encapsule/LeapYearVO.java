package encapsule;

import java.util.Scanner;
/*
 *  @0616
 *  @author �ƹ�
 *  @story : ���θ޼ҵ忡�� ���ȭ ������ �и� ����;
 */

public class LeapYearVO {
	public void getleapYear(int year) {
		
		
		System.out.println("�Էµ� ��"+year);
		String msg = "";
		if (year % 4 == 0) { // ���͸� if ������ ���ʴ�� ������� ���� �� ������ �Ǻ��ϸ鼭
								// �Ϻη� ���� �����ϴ� ����
								// ���͸� ����� ������� ũ�� �ִ� �������� ���� �������� ����
			msg = "����";
		} else if (year % 100 == 0) {
			msg = "���";
		} else if (year % 400 == 0) {
			msg = "����";
		} else {
			msg = "���";
		}
		System.out.println(msg);

	}

}
