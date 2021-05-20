package package6;

public class Television implements RemoteControl{
	// 필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume> MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Tv 무음 처리합니다.");
		}else {
			System.out.println("Tv 무음 해제합니다.");
		}
	}
	
}
