package syntax;
/*
 * date : someday
 *author
 *stroy try catch 문법
 */
public class TryCatch {
	public static void main(String[] args) {
		int a = 5, b =0;
		int mok = 0, nmg = 0;
		try {
			mok = a/b;
			nmg = a%b;		
			
		} catch (Exception e) {
			 e.printStackTrace();
			 System.out.println("에러 바생");
		}
	System.out.println(a + "/"+b+"="+ mok );
	System.out.println(a+"%"+b+"="+nmg);
	
	}
	/*
	 * 예외는 프로그램 개발시 발생하는 에러와 다른 현상
	 * 프로그램 개발시 발생하는 에러에 대한 대체는 필수
	 * 안정적으로 컴파일 로 운영중에 발생하는 에러의 대부분의 예와...
	 * 예외는 코드상에 발생한 에러와 다르며 
	 * 컴파일시 에러가 발생하지않음
	 */
	/*
	 * try {
		예외가 발생할 여지가 있는 코드를 개발자가
		선별하여 지정.
		IO,DBMS, Network 관련 코드가 주로 위치
	} catch (Exception e) {
		
	}
	 * */
	 

}
