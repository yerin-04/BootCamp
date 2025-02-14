package day3.demo1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyApp extends JFrame{
		
	JButton btn1= new JButton("새파일");
	JButton btn2 = new JButton("저장하기");
	JButton btn3 = new JButton("종료하기");
	
	MyApp() {
		init();
	}
	
	void init() {
		setLayout(new FlowLayout());
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		//익명클래스로 이벤트 리스너 구현하고 객체 즉석에서 생성하기
		ActionListener listener1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
			}
		};
		ActionListener listener2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showSaveDialog(null);
			}
		};
		ActionListener listener3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,  "종료하시겠습니까?");
				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		};
		
		btn1.addActionListener(listener1);
		btn2.addActionListener(listener2);
		btn3.addActionListener(listener3);
		
		setVisible(true);
		setBounds(100, 100, 300, 200);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyApp();
	}
}
