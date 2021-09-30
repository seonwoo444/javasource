package inheritance;

//extends(확장에 개념이 들어가있다) 부모클래스명(Parent) 자식 클래스에서 부모클래스 연결 할때
//물려받는 것 : 생성자와 초기화 불럭은 상속되지 않음
//private 멤버변수는 접근이 제한 됨
//-위에 것 외엔 다 물려받는다-
//object -> parent -> child 구조로 만들기

public class Child extends Parent {

	public Child(int age) {
		super(age);// parent의 int를 받는 생성자를 호출
	}
	
	
//	public Chind() {
//		super();// parent 의 기본생성자 호출
//	}
	
	void play() {
		System.out.println("놀자");
	}
	
	@Override
	public void print() {
		System.out.println("Hello");
		super.print();
	}
	
}
