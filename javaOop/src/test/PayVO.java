package test;

public class PayVO {
   /*
    * ����
    * ===ȫ�浿�� 6���޿�����===
    * ���� : 300����
    * ���� : 30����
    * �Ǳ޿� : 270����
    * * ===�������� 6���޿�����===
    * ���� : 400����
    * ���� : 40����
    * �Ǳ޿� : 360����
    */
	String name; //�����̸�
    int salary; //�޿�
    /*
 ������ ���ѹα� �����̶�� ������ �˾ƾ� �� ����
���� �����Ǿ���ϴ� �ʵ尪�̴�
�̷��� ���� ���µǾ� �о�� �ϹǷ� ����� ó���ϸ�
static �̶�� Ŭ���� ���� Ű���� �� �ٿ��� �������ش�
�׷��� �������� ������ ���α׷��ֿ����� �̷� ������
���� �빮�ڷ� ǥ���ؼ� �������ش�
setter,getter�� ����� �ȵȴ� �ֳ��ϸ� ���尪���̱� �����̴�
     */
    public static final double TAX=0.1; // ���� 10%�� ������
     int income; // �Ǳ޿� =�޿� - ���� (�޿�*����)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
     
     //getter setter ����� alt+shift+s
     
     

}
