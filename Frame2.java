package sec02;

import java.awt.*;
import javax.swing.*;

public class Frame2 extends JFrame {
	Frame2() {
		setTitle("FlowLayout 설정하기");
		// 배치 관리자 변경하기
		setLayout(new FlowLayout());
//		FlowLayout f = new FlowLayout();
//		setLayout(f);
		
		//컴포넌트 생성
		JButton b1 = new JButton("OK");
		JButton b2 = new JButton("CANCEL");
		b1.
		
		// 컴포넌트 부착(추가)
		add(b1);
		add(b2);
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame2();
	}

}
