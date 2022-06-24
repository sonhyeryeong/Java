import javax.swing.JFrame;

class MyFrame extends JFrame{// 제이프레임의 특징을 물려받는 나만의 프레임을 만들겠다!
	public MyFrame(String title) {
		super(title);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}





public class Main3 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("나만의 프레임");
		frame.setVisible(true);
		
		
	}

}
