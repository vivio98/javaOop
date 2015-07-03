package inhebitance;


/*
 *  static 은 Car,CAR 로 호출 가능하게 끔 클래스 변수로 만드는 키워드
 *  final 은 "쟈동차" 를 바꿀 수 없도록 하는 상수 키워드
 */
public class Car {
	public static final String CAR = "자동차";
	private String companyName; // 변수기 때문에 값 할당을 하지 않음
	
	public Car() { // 파라미터가 없는 생성자는 이렇게 일부러 만들지 않아도 클래스 내부에 있는 것으로 자동 생성 된다.
 		           //  따라서 위처럼 생성해 두는 것은 하나마나한 짓(?) 이다. 
		
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
