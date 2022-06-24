import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyActionListener implements ActionListener{// 액션 이벤트가 일어나면 하는거 

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 버튼을 클릭 했네요~");
		
	}
	
	
}





public class MyColorFrame extends JFrame{
	public MyColorFrame(){
		super("색깔있는 프레임");
		
		JPanel pnl = new JPanel();//컨테이너를 보여줄 수 있는?
		pnl.setBackground(Color.RED);
		
		JButton btn = new JButton("컨테이너 안의 버튼");
		
		
		//addActionListener : 액션을 버튼에 전달해 주는??
		btn.addActionListener(new MyActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.BLUE);
				
			}
		});
		
		
		pnl.add(btn);
		add(pnl);
		
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);
	}
	
	
	
}
