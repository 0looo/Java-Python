package package11;

public class Ex12Test {

	public static void main(String[] args) {
		// 익명 클래스
		
		Ex11 ex = new Ex11() {
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("Ture On");
			}

			@Override
			public void turnOff() {
				System.out.println("turn Off");
			}

			@Override
			public void setVolume(int volume) {
				if(volume>MAX_VOLUME) {
					this.volume = MAX_VOLUME;
				}else if(volume<MIN_VOLUME) {
					this.volume = MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("Volume is "+this.volume);
			}
			
		};
		
		ex.turnOn();
		ex.setVolume(5);
		ex.turnOff();
			
	}
}
