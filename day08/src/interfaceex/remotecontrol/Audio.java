package interfaceex.remotecontrol;

public class Audio implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME)
		{
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("�ִ뺼������ ����ϴ�");
		}
		else if(volume < RemoteControl.MIN_VOLUME)
		{
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("�ּҺ������� ����ϴ�");
		}
		else
		{
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}

}
