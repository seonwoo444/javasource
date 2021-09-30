package inheritance;

public class SubListString extends ListString {
	String name = "이춘향";
	
	@Override
	private void List() {
		super.List();//부모의 List를 호출
		System.out.println(name+"하위 클래스");

	}
	
	public void writer() {
		//부모가 갖고 있는 이름만 출력
		System.out.println(super.name);
		
		super.List();
	}
}
