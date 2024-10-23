package ch14.sec06.exam02;

public class c extends Thread{
	private WorkObject workObject;

	public c(WorkObject workObject) {
		setName("ThreadC");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodC();
		}
	}
}
