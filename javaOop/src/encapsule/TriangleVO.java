package encapsule;
/*
 * @ date 2015.06
 * @author : itbank
 * @story : �����ڸ����� �ﰢ�� ���ϱ�
 */


public class TriangleVO {
	/*
	 * Ŭ������ ��ɿ� ���� �ڵ� ������ �������ϴ�
	 * main() ������ �ִ� Ŭ������ ������ ����Ŭ������� �θ��ڽ��ϴ�.
	 * main() ���� ���ο� �����Ϳ� �װ��� ó���ϴ� �����(statement)��
	 * ������ �ִ� Ŭ������ ��üŬ������� �θ��ڽ��ϴ�.
	 */
	/*
	 * ��üŬ������ �ʵ� ������ �������(=�ν��Ͻ����� + Ŭ��������)
	 * �� �޼��� ������ ����޼���� �����˴ϴ�.
	 * �ű⿡ Ư���� �޼ҵ��� �����ڰ� ��� ��ġ�մϴ�.
	  */
	
	 
	private double area;
	public TriangleVO() {
		this(0,0);
	}
	public TriangleVO(double garo, double sero ) {
		this.area= (garo*sero)/2;
		
	}
	public double getArea() {
		return area;
	}
	 
		

}
