package JhStude.EX.sec07.aaa;

public class Member {
	String id;
	String pass;
	boolean login (String id, String pass) {
		this.id=id;
		this.pass=pass;
		if(id.equals("hong") && pass.equals(12345)) {
		return true;
		}
		return false;
	}
}
