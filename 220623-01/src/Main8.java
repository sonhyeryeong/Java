import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main8 extends JFrame {
	public Main8() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom= new JPanel();
		JPanel pnlBox= new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		
		JTextField tf1 = new JTextField(30);//텍스트를 입력할 수 있는 클래스? 
		JTextField tf2 = new JTextField(30);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();// 사용자가 입력한 텍스트 값을 그대로 출력함. 
				tf2.setText(text);
				//메세지창: Dialog 라고 부른다.//메세지창으로 보여준다. 
				JOptionPane.showMessageDialog(Main8.this, text);//순서(다이얼로그가 속해있는 프레임-어디를 참조로 해서 띄울 건지?,문자열)
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		add(pnlBox);
		
		pack();//사이즈를 결정해 줄 수 있는?
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Main8().setVisible(true);
		
	}

}
