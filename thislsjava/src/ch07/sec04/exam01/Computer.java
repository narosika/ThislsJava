package ch07.sec04.exam01;

public class Computer extends Calculator{
	
	public Computer() {
		super();
	}
	
	@Override
	public double areaCircle(double r)
	{
		System.out.println("Calculator 객체의 areaCircle 메소드 실행");
		return Math.PI * r *r;
	}

}
