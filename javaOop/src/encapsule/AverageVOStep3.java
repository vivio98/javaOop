package encapsule;

public class AverageVOStep3 {
	private String name;
	private int kor;
	private int eng;
	private int tot; // �ʵ忡 �ִ� �ν��Ͻ� ����
	private double avg;
	/*
	 * �޼ҵ���� �����ϴ� ������ ���� �ִ� �ʵ� ������ 
	 * �����ؼ� �ʿ��� ����� �ϵ��� �� ���� ������,
	 * ���ȿ� ����� ���� ������ �߻��߽��ϴ�.
	 * ���� ���̳ĸ�  ... �ʵ忡 �ִ� ������ ������ �����ؼ� 
	 * �б�� ����(�����ͼ���) �� �����ؼ��� �ȵ˴ϴ�.
	 * readOnly ��� ����� �����е��� ���� ��� ����� 
	 * �� ���� �ֵ�, ���� �� ���̶�� ������ �� ���� ���� ���Դϴ�.
	 * ���������� ȣũ�� ���������� ��ũ�� �����Ͽ� �ٲ� �� �ִ� ���� 
	 * step2 �� �������̾����ϴ�.
	 * ���� ����� �ٽ� �и��Ͽ� �б�� ���� ������� �����ϴ�.
	 * �̶� �б⸦ get~() ��� �ϰ� ���⸦ set~() ��� �մϴ�. ===> !!! ���� �߿� : ����ȭ(ĸ��ȭ) �Դϴ�.
	 * ��Ŭ���� ������ �ʵ尪�� ���� �޼ҵ� �̸� �ִ� ���� �ڵ�ȭ �߽��ϴ�.
	 * getter(�б���) �� setter(�� ����)�� �޼ҵ带 �ڵ����� �������ݴϴ�.
	 * ����Ű�� ALT + SHIFT + S ���� 
	 * generate getter and setter �� �����Ͻø� �˴ϴ�. 
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		/*
		 * �ڵ����� ��Ŭ������ ���ؼ� �޼ҵ��
		 * ����Ÿ��, �Ķ���� �� ������Ų �� 
		 * ������ �ʿ信 ���� �ణ����
		 * �����ϴ� �̼������� ���� �ڵ��� �ϼ��Ͻø� �˴ϴ�.
		 
		  *��ü ������ 
		 * 4�� Ư¡
		 * ����ȭ(encapsule) => getter/setter
		 * ���(inhebitance) => extends
		 * �߻�ȭ(abstraction) = >implements
		 * ������(polymorphism) =>overriding,overloading
		 */
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int kor, int eng) {
		this.tot = kor + eng;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	

}
