package interfaceex.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl tv = new TV();
		RemoteControl audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(15);
		tv.turnOff();
		tv.setMute(true);
		RemoteControl.changeBattery();
		// static �޼����̹Ƿ� �������̽� �̸����� ���� ����
		
		audio.turnOn();
		audio.setVolume(-10);
		audio.turnOff();
	}

}
