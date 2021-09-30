package systemclass;

import java.util.LinkedList;
import java.util.List;

/* ArrayList vs LinkedList
 * LinkedList를 쓰는 이유
 * 순차적으로 추가/삭제 하는 경우 ArrayList가 더 효율적 => 크게 잡아놓는게 중요
 * 중간 데이터를 추가/삭제 시 LinkedList가 더 효율
 *  
 */


public class ListEx4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		
		//추가
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("배");
		list.add("수박");
		
		System.out.println(list);
		
		

	}

}
