package abstraction;

public class OrangImpl implements FruitInterface {

	@Override
	public void dispaly(String str) {
		System.out.println(str+"������ �Դϴ�");
		
		
	}
	/*
	 * �������̽��� ���ǵ� �߻�Ŭ������ ������
	 * ������ Ŭ�������� �߰��� �޼ҵ带 �� �������,
	 */
	public int getCount(){
		return 100;
	}

}
