package container;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame {

	public FrameTest3() {
		setTitle("MyFrame");
		setSize(300, 300);
//		�������� ������ ���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		flowlayout : ���ʴ�� ��ġ
		setLayout(new FlowLayout());

//		������Ʈ : JButton, JCheckBox, JRadio,.......

		JButton btn1 = new JButton("��ư1");
		add(btn1);

		JButton btn2 = new JButton("��ư2");
		add(btn2);
		
		JButton btn3 = new JButton("��ư3");
		add(btn3);
		
		JButton btn4 = new JButton("��ư4");
		add(btn4);
		
		JButton btn5 = new JButton("��ư5");
		add(btn5);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
	}

}
