package systemclass;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List<Member> list = new ArrayList();
		
		//추가
		list.add(new Member("hoog1", "lse1234", "홍길동"));
		list.add(new Member("hoog2", "lse1432", "최홍자"));
		list.add(new Member("hoog3", "lse1543", "박길영"));
		list.add(new Member("hoog4", "lse1784", "최서정"));
		list.add(new Member("hoog5", "lse1453", "이선우"));
		
		//가져오기
		System.out.println(list);//패키지명.클래스명 주소
		
		System.out.println();
		
		for (Member mem : list) {
			System.out.println(mem);
		}

	}

}
