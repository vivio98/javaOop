package syntax;
/*
 * 
 * 
 * @Story  오버라이딩 문법
 */

public class Overriding {public static void main(String[] args) {
	Parents p = new Parents();
	p.show();
	child c = new child();
	c.show();
}
	
	
	/*
	 * Method Overridng
	 * 상속관계에서 super 에 선언된 메소드를 sub에서 다시 선언한경우
	 * -이런 경우 Super 의 메소드는 무시된다.
	 * 같은 메소드가 super 와 sub 에게 모두 선언되었으나,
	 * 
	 */
	/*
	 * 오버라이딩의 목적
	 * -클래스의 다형성을 구현할 수 있다.
	 * -딘, super와 sub사이의 메소드명,파라미터갯수,파라미터 데이터 타입이 같아야함
	 * Super가 가진 메소드를 상속해 주나 같은 이름의 메소드가 sub 에 존재한다면
	 * sub에 있는 메소드 를 우선 사용해야함.
	 * super 의 메소드 기능을 유지하면서,상황에 따라 sub 외 변형된 기능을
	 * super 외 메소드를 캡슐화 한다고 볼수 있다.
	 */

}
class Parents{
	void show(){
		System.out.println("Parents의 show()를 수행..");
	}
}
class child extends Parents{
 @Override
void show() {
	
	//super.show(); 이것은 부모의 메소드를 그대로 사용하겠다는 의미
	 System.out.println("child 의 show()를 수행..");
}
	
}
