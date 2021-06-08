
public class Ex10 {
	public static void main(String [] args) { 	
		//7단
		int i = 1;
		while(i<=9) {
			System.out.println("7 * "+i+" = "+ 7*i);
			i++;
		}
		//7단 홀수곱
		for(int j = 1; j<10; j++) {
			if(j%2==0) continue;
			System.out.println("7 * "+j+" = "+ 7*j);
		}
		
		for(int j = 1; j<10; j+=2) {
			System.out.println("7 * "+j+" = "+ 7*j);
		}
		////
		i = 1;
		while(i<10) {
			System.out.println("7 * " + i + " = " +7*i);
			i +=2;
		}
		/////
		i = 0;
		while(i<10) {
			i ++;
			if(i % 2==0)continue;
			System.out.println("7 * " + i + " = " +7*i);
			
		}
	}
}
