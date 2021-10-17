package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest2 extends JFrame {

	
	public FlowLayoutTest2() {
		setTitle("FlowLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		layout 변경
		
		// 현재프레임의 contentPane 가져오기
//		Container container = getContentPane();
//		contaentPane에 새로운 레이아웃 설정
//		container.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();//기본레이아웃 FLowLayout
		setContentPane(panel);
		
		
		
		
		JButton btn1 = new JButton("버튼1");
		add(btn1);

		JButton btn2 = new JButton("버튼2");
		add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4);
		
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		setSize(300, 300);
		setVisible(true);
	}
		
		
	
	
	
	
	
	public static void main(String[] args) {
		FlowLayoutTest2 f = new FlowLayoutTest2();
	}

}
