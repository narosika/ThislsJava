package ch14.sec06.exam02;

public class E extends Thread{
	private WorkObject workObject;

	public E(WorkObject workObject) {
		setName("Threade");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodE();
		}
	}
}
