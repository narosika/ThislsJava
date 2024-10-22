package ch13.Exam.Q04;

public class Util  {
	
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if(k.equals(p.getKey())) 
		{
			return p.getValue();
		} else {
			return null;
		}
	}
	/*
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		 if(p.getKey() == k) {
		 return p.getValue();
		 } else {
		 return null;
		 }
		}
	*/
	}

