package encapsule;
/*
 * @
 * @
 * @ Stroy 은닉화에 대한 예제
 * 은닉화란 필드에 있는 데이터값을 아무나 접근하지 못하게 하고 
 * getter 와 setter 을 통해 권한 을 획득한 개체만
 * 데이터에 접근 하도록 하는 개념이다.
 */
/*
 * 접근제한자 private
 * 보안성이 향상됨. 컴포넌트의 독립성이 보장됨
 * 컴퍼넌트간 간섭을 최소화 하여 독립성을 유지 할수 있음
 * 데이터 은닉
 */
import java.util.Scanner;

public class AverageMainStep3 {
	public static void main(String[] args) {
		
	AverageVOStep3 hulk = new AverageVOStep3();
	AverageVOStep3 iron = new AverageVOStep3();
    AverageVOStep3 hawk = new AverageVOStep3();
    /*
     * AverageVOStep3 은 클래스 이름
     * hulk , iron , hawk 는 인스턴스 (객체)
     * new 는 생성자 키워드
     * averageVOStep3() 클래스 이름과 동일하지만 메소드 표시() 가 
     * 있는 이것은 생성자
     */
   Scanner scanner = new Scanner(System.in);
    System.out.println("이름을 입력해주세요(헐크)"); 
    hulk.setName(scanner.next()); 
    System.out.println("이름입력해주세요(아이언)");
    iron.setName(scanner.next());
    hawk.setName(scanner.next());
    
/*점수 저장
	System.out.println("헐크의 국어점수 :");
	hulk.setKor(scanner.nextInt());	
	hulk.kor = scanner.nextInt();
		System.out.println("헐크의 영어점수 :");
		hulk.setEng(scanner.nextInt());
		hulk.eng = scanner.nextInt();
		System.out.println("아이언의 국어점수 :");
		iron.setKor(scanner.nextInt());
		iron.kor = scanner.nextInt();
		System.out.println("아이언의 영어점수 :");
		iron.setEng(scanner.nextInt());
		iron.eng = scanner.nextInt();
		System.out.println("호크의 국어점수 :");
		hawk.setKor(scanner.nextInt());
		hawk.kor = scanner.nextInt();
		System.out.println("호크의 영어점수 :");
		hawk.setEng(scanner.nextInt());
		hawk.eng = scanner.nextInt();
		*/
	/*평균계산*/
		hulk.setAvg(hulk.getTot());
		iron.setAvg(iron.getTot());
		hawk.setAvg(hawk.getTot());
		/*총점계산*/
		hulk.setTot(hulk.getKor(), hulk.getEng() );
		iron.setTot(iron.getKor(),hulk.getEng() );
		hawk.setTot(hawk.getKor(), hulk.getEng());
		
		System.out.println("헐크의 총점 :"+hulk.getTot());
	//	System.out.println(아이언의 );
		System.out.println();
	}
	

}
