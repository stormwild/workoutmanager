package com.emma.workoutmanager;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WorkoutManager extends JFrame {

	private static final long serialVersionUID = -2492878511255087306L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WorkoutManager();
	}
	
	WorkoutManager() {
		JLabel label = new JLabel("Hello world");
		add(label);
		this.setSize(100, 100);
		setVisible(true);
	}

}
