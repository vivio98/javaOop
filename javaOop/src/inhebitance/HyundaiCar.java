package inhebitance;
/*
 * @ Date : 2015 .06 22
 * @ Author : itbank
 * @ story : Car ������ ���� ����� �ǹ�
 * Ű���� extends �� ����ϸ�
 * ��Ӱ��谡 �����Ǹ� �ڽ� Ŭ������ 
 * �θ�Ŭ������ ��� �ν��Ͻ� ������ �޼ҵ带 ��밡���ϰ� �ȴ�.
 * �ٸ� �θ�Ŭ������ �ν��Ͻ� ������ private �̸�
 * getter /setter �� ����ϴµ� �� �� �θ��� �޼ҵ��
 * super ��� Ű���带 ���ذ����´�.
 */
public class HyundaiCar extends Car{
   private String  brand;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}
   
}
