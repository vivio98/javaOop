package abstraction;


public class Notebook extends ProductSpec{
	private String cpu;
    private String ram;
    private String hdd;
    
   
    @Override
    public void getInfo() {
    	
    	super.getInfo();
    	System.out.println("cpu���� :"+this.cpu);
    	System.out.println("���θ޸� ����"+this.ram);
    	System.out.println("�ϵ��ũ ���� :"+this.hdd);
    	
    
    }
    public void setInfo(String company, String name, String sid,
			String cpu, String ram, String hdd){
	/*
	 * �Ķ���ͷ� �Ѿ�� ���鵵 �ٷ� super ��
	 *���� �θ� �޼ҵ��� �Ķ���� �� ������ 
	 *�ٷ� set �մϴ�
	 *��..�⺯�� ������ �θ��ڽ� ���迡�� 
	 *�����ϹǷ�, �θ��� �㺯�� ���� ���� ���� �����������ϴ�.
	 */
	super.setInfo(company, name,sid);
	this.cpu = cpu;
	this.hdd = hdd;
	this.ram = ram;
	/*
	 * 
	 */
	
	} 
}
/*
 @ Stroy : Ŀ�� ��üŬ������ ���� ������
 �Ʒ� �� ó�� �ϳ��� Ŭ������ ������ 
 ��� �ݺ��ؼ� ���� �ٸ� ��ü�� ������ �� 
 ������ ��ɿ� ���� �ݺ� ����ϴ� ����
 [������]�����ε��̶�� �Ѵ�
 �Ʒ� �������� �����ڸ� ������ �ݺ������Ƿ� ������ �����ε��̰� 
 ���� �޼ҵ带 �Ķ���͸� �ٸ� ���·� �������� �����̸� ���� �����Ͽ��ٸ�
 �̸� [�޼ҵ�]�����ε��̶�� �Ѵ�.
 */
