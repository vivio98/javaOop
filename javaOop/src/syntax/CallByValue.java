package syntax;
/*
 * 
 * Story callByValue 문법
 */

public class CallByValue {
	/*
	 * 메소드 값을 전달하는 방법
	 * -Call by Value
	 * -메소드 를 한 문자, 상수 문자열, 숫자를 전달하면 전부 값에 의한 전달
	 * 즉 call By Value 라고 한다.
	 * -C언어인 경우 숫자, 문자 계열만 Call By Value 이고,
	 * 문자열은 char * 형 이므로 Call By Address 라고 한다.
	 * -Call By Value 인 경우 값을 전달하면 값을 전송한 원본 변수는 변형이 안된다.
	 * 단지, stack 간의 값이 복사된다.
	 * -Call By Reference 의 경우 참조값(Hash Code) 을 전달한 객체는 자신의 참조값이 전달 됨으로서 값의 변화가 발생할 수 있다.
	 */
	 /*
	  * Call By Reference 참조값에 의한 호출
	  * -원본 객체의 데이터 가 변경된다.
	  * 변경을 목적으로 하는 경우 이용된다.
	  * 
	  */
      /*
       * String 객체의 데이터 전달 유형
       * -String 객체는 객체임으로 내부적으로 Call By Reference  를 사용하나
       * -문자열 할당등의 조작시 무조건 Call By Value 기능으로 작동한다.
       * -문자열이 같으면 멤버 변수나 지역변수는 같은 Hash Code 값을 가지고 잇다
       * -그리고 둘의 구분은 영영 없어진다.
       * -그러나 새로운 문자열이 지역변수에 대입되면
       * -또 다른 Hash Code 가 발생되면서 멤버변수와 구분되어 지게된다.
       * 
       */
}
