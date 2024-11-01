package ch15.exam.ex07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {


	public List<Board> getBoardList(){
		List<Board> bb= new ArrayList<Board>();
		bb.add(new Board("제목", "내용1"));
		return bb;
	}
}
