package package4;

public class RemoteControlEx {

	public static void main(String[] args) {
		SmartTelevison st = new SmartTelevison();
		st.turnOn();
		st.setVolume(-20);
		st.turnOff();
		st.search("50");
		
		RemoteControl rc = st;
		Searchable sc = st;
		rc.turnOn();
		rc.setVolume(-10);
		rc.turnOff();
		
		sc.search("30");

	}

}
