package lang;
/*
 * @ Date : 2015.06
 * @ Author : me
 * @Story equals() Ȱ�뿹��
 */
public class PersonMain {
    public static void main(String[] args) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		String result =""; //�������� �ʱ�ȭ
		result = (p1 == p2) ?"������" : "�ٸ����";
		//���׿�����(if -else ��� �����ϰ� ���
	   //(�����) ? true �ϰ�� : false �ϰ��;
	System.out.println("p1 == p2 �ϰ�� ��� :" + result);
    result = (p1.equals(p2)) ? "������" :"�ٸ����";
    //��� �� �ٸ� ������� ��µǴ� ���� ������ �� �� �ƴ϶� == �������ּҰ� �� �̱� �����̴�.
	//�ּҰ� �񱳰� �ƴ� ������ �񱳰���� ����
	//�ּҰ� : Call by Reference --> �ڹٿ��� ���� �ּҷ� �޸� ����
	//�ּҰ� : Call by Value --> c���� ���� �޸� ����
  
    }	
    

}
