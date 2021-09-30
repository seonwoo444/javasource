package test;

public class TypeTest1Main {
	public static void main(String[] args) {
		// 타입 -1 ) 기본타입
		// 타입-2 ) 참초 타입
		//변수의 메모리 사용되는 방식이 달라짐
		
		// 기본타입
		int age = 25;
		double price = 200.4;
		
		// 참조타입(Heap에 주소가 붙어서 생성)
		// 참조타입만 null로 초기화가 가능
		String name = "java";
		String name2 = new String("java");
		String hobby = null; // 아직 힙 영역이 할당되지 않은 것
		
		//값 비교
		// steak : == , !=
		// heap : .equals()로 확인
		
		System.out.println(name == name2 ? "동일" : "다름");
		System.out.println(name.equals(name2) ? "동일" : "다름");
		
		System.out.println(hobby);
		System.out.println(hobby.length());// .length : hobby라는 그릇이 heap영역에 저장 되어있을때 내용물이 뭔질 알아봐라 
		
		
		
	}
}
