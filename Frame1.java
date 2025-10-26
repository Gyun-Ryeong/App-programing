package sec02;

import java.awt.*;
import javax.swing.*;

public class Frame1 extends JFrame {
	Frame1() {
		setTitle("BorderLayout 설정하기");
		//컴포넌트 생성
		JButton b1 = new JButton("북쪽");
		JButton b2 = new JButton("가운데");
		JButton b3 = new JButton("남쪽");
		// 컴포넌트 부착(추가)
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.CENTER);
		add(b3, BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame1();
	}

}
