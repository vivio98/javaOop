package syntax;
/*
 * date : someday
 *author
 *stroy try catch ����
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
			 System.out.println("���� �ٻ�");
		}
	System.out.println(a + "/"+b+"="+ mok );
	System.out.println(a+"%"+b+"="+nmg);
	
	}
	/*
	 * ���ܴ� ���α׷� ���߽� �߻��ϴ� ������ �ٸ� ����
	 * ���α׷� ���߽� �߻��ϴ� ������ ���� ��ü�� �ʼ�
	 * ���������� ������ �� ��߿� �߻��ϴ� ������ ��κ��� ����...
	 * ���ܴ� �ڵ�� �߻��� ������ �ٸ��� 
	 * �����Ͻ� ������ �߻���������
	 */
	/*
	 * try {
		���ܰ� �߻��� ������ �ִ� �ڵ带 �����ڰ�
		�����Ͽ� ����.
		IO,DBMS, Network ���� �ڵ尡 �ַ� ��ġ
	} catch (Exception e) {
		
	}
	 * */
	 

}
