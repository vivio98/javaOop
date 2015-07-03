package abstraction;

/*
 *  DAYE 0624
 *  AUTHOR
 *  STORY �������̽� Ÿ������ ������ ����Ŭ����
 */
public class BankBook implements Account {

	private String accouontNo; // ���¹�ȣ
	private String ownerName; // ��������
	private String password; // ������
	private int restMoney; // �ܾ�
	public static final String BANK_NAME = "����Ƽ��ũ";

	public BankBook(String accouontNo, String ownerName, String password,
			int restMoney) {
		this.accouontNo = accouontNo;
		this.ownerName = ownerName;
		this.password = password;
		this.restMoney = restMoney;

	}

	// ������ ����Ű CTRL+SPACE

	public String getAccouontNo() {
		return accouontNo;
	}

 

	public String getOwnerName() {
		return ownerName;
	}

	 

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		password = password;
	}

	public int getRestMoeny() {
		return restMoney;
	}

 
	

	@Override
	public void deposit(int money) {
		if (money <= 0) {
			System.out.println("�Աݾ��� 0���� Ŀ���մϴ�.");
		} else {
      this.restMoney += money;
 		}
		
	}

	@Override
	public void withdraw(int money) {
		 if (money <= 0) {
			System.out.println("��ݾ��� 0���� Ŀ���մϴ�.");
		} else if(getRestMoeny()<=money){
		System.out.println("��ݾ��� �ܾ׺��� Ů�ϴ�.");
		}else{
		 this.restMoney -= money;
		}
		
	}
	/*
	 * java ������ ���� ���Ǵ� Ŭ������ �������̽��� �̹� ���� �Ǵ�
	 * ������ �� �����ڵ��� �̸� ������ ���Բ� �ϰ� �ֽ��ϴ�.
	 * ���� ��� ��ĳ��, �ý��� ���� ���Դϴ�. 
	 *��ó�� �̸� ������� Ŭ���� �� �������̽��� API ��� �մϴ� 
	 *�� �� �ֻ��� ��ü�� Object��� �ϸ�, ��  object �� Ŭ������ �ڹٿ��� ��ü�� ����� ���̶�� ������ ����� �޽��ϴ�.
	 *�׷��� object �� �޼ҵ� ���� �ڹٰ�ü��� ������̵�
	 *����� �� �ֽ��ϴ�.
	 *�̰� ����ϴ� ����� Ŭ���� ���ο��� �� ������ CTRL + SPACE �Դϴ�
	 *
	 */
@Override
public String toString() {
	
	return "����� ����\n"
			+ "[ "+BANK_NAME+"]\n"
			+"���¹�ȣ : "+getAccouontNo()+"\n"
			+"���¸� :" +getOwnerName()+"\n"
			+"��� : ***********\n"
			+"�ܾ� :"+getRestMoeny()+"\n"
			+"���� ������ �����Ǿ����ϴ�.";
}

}
