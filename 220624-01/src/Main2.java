import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//사용자가 메뉴를 선택하면 가격이 나오는 프로그램
public class Main2 extends JFrame {
	Map<String,Integer> map = new HashMap<>();
	private JCheckBox check1;
	private JCheckBox check2;
	private JCheckBox check3;
	public Main2() {
		JPanel pnl = new JPanel();
		check1 = new JCheckBox("짜장면: 5000원");
		check2 = new JCheckBox("짬뽕:6000원");
		check3 = new JCheckBox("탕수육:12000원");
//		가격나오는거
		JLabel label = new JLabel("가격나옴");
		
		JButton btnAll= new JButton("전체선택");
		JButton btnCancel = new JButton("취소");
		
		
		
//		보이게하는거
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		pnl.add(label);
		pnl.add(btnAll);
		pnl.add(btnCancel);
		

		add(pnl);
/////////////////
		
		ActionListener btnListener = new ActionListener() {//체크박스를 눌렀을 때 작동한다. 
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean all= e.getSource()==btnAll;
				check1.setSelected(all);
				check2.setSelected(all);
				check3.setSelected(all);
			}
		};
		btnAll.addActionListener(btnListener);
		btnCancel.addActionListener(btnListener);
		
		
		
		
//		ActionListener actionListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int sum = sum();//계산 메소드 호출
//				label.setText(String.valueOf(sum));
//			}
//		};
//		check1.addActionListener(actionListener );
//		check2.addActionListener(actionListener );
//		check3.addActionListener(actionListener );
		
		
//		액션 이벤트- 버튼의 형태를 가지고 있는 것에는 다 작동 - 누를 떄!!!
//				  누르는 동작은 인식하나 상태를 바꾸는( setSelect등)동작에서는 인식하지 못한다.
//		아이템리스너 - 버튼에 동작이 갈 때 인식!<> 액션 이벤트와 다르다. 
//				     상태의 변화로 작동해야 한다면 아이템 리스너로 설정한다
		
		
		
		
		
		//익명클래스로
		ItemListener itemListener = new ItemListener() {//상태의 변화에 집중하는 문제에는 아이템리스너가 좋다!
			@Override
			public void itemStateChanged(ItemEvent e) {
				int sum = sum();//계산 메소드 호출
				label.setText(String.valueOf(sum));
			}
		};
		
		
		check1.addItemListener(itemListener);
		check2.addItemListener(itemListener);
		check3.addItemListener(itemListener);
		
		
		
		setSize(328, 193);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
//		체크하면 동작하는거

//		짜장면
//		check1.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				int result = e.getStateChange();// int값을 반환한다. 선택-1 선택X -2
//				if (result == 1) {
//					label.setText("5000");
//				}else {
//					label.setText("");
//				}
//			}
//		});
////		 짬뽕
//		check2.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				int result = e.getStateChange();
//				if (result == 1) {
//					label.setText("6000");
//				} else {
//					label.setText("");
//				}
//			}
//		});
////		탕슉
//		check3.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				int result = e.getStateChange();
//				if (result == 1) {
//					label.setText("20000");
//				} else {
//					label.setText("");
//				}
//			}
//		});
		
		
		
		
		
////	잘못 짠 코드
//		전체선택
////		생성됐을 때 한번 실행되어서 안된다. 
//		if(check1.isSelected() && check2.isSelected()&&check3.isSelected()) {
//			label.setText("31000");
//		}else {
//			label.setText("");
//		}
//		
	}
	
	
	private int sum() {//계산 메소드
//		언제 호출 될까? itemevent가 호출될 때???
		int sum=0;
		sum+=check1.isSelected() ? 5000:0;
		sum+=check2.isSelected() ? 6000:0;
		sum+=check3.isSelected() ? 12000:0;
		return sum;
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
