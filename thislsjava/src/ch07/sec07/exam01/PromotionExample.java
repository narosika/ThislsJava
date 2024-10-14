package ch07.sec07.exam01;

class 동물 {
}

class 포유류 extends 동물 {
}

class 파충류 extends 동물 {
}

class 사자 extends 포유류 {
}

class 개구리 extends 파충류 {
}

public class PromotionExample {
	public static void main(String[] args) {
		포유류 포유류 = new 포유류();
		파충류 파충류 = new 파충류();
		사자 사자 = new 사자();
		개구리 개구리 = new 개구리();

		동물 동물1 = 포유류;
		동물 동물2 = 파충류;
		동물 동물3 = 사자;
		동물 동물4 = 개구리;

		포유류 포유류1 = 사자;
		파충류 파충류1 = 개구리;

		//포유류 포유류3 = 개구리;	//e(개구리는 포유류와 상속관계가아님
		//파충류 파충류3 = 사자;	//d(사자는 포유류와 상속관계가아님
	}
}
