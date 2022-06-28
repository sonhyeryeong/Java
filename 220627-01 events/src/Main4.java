import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame{
	public Main4() {
		JPanel pnl = new JPanel();
		//간단하게 이미지 가져올 수 있는 툴
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		//사진 저장경로 찾기
		URL url=Main4.class.getClassLoader().getResource("images/춘식8.png");
		ImageIcon image= new ImageIcon(kit.getImage(url));
		URL url2=Main4.class.getClassLoader().getResource("images/춘식16.png");
		ImageIcon image2= new ImageIcon(kit.getImage(url2));
		
				
		
		JLabel lbl = new JLabel(image);
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(image2);
			}
		});
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		
 	}
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
