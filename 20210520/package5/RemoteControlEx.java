package package5;

public class RemoteControlEx {

	public static void main(String[] args) {
		Audio au = new Audio();
		au.turnOn();
		au.setVolume(20);
		au.setMute(true);	// default : 재정의 하지 않고 사용가능
		au.setMute(false);
		au.turnOff();
		
		
		
		
	}

}
