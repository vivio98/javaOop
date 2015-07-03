package lang;
/*
 * @ Date : 2015.06
 * @ Author : me
 * @Story equals() 활용예제
 */
public class PersonMain {
    public static void main(String[] args) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		String result =""; //지역변수 초기화
		result = (p1 == p2) ?"동일인" : "다른사람";
		//삼항연산자(if -else 대신 간단하게 사용
	   //(컨디션) ? true 일경우 : false 일경우;
	System.out.println("p1 == p2 일경우 결과 :" + result);
    result = (p1.equals(p2)) ? "동일인" :"다른사람";
    //결과 가 다른 사람으로 출력되는 것은 실제값 비교 가 아니라 == 이참조주소값 비교 이기 때문이다.
	//주소값 비교가 아닌 실제값 비교결과를 리턴
	//주소값 : Call by Reference --> 자바에서 간접 주소로 메모리 접근
	//주소값 : Call by Value --> c언어에서 직접 메모리 점유
  
    }	
    

}
