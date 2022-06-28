import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class My extends JFrame {
	public My() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("FPyLm.jpg");
		Image image2= kit.getImage("kcziv.jpg");
		Image imageLove= kit.getImage("free-icon-heart-1077035.png");
		
		
		JButton btn = new JButton(new ImageIcon(imageLove));
		pnl.add(btn);
		JTextField txt = new JTextField("이름을 입력하세요");
		
		
		
		
		
		
		
		
		/*
		JLabel lbl = new JLabel(new ImageIcon(imageLove));
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl.setIcon(new ImageIcon(image2));
			}
		});
		
		JLabel lbl2 = new JLabel(new ImageIcon(imageLove));
		pnl.add(lbl2);
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl2.setIcon(new ImageIcon(image));
			}
		});
		*/
		
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new My().setVisible(true);
	}

}
