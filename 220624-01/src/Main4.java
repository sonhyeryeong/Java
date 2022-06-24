import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
//센치미터 -> 미터로

public class Main4 extends JFrame {
	private JTextField txt;
	private JRadioButton rdb1;
	private JRadioButton rdb2;
	private JRadioButton rdb3;

	public Main4() {
		JPanel pnl = new JPanel();
		//선택버튼
		rdb1 = new JRadioButton("cm → inch");
		rdb2 = new JRadioButton("inch → cm");
		rdb3 = new JRadioButton("cm → m");
		ButtonGroup group = new ButtonGroup();
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		//변환버튼
		JButton btn = new JButton("변환");
		//입력필드
		txt = new JTextField(30);
		//결과영역
		JLabel result = new JLabel("결과영역");
		
//		변환 누르면 이벤트 설정
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String what = transtion();
				result.setText(what);
			}
		});
		
		ItemListener itm = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				txt.setText("");
			}
		};
		rdb1.addItemListener(itm);
		rdb2.addItemListener(itm);
		rdb3.addItemListener(itm);
		

		
		//보이게 하는거 
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
		pnl.add(btn);
		pnl.add(txt);
		pnl.add(result);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public String transtion() {
		double input =Double.valueOf(txt.getText());
		if(rdb1.isSelected()) {//String.format("",값 ): 소숫점 자리 지정  
			return "cm →inch 변환 값은: "+String.format("%.3f", input/2.54);
		}else if(rdb3.isSelected()) {
			return "cm → m 변환 값은:"+ String.format("%.3f", input*0.01);
		}else  {
			return "inch → cm 변환 값은: "+String.format("%.3f", input*2.54);
		}
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
