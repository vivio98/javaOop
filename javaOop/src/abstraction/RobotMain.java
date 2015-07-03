package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 * 디자인 패턴 : 데코레이션 패턴
		 * 데코레이션 패턴( 케이크 만들 때 빵틀에다가 장식(생크림)얹는 패턴)
		 * 1.빵틀을 준비
		 */
		BasicBot myBot = new  BasicBot();// 빵틀준비
		GunBot mygun = new GunBot(myBot);
		mygun.status();
		mygun.chargeEnergy(50);
		mygun.status();
		mygun.shield(30);
		mygun.run();
		mygun.status();
		
	}

}
