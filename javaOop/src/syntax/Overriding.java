package syntax;
/*
 * 
 * 
 * @Story  �������̵� ����
 */

public class Overriding {public static void main(String[] args) {
	Parents p = new Parents();
	p.show();
	child c = new child();
	c.show();
}
	
	
	/*
	 * Method Overridng
	 * ��Ӱ��迡�� super �� ����� �޼ҵ带 sub���� �ٽ� �����Ѱ��
	 * -�̷� ��� Super �� �޼ҵ�� ���õȴ�.
	 * ���� �޼ҵ尡 super �� sub ���� ��� ����Ǿ�����,
	 * 
	 */
	/*
	 * �������̵��� ����
	 * -Ŭ������ �������� ������ �� �ִ�.
	 * -��, super�� sub������ �޼ҵ��,�Ķ���Ͱ���,�Ķ���� ������ Ÿ���� ���ƾ���
	 * Super�� ���� �޼ҵ带 ����� �ֳ� ���� �̸��� �޼ҵ尡 sub �� �����Ѵٸ�
	 * sub�� �ִ� �޼ҵ� �� �켱 ����ؾ���.
	 * super �� �޼ҵ� ����� �����ϸ鼭,��Ȳ�� ���� sub �� ������ �����
	 * super �� �޼ҵ带 ĸ��ȭ �Ѵٰ� ���� �ִ�.
	 */

}
class Parents{
	void show(){
		System.out.println("Parents�� show()�� ����..");
	}
}
class child extends Parents{
 @Override
void show() {
	
	//super.show(); �̰��� �θ��� �޼ҵ带 �״�� ����ϰڴٴ� �ǹ�
	 System.out.println("child �� show()�� ����..");
}
	
}
