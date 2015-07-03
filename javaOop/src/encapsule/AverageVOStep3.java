package encapsule;

public class AverageVOStep3 {
	private String name;
	private int kor;
	private int eng;
	private int tot; // 필드에 있는 인스턴스 변수
	private double avg;
	/*
	 * 메소드들이 공유하는 데이터 값이 있는 필드 영역에 
	 * 접근해서 필요한 기능을 하도록 한 것은 좋은데,
	 * 보안에 취약해 지는 문제가 발생했습니다.
	 * 무슨 뜻이냐면  ... 필드에 있는 값들은 누구나 접근해서 
	 * 읽기와 쓰기(데이터수정) 이 가능해서는 안됩니다.
	 * readOnly 라는 기능은 여러분들이 예를 들어 댓글을 
	 * 볼 수는 있되, 남이 쓴 글이라면 수정을 할 수는 없을 것입니다.
	 * 마찬가지로 호크의 국어점수를 헐크가 접근하여 바꿀 수 있는 것이 
	 * step2 의 문제점이었습니다.
	 * 따라서 기능을 다시 분리하여 읽기와 쓰기 기능으로 나눕니다.
	 * 이때 읽기를 get~() 라고 하고 쓰기를 set~() 라고 합니다. ===> !!! 아주 중요 : 은닉화(캡슐화) 입니다.
	 * 이클립스 에서는 필드값에 대한 메소드 이름 주는 것을 자동화 했습니다.
	 * getter(읽기기능) 과 setter(쓰 기기능)의 메소드를 자동으로 생성해줍니다.
	 * 단축키는 ALT + SHIFT + S 에서 
	 * generate getter and setter 을 선택하시면 됩니다. 
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		/*
		 * 자동으로 이클립스를 통해서 메소드명
		 * 리턴타입, 파라미터 를 생성시킨 후 
		 * 각각의 필요에 따라 약간씩만
		 * 수정하는 미세조정을 통해 코딩을 완성하시면 됩니다.
		 
		  *객체 지향언어 
		 * 4대 특징
		 * 은닉화(encapsule) => getter/setter
		 * 상속(inhebitance) => extends
		 * 추상화(abstraction) = >implements
		 * 다형성(polymorphism) =>overriding,overloading
		 */
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int kor, int eng) {
		this.tot = kor + eng;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	

}
