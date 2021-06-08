package package5;


public interface RemoteControl {
	int MAX_VOLUME = 10;	// interface는 상수를 받음.
							// comfile하면 fianl이 자동생성됨.
	int MIN_VOLUME = 0;
	
	// interface : 추상메서드를 모으기 위해 사용
	void turnOn();			// public abstract가 자동생성됨.
	void turnOff();
	void setVolume(int volume);
	
	// default 메서드
	default void setMute(boolean mute) { // compile 하면 public 생성됨
		if (mute = true) {
			System.out.println("무음처리합니다.");
		}else {
			System.out.println("무음해제합니다.");
		}
	}
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}

// class의 구성요소 
// 1. 맴버 필드 : 인스턴스 변수, 상수, static
// 2. 생성자 
// 3. 매서드