package inhebitance;

public class Iphone extends CelPhone{
	private String data;
	public static final String BRAND = "아이폰";
	/*아이폰은 브랜드 상속을 막았고, 무조건 휴대폰만 생산한다*/
	public static boolean TRUE = true;
	
	//디폴트 생성자를 생각함
	
	public String getData() {
		return data;
	}
	public void setData(String name,String data) {
		/*
		 * this.은 해당 클래스 내부의
		 * 메소드 나 필드의 인스턴스 변수, 클래스 변수 를
		 * 호출 할수 있고.
		 * super. 은 extends(상속)받은 부모 클래스의 메소드나 필드값 을 호출 할수 있다.
		 */
		
		
		
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
		 super.getCompany()+"\t"+
				super.getCall()+"\t"+
				this.data+ ":메시지 전달";
 	}
	
	

}
