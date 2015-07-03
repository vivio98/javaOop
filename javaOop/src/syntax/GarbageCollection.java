package syntax;

import java.util.Scanner;

public class GarbageCollection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Garbage[]garbageCollection = new Garbage[10];
		//  ��ü ����
		for (int i = 0; i < garbageCollection.length; i++) {
			garbageCollection[i] = new Garbage(10);
		}
		for (int i = 0; i < garbageCollection.length; i++) {
			garbageCollection[i] = null;
		}
	//������ �޸� ��ü	
   System.gc();
	}
	
	/*
	 * 
	 * GarbageCollecting ������ �÷���
	 * - �ڹ� ������ �ڵ����� ������
	 * - ����޼ҵ� �ȿ��� ������ ��ü�� �޼ҵ� ���� �� ���� �޸𸮰� ȸ����
	 * -�⺯�� �޸� ȸ�� ������ �ٷ� ��ġ�� ��
	 * -������ ���� �ʴ� �޸� ����, system.gc()
	 * -�켱 ������ ���� ������� ����.
	 * -�Ϲ����� ��� ��� �����尡 ����� �� ����
	 * -gc()�� �����ϸ� ������ �޸� ȸ�� �۾��� �ϰ� �Ǿ�
	 * finalize()�� ȣ��ȴ�. �׷��� gc() ��ü�� ���� ���ϸ� �����ϹǷ� JVM�� �����ϵ�����
	 * 
	 */	 
 
}
class Garbage{
	int objNo; // ��ü��ȣ
	 public Garbage(int num){
		 objNo = num;
		 System.out.println("Garbage Class"+objNo+"�� �������...");
	 }
	 // ��ü �� �޸� ȸ�� �� �� �ڵ����� ȣ���
	 protected void finalize() throws Throwable{
		 System.out.println("Garbage Class"+objNo+"���� ���̴� �޸𸮰� ȸ����");
		 super.finalize();
	 }
}
