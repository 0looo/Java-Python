package package5;


public interface RemoteControl {
	int MAX_VOLUME = 10;	// interface�� ����� ����.
							// comfile�ϸ� fianl�� �ڵ�������.
	int MIN_VOLUME = 0;
	
	// interface : �߻�޼��带 ������ ���� ���
	void turnOn();			// public abstract�� �ڵ�������.
	void turnOff();
	void setVolume(int volume);
	
	// default �޼���
	default void setMute(boolean mute) { // compile �ϸ� public ������
		if (mute = true) {
			System.out.println("����ó���մϴ�.");
		}else {
			System.out.println("���������մϴ�.");
		}
	}
	
	// ���� �޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}

// class�� ������� 
// 1. �ɹ� �ʵ� : �ν��Ͻ� ����, ���, static
// 2. ������ 
// 3. �ż���