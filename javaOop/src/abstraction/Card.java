package abstraction;

public class Card {
	static final int WIDTH=150;
	static final int HEIGHT=300;
	
	public static final String KIND ="하트";
			private int num;
	public Card() {
		this.num = (int)(Math.random()*13)+1;
		/*
		 * Math 클래스는 수학과 관련된 클래스
		 * Math.ramdom() 메소드는 범위 내에서 랜덤숫자를
		 * 발생시키는 역할 13은 리미트 값, +1은 start 값
		 */
	}
	
public int getNum() {
	return num;
}

	 
	}
	
	

