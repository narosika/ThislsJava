package ch14.sec05.exam03;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread ThrB = new WorkThread("ThrB");	
		workThreadA.start();		
		ThrB.start();
		
		try { Thread.sleep(5000); } catch (InterruptedException e) {}
		workThreadA.work = false;
		
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		workThreadA.work = true;
	}
}

