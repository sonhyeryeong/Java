import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//버튼 도망가게
public class Main3 extends JFrame{
	public Main3() {
		JPanel pnl = new JPanel(null);//기본 값을 리셋한다. 
		pnl.setPreferredSize(new Dimension(500,500));
		
		JButton btn = new JButton("Click me");
		btn.setBounds(150,150,100,100);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {//마우스가 패널 안으로 들어오면
				btn.setLocation((int) (Math.random()*400), (int) (Math.random()*400));
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}

}
