package package1;

import java.util.Arrays;

public class Ex02Test {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int [] i = {1,2,3,4,5};
		int [] i1 = new int [] {1,2,3,4,5};
		int [] i2 = new int [5];
		
		i2[0] = 1;
		i2[1] = 2;
		i2[2] = 3;
		i2[3] = 4;
		i2[4] = 5;
		
		Ex01 ex = new Ex01();
		Ex01 ex1 = new Ex01();
		
		// °´Ã¼¹è¿­
		Ex01 [] arr = new Ex01 [3];
		arr[0] = new Ex01();
		arr[1] = new Ex01();
		arr[2] = new Ex01();
		
		arr[0].num1 = 10;
		arr[0].num2 = 20;
		arr[0].add();
		
		arr[1].num1 = 100;
		arr[1].num2 = 200;
		arr[1].sub();

	}

}
