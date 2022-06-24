import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	public Main() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("첫번째");//체크박스
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");
		
//		check1.setSelected(true);//선택되어있게 셋팅
//		System.out.println(check2.isSelected());//선택되어있냐? 물어봄
		
//		check1.addActionListener(new ActionListener() {//체크박스는 추상적 버튼을 상속받기 때문에 액선리스너 사용할 수 있음. 
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("사용자가 체크박스를 눌렀음");
//				System.out.println(check1.isSelected());
//			}
//		});
		
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {//이
				int result = e.getStateChange();//int값을 반환한다. 선택-1 선택X -2 
				System.out.println(result==ItemEvent.SELECTED);
			}
		});
		
		
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new Main().setVisible(true);
		
	}

}
