package abstraction;

/*
 *  DAYE 0624
 *  AUTHOR
 *  STORY 인터페이스 타입으로 생성된 통장클래스
 */
public class BankBook implements Account {

	private String accouontNo; // 계좌번호
	private String ownerName; // 계좌주인
	private String password; // 통장비번
	private int restMoney; // 잔액
	public static final String BANK_NAME = "아이티뱅크";

	public BankBook(String accouontNo, String ownerName, String password,
			int restMoney) {
		this.accouontNo = accouontNo;
		this.ownerName = ownerName;
		this.password = password;
		this.restMoney = restMoney;

	}

	// 생성자 단축키 CTRL+SPACE

	public String getAccouontNo() {
		return accouontNo;
	}

 

	public String getOwnerName() {
		return ownerName;
	}

	 

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		password = password;
	}

	public int getRestMoeny() {
		return restMoney;
	}

 
	

	@Override
	public void deposit(int money) {
		if (money <= 0) {
			System.out.println("입금액은 0보다 커야합니다.");
		} else {
      this.restMoney += money;
 		}
		
	}

	@Override
	public void withdraw(int money) {
		 if (money <= 0) {
			System.out.println("출금액은 0보다 커야합니다.");
		} else if(getRestMoeny()<=money){
		System.out.println("출금액이 잔액보다 큽니다.");
		}else{
		 this.restMoney -= money;
		}
		
	}
	/*
	 * java 에서는 자주 사용되는 클래스와 인터페이스를 이미 생성 또는
	 * 구현한 뒤 개발자들이 이를 가져다 쓰게끔 하고 있습니다.
	 * 예를 들면 스캐너, 시스템 같은 것입니다. 
	 *이처럼 미리 만들어진 클래스 와 인터페이스를 API 라고 합니다 
	 *그 중 최상위 객체를 Object라고 하며, 이  object 의 클래스는 자바에서 객체로 선언된 것이라면 무조건 상속을 받습니다.
	 *그래서 object 의 메소드 들은 자바객체라면 어느것이든
	 *사용할 수 있습니다.
	 *이걸 사용하는 방법은 클래스 내부에서 빈 공간에 CTRL + SPACE 입니다
	 *
	 */
@Override
public String toString() {
	
	return "입출금 계좌\n"
			+ "[ "+BANK_NAME+"]\n"
			+"계좌번호 : "+getAccouontNo()+"\n"
			+"계좌명 :" +getOwnerName()+"\n"
			+"비번 : ***********\n"
			+"잔액 :"+getRestMoeny()+"\n"
			+"으로 통장이 개설되었습니다.";
}

}
