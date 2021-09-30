package systemclass;

/* 컬렉션 프레임워크
 * 여러데이터들을 저장하는 클래스들을 표준화한 설계
 * (interface)Collection - List, Set
 * (interface)Map
 * 
 * (향상시킨 배열과 같다고 생각하자)
 * List(인터페이스) : 순서가 있다. 데이터의 중복 가능
 * 		구현 클래스 : Vector, ArrayList, LinkedList, Stack.....
 * E, T, K, V: 담을 객체 타입을 저장
 * 
 * 기본 타입 => 객체 타입(wrapper 클래스)
 * int => Integer, float => Float, double => Double, char => Character, boolean => Boolean
 */

public class ListEx1 {

	public static void main(String[] args) {
		//객체 생성
		List<String> List = new ArrayList<String>();
		ArrayList<Integer> List2 = new ArrayList<Integer>();

		//데이터 추가 => add
		List1.add("사과");
		List1.add("딸기");
		List1.add("바나나");
		List1.add("배");
		List1.add("수박");
		
		//데이터 가져오기
		for (String str : List1) {
			System.out.println(str);
		}
		System.out.println();
		
		System.out.println(List1); // toString() 오버라이딩 되어있따
		
		for (int i = 0; i < List1.size(); i++) {
			System.out.println(List1.get(i));
		}
	}
	
	List2.add(10);
	List2.add(20);
	List2.add(30);
	List2.add(40);
	List2.add(50);
	List2.add(60);
	
	for (Integer i : List2) {
		System.out.println(i);
	}
	//합계 구하기
	int sum = 0;
	for(int i = 0; i < List2.size(); i++) {
		sum += i;
	}
	System.out.println("합계"+sum);
}
}
