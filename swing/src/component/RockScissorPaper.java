package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {

	private JTextField textFeild;
	private JButton btnRock, btnPaper, btnScissor;

	static final int Rock = 0;
	static final int Paper = 1;
	static final int Scissor = 2;

	public RockScissorPaper() {
		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		현재 컨텐트패인 가져오기
		Container contentPane = getContentPane();

//		상단 메시지 출력
		JLabel label = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		label.setFont(new Font(("굴림"), Font.BOLD, 18));
		contentPane.add(label, BorderLayout.NORTH); // add(label, BorderLayout.NORTH);

//		가운데 이미지 출력
//		JPanel Center에 부착 후 => JPanel gridlayout 변경 => 버튼 3개 부착
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));

		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("rock");
		btnRock.addActionListener(this);
		panel.add(btnRock);

		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/Paper.png")));
		btnPaper.setActionCommand("paper");
		btnPaper.addActionListener(this);
		panel.add(btnPaper);

		btnScissor = new JButton();
		btnScissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/Scissor.png")));
		btnScissor.setActionCommand("scissor");
		btnScissor.addActionListener(this);
		panel.add(btnScissor);

		contentPane.add(panel, BorderLayout.CENTER);

//		하단 결과 출력
		textFeild = new JTextField();
		textFeild.setFont(new Font(("굴림"), Font.BOLD, 18));
		contentPane.add(textFeild, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new RockScissorPaper();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

//		게임자가 누른 가위, 바위, 보 가져오기
		String cmd = e.getActionCommand(); // rock, paper, scissor 가 들어온다

//		컴퓨터의 가위, 바위, 보 결정
		int computer = (int) (Math.random() * 3); // 0,1,2
//		System.out.println(num);

//		컴퓨터와 게임자 사이에서 결과 출력
		if (cmd.equals("rock")) {
			if (computer == Rock) {
				textFeild.setText("비겼다. 다시 한번 더");
			} else if (computer == Scissor) {
				textFeild.setText("승리");
			} else {
				textFeild.setText("패배");
			}
		} else if (cmd.equals("scissor")) {// 유저가 가위를 낸 경우

		} else {// 게임자가 보자기를 낸 경유

		}

	}

}
