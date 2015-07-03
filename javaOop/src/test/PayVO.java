package test;

public class PayVO {
   /*
    * 문제
    * ===홍길동의 6월급여내역===
    * 본봉 : 300만원
    * 세금 : 30만원
    * 실급여 : 270만원
    * * ===강감찬의 6월급여내역===
    * 본봉 : 400만원
    * 세금 : 40만원
    * 실급여 : 360만원
    */
	String name; //직원이름
    int salary; //급여
    /*
 세율은 대한민국 국민이라면 누구나 알아야 할 정보
따라서 공개되어야하는 필드값이다
이러한 값은 오픈되어 읽어야 하므로 상수로 처리하며
static 이라는 클래스 변수 키워드 를 붙여서 오픈해준다
그래서 강제성은 없지만 프로그래밍에서는 이런 값들은
전부 대문자로 표기해서 구분해준다
setter,getter를 만들면 안된다 왜냐하면 고장값이이기 때문이다
     */
    public static final double TAX=0.1; // 세율 10%는 고정값
     int income; // 실급여 =급여 - 세액 (급여*세율)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
     
     //getter setter 단축기 alt+shift+s
     
     

}
