import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame{
	public Main6() {
		JPanel pnl = new JPanel();
//		세로크기
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);// 레이아웃 배치를 도와준다
//		pnl.setLayout(flow);
		
//		가로크기
//		BorderLayout border = new BorderLayout();
//		pnl.setLayout(border);// 자기 영역에 컴포넌트를 가득 채운다. 
//		5개의 영역을 가지고 있음 (동,서,남,북,중앙) 
//		
//		BoxLayout box = new BoxLayout(pnl,BoxLayout.Y_AXIS);//x,y축으로 쌓을 수 있다. 
//		pnl.setLayout(box);
		
//		GridLayout grid = new GridLayout(2,2);//몇 줄, 몇 칸 ? - 똑같은 크기로 쪼갬(크기설정 무시한다), 좌측 상단부터 하나씩 채워나간다. 
//		pnl.setLayout(grid);
		
		pnl.setLayout(null);// 안보인다. 위치와 크기가 정해져 있지 않아서 그럼. 
		
		
		JButton btn1= new JButton("버튼1");
		JButton btn2= new JButton("버튼2");
		JButton btn3= new JButton("버튼3");
		
		btn1.setLocation(10,30);//x,y값 좌표를 적는다- 좌측 상단부터 x,y값이 시작한다. 
		btn1.setSize(200,300);//x,y 

		btn2.setBounds(220, 50, 90, 40);// 위치와 크기 같이 정할 수 있는 메소드. 
		
		//flowlayout으로 정의하고 있기 때문에 
		btn1.setPreferredSize(new Dimension(300,300));
		btn1.setMinimumSize(new Dimension(300,300));
		btn1.setMaximumSize(new Dimension(300,300));
		
		
		
		
		
		
		
		pnl.add(btn1,"West");//레이아웃 배치는 add할때 ,하고 적어주면 된다
		pnl.add(btn2);//중앙이 기본이라 안 적어도 됨
		pnl.add(btn3, BorderLayout.EAST);//상수형태로
		pnl.add(btn3,"South");//같은 버튼의 위치를 두 번 정해주면 마지막으로 정의해 준 위치에 감. 
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}

}
