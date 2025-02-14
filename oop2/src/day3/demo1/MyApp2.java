package day3.demo1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyApp2 extends JFrame {
	
	JButton btn1= new JButton("새파일");
	JButton btn2 = new JButton("저장하기");
	JButton btn3 = new JButton("종료하기");
	
	MyApp2() {
		init();
	}
	
	void init() {
		setLayout(new FlowLayout());
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		btn1.addActionListener(e -> System.out.println("새파일을 엽니다."));
		btn2.addActionListener(e -> System.out.println("파일을 저장합니다."));
		btn3.addActionListener(e -> System.out.println("프로그램을 종료합니다."));
		
		setVisible(true);
		setBounds(100, 200, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyApp2();
	}
	
}
