package abstraction;

public class OrangImpl implements FruitInterface {

	@Override
	public void dispaly(String str) {
		System.out.println(str+"오렌지 입니다");
		
		
	}
	/*
	 * 인터페이스에 정의된 추상클래스가 ㅏㅇ닌
	 * 구현된 클래스에서 추가로 메소드를 더 만들었다,
	 */
	public int getCount(){
		return 100;
	}

}
