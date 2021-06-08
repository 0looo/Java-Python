
public class Ex11 {
	static int idx;
	static double value1;
	static {
		idx = 10;
		value1 = 20.5;
	}
	static void val() {
		idx = 20;
		value1 = 100.5;
	}
	
	static void val(int i, double j) {
		idx = i;
		value1 = j;
	}

}
