import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.SpringLayout;



public class Main7 extends JFrame{
	public Main7() {
		super("퀴즈");
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom= new JPanel();
		JPanel pnlBox= new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
//		pnlBottom.setLayout(new BoxLayout(pnlBottom,BoxLayout.X_AXIS));
		
		String what = "지금 지쳤나요?";
		String what2 = "집에 가고 싶나요?";
		
		
		
		
		JLabel lbl= new JLabel(what);
		lbl.setFont(new Font("Adobe 고딕 Std B", Font.PLAIN, 14));
		JButton lblbtn = new JButton("문제변경");
		JButton btn = new JButton("제출");//클릭하면 답과 비교할 수 있게
		JLabel output = new JLabel ();// 결과 출력하기
		JTextField tf1 = new JTextField(20);//정답 입력할 수 있는 텍스트 박스.
		
		//문제 변경하기
		lblbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText(what2);
			}
		});
		
		//정답 제출하기 
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//문제1번일 때 
				if(lbl.getText().equals(what)) {
					String userInput = tf1.getText();
					if(userInput.equals("네")) {
						output.setText("정답입니다.");
					}else {
						output.setText("당신은 지쳤습니다.");
					}
				}else {//문제 2번일 때 
					String userInput2 = tf1.getText();
					if(userInput2.equals("네")) {
						output.setText("조금만 더 힘내세요");
					}else {
						output.setText("거짓말 ㄴㄴ");
					}
					
				}
			}
		});
		SpringLayout sl_pnlTop = new SpringLayout();
		sl_pnlTop.putConstraint(SpringLayout.EAST, lbl, -76, SpringLayout.WEST, lblbtn);
		sl_pnlTop.putConstraint(SpringLayout.NORTH, lblbtn, -4, SpringLayout.NORTH, lbl);
		sl_pnlTop.putConstraint(SpringLayout.EAST, lblbtn, -48, SpringLayout.EAST, pnlTop);
		sl_pnlTop.putConstraint(SpringLayout.SOUTH, lbl, -22, SpringLayout.SOUTH, pnlTop);
		pnlTop.setLayout(sl_pnlTop);
		
		
		
		
		
		pnlTop.add(lbl);
		pnlTop.add(lblbtn);
		pnlBottom.add(tf1);
		pnlBottom.add(btn);
		pnlBottom.add(output);
		getContentPane().add(pnlBox);
		
//		pack();
		setSize(444, 152);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Main7().setVisible(true);
	}

}
