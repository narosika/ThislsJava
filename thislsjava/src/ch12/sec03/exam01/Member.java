package ch12.sec03.exam01;

import java.lang.annotation.Target;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {		//Object 의 이퀄스 메소드 재정의
		if(obj instanceof Member target) {	//obj가 Member 타입인지 검사하고 타입변환 후 target 변수에 대입
			if(id.equals(target.id)) {		//id 문자열이 같은지 비교
				return true;
			}
		}
		return false;
	}
}
