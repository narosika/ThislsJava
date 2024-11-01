package ch15.exam.ex07;

public class Board {
	String title;
	String content;
	
	public Board(String title, String content){
		this.title= title;
		this.content = content;
	}
	
	String getTitle() {
		return title;
	}
	String getContent() {
		return content;
	}
}