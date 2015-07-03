package abstraction;

public abstract class CardGameRule {
	private String result; //ī�� ����� ������
	
	// ������ ����
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public abstract void play(Card card01,Card card2);
	//�޼ҵ� �� abstract �� ���̸� Ŭ�������� abstract �� �پ�� �ϸ� �� Ŭ���� �� �߻�Ŭ���� ��� �Ѵ�.
	//�׸��� abstract �� ���� �޼ҵ带 �߻翥�ҵ� ��� �Ѵ�.
	// �߻� �޼ҵ�� �ٵ� ����.
	
	

}
