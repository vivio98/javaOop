package abstraction;

public class ProductSpec implements Product {
    private String company; // ������
    private String name; //��ǰ��
    private String serialNo; //�Ϸù�ȣ
	
    public void setInfo(String company,String name,String serialNo){
    	this.company = company;
    	this.name = name;
    	this.serialNo = serialNo;
    }
    
    @Override
	public void getInfo(){
		System.out.println("������ :" + this.company); 
		System.out.println("��ǰ�� :" + this.name); 
		System.out.println("�ø���ѹ� :" + this.serialNo); 
	 
	}

}
/*
 * ��Ŭ���� ����Ű ����� ���� ���( �⺻ ����Ű�ܿ� �߰� ��Ű��)
 * �޴���>window>preference > general > key > copyline �Է� ctrl+j
 * delete line �Է� > ctrl +d
 * CTRL + B, CTRL + E
*/