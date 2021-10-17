package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPad2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton[] buttons = new JButton[9];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad2 frame = new KeyPad2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeyPad2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
//		JButton btnNewButton = new JButton("New button");
//		panel_1.add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("New button");
//		panel_1.add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("New button");
//		panel_1.add(btnNewButton_2);
//		
//		JButton btnNewButton_3 = new JButton("New button");
//		panel_1.add(btnNewButton_3);
//		
//		JButton btnNewButton_4 = new JButton("New button");
//		panel_1.add(btnNewButton_4);
//		
//		JButton btnNewButton_5 = new JButton("New button");
//		panel_1.add(btnNewButton_5);
//		
//		JButton btnNewButton_6 = new JButton("New button");
//		panel_1.add(btnNewButton_6);
//		
//		JButton btnNewButton_7 = new JButton("New button");
//		panel_1.add(btnNewButton_7);
//		
//		JButton btnNewButton_8 = new JButton("New button");
//		panel_1.add(btnNewButton_8);
		
//		패널에 버튼 9개 부착
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton((i+1)+"");
//			버튼  font 변경
			buttons[i].setFont(new Font("굴림", Font.PLAIN, 24));
//			액션리스너
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		버튼이 클릭되면
//		눌러진 버튼의 숫자 가져오기
		String cmd = e.getActionCommand();
		
//		가져온 숫자를 textField 보여주기
		textField.setText(textField.getText()+cmd);
		
	}

}
