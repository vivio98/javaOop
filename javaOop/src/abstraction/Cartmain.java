package abstraction;

public class Cartmain {
	public static void main(String[] args) {
	TV samsungTV = new TV();
	samsungTV.setInfo("�Ｚ", "���̵�TV", "123-456","42��ġ","LCD");
	//samsungTV.getInfo();
	Notebook lgNotebook = new Notebook();
	lgNotebook.setInfo("LG","�׷�","gram-123-456","����ھ�","8G","500GB");
	//lgNotebook.getInfo();
	
	/*
	 * �����ڸ� ������� �ʴ� �迭������ �������̽� Ÿ�����ε� �����ϴ�
	 * 
	 */
	Product cart[] = new Product[2];
	cart[0] = samsungTV;
	cart[1] = lgNotebook;
	for (Product product : cart) {
		product.getInfo();
		
	}
}
}