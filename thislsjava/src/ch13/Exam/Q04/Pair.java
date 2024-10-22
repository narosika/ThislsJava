package ch13.Exam.Q04;

public class Pair <K, V>{
	private K key;
	private V value;
	
	public Pair(K key, V vlaue) {
		this.key = key;
		this.value = vlaue;
	}
	
	public K getKey() { return this.key;}
	public V getValue() {return this.value;	}
}
