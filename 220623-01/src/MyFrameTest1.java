import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		
		setBackground(Color.RED);
		
		
		JButton button = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		
		
		getContentPane().setLayout(new FlowLayout());// flowlayout 중앙정렬해서 나열해줌
		getContentPane().add(button);// 프레임을 가득 채움
		getContentPane().add(button2);
		
//		setLayout(new FlowLayout());
//		this.add(button);
		setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f= new MyFrame2();
	}
}
