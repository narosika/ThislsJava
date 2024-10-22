package ch13.Exam.Q03;

public class Container <X, T> {
	private X key;
	private T value;
	
	public void set(X key, T value) {
		this.key = key;
		this.value = value;
	}
	public X getKey() {
		return this.key;
	}
	public T getValue() {
		return this.value;
	}

}
