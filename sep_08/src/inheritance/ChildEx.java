package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		//Child ��ü ���� => 2����
		
		//1) super(); => object ������ ȣ��
		//2) this.age = age
		//3) super(age); => parent ������ ȣ��
		//4) Child ��ü ����
		Child child = new Child(25);
		System.out.println("child age"+child.getAge());
		
		child.play();
		child.print();
		Parent parent = new Child(26);
		System.out.println("child age"+parent.getAge());
//		parent.play(); ���θ� 
		parent.print();
	}

}
