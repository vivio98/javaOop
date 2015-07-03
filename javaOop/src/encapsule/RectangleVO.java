package encapsule;

public class RectangleVO {
	// 동일한 타입의 변수 선언시 반복되는 타입은 생략가능
	private int width, height, area;
	
	//생성자 자동 완성 단축키 간단합니다 필드 선언 종료직후 ctrl + space
	 public RectangleVO() {
		// 이것은 디폴트 생성자라고 하며 파라미터가 없는 것이 특징
		 // 이것이 보이지 않는다 하더라도, 내부적으로는
		 // 완성되어 있다. 따라서 방금 전에 하셨던 PayVO역시
		 // 내부적으로는 파라미터 없는 생성자가 만들어져있다
        // 제가 이것을 호출(CALL)	한 이유는 생성자를 여러개 만들어서
		// 사용하려고 하는데 , 이것을 생성자 오버로딩이라 한다.
		 //오버로딩을 쉽게 하는 단축방법
		 this(0,0);
	 
	 
	 
	 }

	public RectangleVO(int widht, int height) {
		this.area = width*height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int widht,int height) {
		this.area = widht * height;
	}
	

}
