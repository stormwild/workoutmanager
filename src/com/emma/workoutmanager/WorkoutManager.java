package com.emma.workoutmanager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.emma.workoutmanager.Helpers.DbHelper;
import com.emma.workoutmanager.Helpers.PathHelpers;

public class WorkoutManager {

	private static final long serialVersionUID = -2492878511255087306L;

	public static void main(String[] args) {
		init();
	}

	private static void init() {
		// Initialize Frame
		JFrame frame = new JFrame("Workout Manager");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel statusBar = new JPanel();
		statusBar.setLayout(new BorderLayout());
        statusBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusBar.setBackground(Color.LIGHT_GRAY);
        
        JLabel statusLabel = new JLabel("Status");

        Font font = statusLabel.getFont();
        font = font.deriveFont(
        		Collections.singletonMap(
        				TextAttribute.WEIGHT, TextAttribute.WEIGHT_REGULAR));
        statusLabel.setFont(font);
        
        statusBar.add(statusLabel);
        
        frame.add("South", statusBar);
        
		// Initialize Panel
		initPanel(frame);

		// Display Frame
		frame.setVisible(true);
		
		DbHelper dbHelper = new DbHelper(statusLabel);
		dbHelper.initDb();
	}

	private static void initPanel(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setLayout(null);

		JLabel label = new JLabel("Hello World!");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);

		JLabel dirLabel = new JLabel("Dir: " + PathHelpers.getJarPath(WorkoutManager.class));
		dirLabel.setBounds(10, 40, 600, 25);
		panel.add(dirLabel);

		frame.add(panel);
	}
}
