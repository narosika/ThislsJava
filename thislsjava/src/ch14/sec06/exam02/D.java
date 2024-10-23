package ch14.sec06.exam02;

public class D extends Thread{
	private WorkObject workObject;

	public D(WorkObject workObject) {
		setName("ThreadD");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodD();
		}
	}
}
