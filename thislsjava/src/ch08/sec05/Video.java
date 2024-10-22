package ch08.sec05;

public class Video implements RemoteControl{
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("비디오 전원을 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("비디오 전원을 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Video 볼륨: " + volume);
	}
	int memoryVolume ;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("음소거 합니다");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 해제합니다");
			setVolume(memoryVolume);
		}
	}
}
