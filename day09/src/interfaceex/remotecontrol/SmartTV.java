package interfaceex.remotecontrol;

public class SmartTV implements RemoteControl, Searchable{

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + " 검색합니다.");
	}

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
		
		if(volume > RemoteControl.MAX_VOLUME)
		{
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("최대볼륨으로 맞춥니다");
		}
		else if(volume < RemoteControl.MIN_VOLUME)
		{
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("최소볼륨으로 맞춥니다");
		}
		else
		{
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
