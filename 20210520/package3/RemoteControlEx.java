package package3;

public class RemoteControlEx {

	public static void main(String[] args) {
		Audio au = new Audio();
		Television tv = new Television();
		
		au.turnOn();
		au.setVolume(20);
		au.turnOff();
		
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
		
		RemoteControl smartRemocon = null;
		smartRemocon = new Audio();
		smartRemocon.turnOn();
		smartRemocon.setVolume(15);
		smartRemocon.turnOff();
		
		smartRemocon = new Television();
		smartRemocon.turnOn();
		smartRemocon.setVolume(2);
		smartRemocon.turnOff();
	}

}
