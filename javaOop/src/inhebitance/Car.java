package inhebitance;


/*
 *  static �� Car,CAR �� ȣ�� �����ϰ� �� Ŭ���� ������ ����� Ű����
 *  final �� "����" �� �ٲ� �� ������ �ϴ� ��� Ű����
 */
public class Car {
	public static final String CAR = "�ڵ���";
	private String companyName; // ������ ������ �� �Ҵ��� ���� ����
	
	public Car() { // �Ķ���Ͱ� ���� �����ڴ� �̷��� �Ϻη� ������ �ʾƵ� Ŭ���� ���ο� �ִ� ������ �ڵ� ���� �ȴ�.
 		           //  ���� ��ó�� ������ �δ� ���� �ϳ������� ��(?) �̴�. 
		
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
