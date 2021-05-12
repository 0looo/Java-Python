
public class Ex13 {

	public static void main(String[] args) {
		int num1, num2, num3, num4;
		num1 = (int)(Math.random()*45) +1; // 1 ~ 45
		
		do{num2 = (int)(Math.random()*45) +1; // 1 ~ 45
		}while(num1==num2);
		
		do {num3 = (int)(Math.random()*45) +1; // 1 ~ 45
		}while(num1==num3||num2==num3);
		
		do {num4 = (int)(Math.random()*45) +1; // 1 ~ 45
		} while(num1 == num4||num2==num4||num3==num4);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		

	}

}
