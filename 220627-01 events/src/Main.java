import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	public Main() {
		MouseListener listener = new MouseListener() {//익명구현
			//추상메소드를 5가지 가지고 있음
			//클릭 이벤트에 기능을 구현하고 싶으면 pressed,released 중 하나를 씀
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼을 누름");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼을 땜");
			}

			//사용자가 마우스를 올려 놓았느냐, 영역을 벗어났느냐
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("EXIT!!!!");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("ENTER!!");
			}
			/////
			
			//더블클릭 등의 이벤트
			@Override
			public void mouseClicked(MouseEvent e) {
				//오른쪽인지 왼쪽 클릭인지 알아 볼 수 있는 메소드(상수 형태로 반환함)
				//os마다 마우스 버튼 값이 다르다.
				switch(e.getButton()){
				case MouseEvent.BUTTON1: //왼쪽버튼
					System.out.println("1번");
					break;
				case MouseEvent.BUTTON2: //2번-가운데버튼
					System.out.println("2번");
					break;
				case MouseEvent.BUTTON3: //오른쪽 버튼
					System.out.println("3번");
					break;
				}
				
				System.out.println("왼쪽 버튼인가요?"+SwingUtilities.isLeftMouseButton(e));
				
				if(e.getClickCount()==2) {//마우스 클릭한 숫자 세는 게터
					System.out.println("더블클릭!!");
				}
			}
			
		};
		//마우스가 움직일 때 위치값
		MouseMotionListener motion = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {//커서 위치를 좌표값으로 -좌상단이 0,0
				System.out.println("마우스가 움직입니다~."+e.getX()+","+e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
		};
		
		JPanel pnl = new JPanel();
//		pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
