package package5;

public class RemoteControlEx {

	public static void main(String[] args) {
		Audio au = new Audio();
		au.turnOn();
		au.setVolume(20);
		au.setMute(true);	// default : ������ ���� �ʰ� ��밡��
		au.setMute(false);
		au.turnOff();
		
		
		
		
	}

}
