package inhebitance;

public class AndroidPhone extends Iphone {
	public static final  String BRAND ="안드로이드";
	private String data;

	// 디폴트 생성자 생략
	
	
	public String getData() {
		return data;
	}
	public void setData(String data,String name) {
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
		 super.getCompany()+"\t"+
				super.getCall()+"\t"+
				this.data+ ":메시지 전달";
		this.data = data;
	}
	
	 

}
