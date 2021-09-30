package systemclass;

import java.util.Stack;

//Stack : LIFO(Last In First Out) 
//		: ���İ��, ���� ��ȣ �˻�, Undo/Redo, ������̿��� �ڷ�/������


public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		//������ ����
		stack.push("���");
		stack.push("����");
		stack.push("��");
		stack.push("�ٳ���");
		stack.push("��");
		
		//������ ��������
		System.out.println(stack);
		
		System.out.println();
		
		while (!stack.empty()) {
			System.out.println(stack.pop());
			
		}
		
	}

}
