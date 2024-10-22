package JhStude.EX.sec08.num07;

public class OracleDao implements DataAcc{

	@Override
	public  void delete() {
		System.out.println("오라클에서 DB 검색");
	}
	@Override
	public void insert() {
		System.out.println("오라클에서 DB 삽입");
	}
	@Override
	public void select() {
		System.out.println("오라클에서 DB 수정");
	}
	@Override
	public void update() {
		System.out.println("오라클에서 DB 삭제");
	}
}
