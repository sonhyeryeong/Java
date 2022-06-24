import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
//하나만 선택할 수 있는 라디오 버튼
public class Main3 extends JFrame {
	public Main3() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("라디오1");
		JRadioButton rdb2 = new JRadioButton("라디오2");
		JRadioButton rdb3 = new JRadioButton("라디오3");
		//각 버튼은 연관관계가 없음. 
		//연관관계로 만들어 주는 객체- 버튼은 다 넣을 수 있다 (보통 라디오버튼의 선택지를 묶어주려고 씀)
		ButtonGroup group = new ButtonGroup();
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		//
		
//		//이렇게 그룹으로 안 묶인 버튼은 선택이 다른 버튼에 영향을 주지 않음. 
//		JRadioButton rdb4= new JRadioButton("라디오4");
//		JRadioButton rdb5= new JRadioButton("라디오5");
		
		rdb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange()==ItemEvent.SELECTED);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
//		pnl.add(rdb4);
//		pnl.add(rdb5);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {	
		new Main3().setVisible(true);
	}
}
