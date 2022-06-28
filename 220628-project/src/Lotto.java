import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lotto extends JFrame{
	public Lotto() {
		CardLayout layout = new CardLayout();
		JPanel center = new JPanel(layout);
		
		
		//번호 입력하는 곳-이곳이 메인 
		JPanel inputNum = makePanel("입력하는 곳");
		//제출 확인 창
		JPanel resultNum = makePanel("확인하는 곳");
		
		center.add(inputNum,"입력창");
		center.add(resultNum,"확인창");
		
		layout.show(center, "입력창");
		
		add(center);
		
		
		//입력창 - 버튼
		JButton btnNext = new JButton("제출하기");
		JButton btnReset = new JButton("리셋하기");
		
		
		//입력창-버튼 위치
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnReset);
		pnlSouth.add(btnNext);
		
		add(pnlSouth,"South");
		
		//제출창- 버튼 두 개 
		JButton btnReset2 = new JButton("다시 입력하기");
		JButton btnEnd = new JButton("종료하기");
		
		resultNum.add(btnReset2);
		resultNum.add(btnEnd);

		
		//제출창-버튼 위치
//		JPanel pnlSouth2 = new JPanel();
//		pnlSouth2.add(btnReset2);
//		pnlSouth2.add(btnEnd);
//		
//		resultNum.add(pnlSouth2);
//		resultNum.add(pnlSouth2,"South");
		
		
		
		//버튼 누르면 다른 페이지 넘어가는 거 
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("제출하기")) {
					layout.next(center);
				}else if(e.getActionCommand().equals("다시 입력하기")) {
					layout.previous(center);
				}else if( e.getActionCommand().equals("종료하기")) {
					dispose();
				}
			}
		};
		btnNext.addActionListener(listener);
		btnReset.addActionListener(listener);
		btnReset2.addActionListener(listener);
		btnEnd.addActionListener(listener);
		
		
		
		
		
	
		
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		
	}
	
	
	private JPanel makePanel(String text) {
		JPanel pnl = new JPanel();
		pnl.add(new JLabel(text));
		return pnl;
	}
	
	
	
	
	public static void main(String[] args) {
		new Lotto().setVisible(true);
	}
	
	
}

