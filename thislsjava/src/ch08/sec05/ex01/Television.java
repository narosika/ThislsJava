package ch08.sec05.ex01;

public class Television implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	@Override
	public void setVolume(int volume) {
		System.out.println("현재볼륨 : " + volume);
	}
	int saveVolume;
	@Override
	public void setMute(boolean mute) {
		saveVolume = this.saveVolume;
	}
	@Override
	public void turnOff() {
		
	}

}
