
public class Ex6_1 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println(t.channel);
	}

}
class Tv{
	String color;
	boolean power;  // default = false
	int channel;	// default = 0
						// false
	void power() {power = !power;}
	void channelUp() {++channel;}	
	void channelDown() {--channel;}
}