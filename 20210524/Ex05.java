
public class Ex05 {
	public static void main(String[] args) {
		int i = 10;
		Integer i1 = i; // boxing
		int i2 = Integer.parseInt("10");
		System.out.println(i2);
		
		i1 = 10;  // boxing
		Integer i4 = 30;  // boxing
		i = i4;
		
		// 
		Long l = Long.parseLong("10");
			 l = Long.valueOf("10");
		
		Float f = Float.parseFloat("10.5");
			  f = Float.valueOf("10.5");
		
		Double d = Double.parseDouble("15.2");
			   d = Double.valueOf("15.2");
			   
		Boolean b;
		
		
	}

}
