package inhebitance;

public class AndroidPhone extends Iphone {
	public static final  String BRAND ="�ȵ���̵�";
	private String data;

	// ����Ʈ ������ ����
	
	
	public String getData() {
		return data;
	}
	public void setData(String data,String name) {
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
		 super.getCompany()+"\t"+
				super.getCall()+"\t"+
				this.data+ ":�޽��� ����";
		this.data = data;
	}
	
	 

}
