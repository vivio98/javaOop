package inhebitance;

public class Iphone extends CelPhone{
	private String data;
	public static final String BRAND = "������";
	/*�������� �귣�� ����� ���Ұ�, ������ �޴����� �����Ѵ�*/
	public static boolean TRUE = true;
	
	//����Ʈ �����ڸ� ������
	
	public String getData() {
		return data;
	}
	public void setData(String name,String data) {
		/*
		 * this.�� �ش� Ŭ���� ������
		 * �޼ҵ� �� �ʵ��� �ν��Ͻ� ����, Ŭ���� ���� ��
		 * ȣ�� �Ҽ� �ְ�.
		 * super. �� extends(���)���� �θ� Ŭ������ �޼ҵ峪 �ʵ尪 �� ȣ�� �Ҽ� �ִ�.
		 */
		
		
		
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
		 super.getCompany()+"\t"+
				super.getCall()+"\t"+
				this.data+ ":�޽��� ����";
 	}
	
	

}
