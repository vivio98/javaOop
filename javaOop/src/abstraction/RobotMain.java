package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 * ������ ���� : ���ڷ��̼� ����
		 * ���ڷ��̼� ����( ����ũ ���� �� ��Ʋ���ٰ� ���(��ũ��)��� ����)
		 * 1.��Ʋ�� �غ�
		 */
		BasicBot myBot = new  BasicBot();// ��Ʋ�غ�
		GunBot mygun = new GunBot(myBot);
		mygun.status();
		mygun.chargeEnergy(50);
		mygun.status();
		mygun.shield(30);
		mygun.run();
		mygun.status();
		
	}

}
