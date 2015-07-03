package lang;

import java.util.Arrays;


public class StringClass {
	public static void main(String[] args) {
		String fruit = "apple,banna,cherry,orange";
		String[]fruits = fruit.split(",");
        for (int i = 0; i < fruits.length; i++) {
	    System.out.println(fruits[i]+"\t");
	
}
	System.out.println();
	//String[]fruits2 = fruit.split(",",2); //공백을 다 주지 않고 지정값만 줌
      
	for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]+"\t");
    System.out.println(Arrays.toString(fruit.split(",")));

}
	}
	 

	

}
