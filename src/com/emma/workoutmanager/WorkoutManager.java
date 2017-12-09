package com.emma.workoutmanager;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.emma.workoutmanager.Helpers.Helpers;

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
		
		JLabel dirLabel = new JLabel("Dir: " + Helpers.getJarPath(WorkoutManager.class));
		dirLabel.setBounds(10, 40, 600, 25);
		panel.add(dirLabel);
		
		frame.add(panel);
	}
}
