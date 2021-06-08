package package6;

public class RemoteControlEx {

	public static void main(String[] args) {
		Audio au = new Audio();
		au.turnOn();
		au.setVolume(20);
		au.setMute(true);
		au.setMute(false);
		au.turnOff();
		
		RemoteControl.changeBattery();
		
	}

}
