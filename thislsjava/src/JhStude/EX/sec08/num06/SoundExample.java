package JhStude.EX.sec08.num06;

public class SoundExample {
	public static void printSound(Sound sou) {
		System.out.println(sou.sound());
	}

	public static void main(String[] args) {
	
		printSound(new Cat());
		printSound(new Dog());
	}

}
