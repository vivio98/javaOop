package abstraction;

public class FruitMain {
	public static void main(String[] args) {
		/*
		 * 인터페이스는 객체를 만들 수 없다
		 * 즉 FruitInterFace F = new FruitInterface();
		 * 이것은 에러를 발생시킨다.
		 */
		FruitInterface apple = new AppleImpl();
			 	
	}	 
}	 
//이처럼 타입 정의만 인터페이스 로 하고 
// 생성자 메소드는 인터페이스를 구현한 클래스를 ㅏㄱ지고 
//객체 생성한다. ★★★★★★
//위처럼 코딩하면 바로 쫓겨난다!!

 /*
  * orange 클래스에 있는 getCount() 를 호출하고 싶다..
  * orange +getCount(); 이것은 정의는 되어 있으되 호출은 되지 않는다.
  */
	/*
	 * 위 처럼 되는 이유는 주어진 역할 만 수행하라는 뜻
	 * 즉,시키는 것 외 에 쓸대없는짓 하지마라.
	 * 프로그램 을 망친다				
	 */
			
		
		
		
		
	
		
	