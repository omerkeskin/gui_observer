package com.concrete;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import listener.AngelListener;
import listener.DevilListener;





public class Main {

	JFrame frame;
	
	public static void main(String[] args) {
		Main ex = new Main();
		ex.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should i do it.");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(button);
		frame.setBounds(0, 0, 500, 500);
		frame.setEnabled(true);
		
		
		JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
 
        panel.add(button);
 
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}
