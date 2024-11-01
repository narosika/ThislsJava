package ch15.exam.ex08;

public class Student {
	int studentNum;
	String name;
	
	public Student (int studentNum, String name) {
		this.name = name;
		this.studentNum = studentNum;
	}

	
	@Override
	public int hashCode() {
		
		return studentNum;
	}
	
}
