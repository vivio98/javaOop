package encapsule;

public class CardVO {
	String msg;
	 
	/*
	 * ������ �غ��� ī���� ���ο� ���̴�
	 * �����ؾ� �Ѵ�. �� ���� �������� 
	 * �־�� �Ѵٴ� ���̰�.. �̴� ����� 
	 * �����ؾ� �Ѵٴ� ���̴�
	 * �׷��� ��� ���𹮹�
	 */
    static final  int WIDTH=150; // ī���� ����
	static final  int HEIGHT=300; // ī�� �� ����
	
	public CardVO(String kind, int num) {
	this.msg = kind + ":" + num;	 
	}
    // msg�� setMsg()�� ����ٴ� ����
	// ���� �� �޼����� �ٲܼ� ���� 
	//���� �о���⸸ �Ѵٴ� read only �� �ǹ��̴�.
	
	public String getMsg() {
		return msg;
	}

	 
	}
	
	

