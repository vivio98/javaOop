package lang;

public class Person {
	private String ssn; //�ֹι�ȣ
	public Person(String ssn) {
		 this.ssn = ssn; // �¾�ڸ��� �ֹι�ȣ ����
	}
	public String getSsn() {
		return ssn;
 
	}
  
public boolean equals(Object obj) {
	 boolean flag = false; //�������� �ʱ�ȭ
	/*
	  * Object �� ��� ������ Ÿ���� �ǹ��ϱ� ������ �ݵ�� �ֹι�ȣ�� ������ �ִ� person ������
	  * Ȯ���ؾ� �ֹι�ȣ ��ġ���θ� ���� �� �ֱ� ������
	  * ��ü ĳ���� ������ instancof �� ����Ѵ�,
	  * �̷� ����� Valudation �� ��ȿ�� üũ��� �Ѵ�.
	  */
	if (obj != null && obj instanceof Person) {
		// �� ������� �ǹ̴� obj��  null�� �ƴϸ鼭 person �� 
		// �ν��Ͻ����� true �� �����Ѵ�,
	return ssn == ((Person)obj).ssn;
	} else {
		return flag; // false �� �ʱ�ȭ ������  false�� ����
	}
	
}  
}
