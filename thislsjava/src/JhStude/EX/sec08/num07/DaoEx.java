package JhStude.EX.sec08.num07;

public class DaoEx {

	public static void dbWork (DataAcc dao) {
		dao.delete();
		dao.insert();
		dao.select();
		dao.update();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySplDao());
	}

}
