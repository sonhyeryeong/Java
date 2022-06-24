import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	JButton btnEnable;
	JButton btnDisable;
	JButton btnNotShown;
	private List<JButton> list;

	public Main4() {
		super("버튼 활성화 테스트");
		list = new ArrayList<>();
		
		
		JPanel pnl = new JPanel();
		JButton btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		btnNotShown = new JButton("보이나");

		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);

//		btnDisable.setEnabled(false);//보이는데 누를 수 없는 버튼
		btnNotShown.setVisible(false);//아예  안 보이는거

		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);

		for (int i = 1; i <= 5; i++) {//버튼 여러개 만들기 
			JButton btn = new JButton(String.valueOf(i));
			pnl.add(btn);
			
			list.add(btn);//버튼을 배열로 만들기
		}

		add(pnl);

		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			for(JButton btn: list) {
				btn.setEnabled(true);//버튼을 누를 수 있는가? (활성화)
			}
		} else {
			for(JButton btn: list) {
				btn.setEnabled(false);//버튼을 누를 수 있는가? (비활성화)
			}
		}
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
