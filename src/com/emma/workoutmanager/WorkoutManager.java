package com.emma.workoutmanager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WorkoutManager {

	private static final long serialVersionUID = -2492878511255087306L;

	public static void main(String[] args) {

		// Initialize Frame
		JFrame frame = new JFrame("Workout Manager");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Initialize Panel
		initPanel(frame);
		
		// Display Frame
		frame.setVisible(true);
	}
	
	private static void initPanel(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel("Hello World!");
		label.setBounds(10, 20, 80, 25);
		
		panel.add(label);
		
		frame.add(panel);
	}
}
