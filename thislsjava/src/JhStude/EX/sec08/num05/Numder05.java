package JhStude.EX.sec08.num05;

public class Numder05 implements RemoCon{
	@Override
	public void powerOn() {
		System.out.println("Tv를 켰습니다");
	}
	
	public static void main(String[] args) {
		RemoCon r = new Numder05();
		r.powerOn();
	}

}
