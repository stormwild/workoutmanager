package com.emma.workoutmanager;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WorkoutManager {

	private static final long serialVersionUID = -2492878511255087306L;

	public static void main(String[] args) {		
		getJarPath();
		System.out.println(getCwd());
		return;
		
		// Initialize Frame
		/*JFrame frame = new JFrame("Workout Manager");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Initialize Panel
		initPanel(frame);
		
		// Display Frame
		frame.setVisible(true);*/
	}
	
	private static void initPanel(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel("Hello World!");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);
		
		
		JLabel dirLabel = new JLabel();
		panel.add(dirLabel);
		
		frame.add(panel);
	}
	
	/**
	 * Returns the path to the currently running jar file
	 * @return
	 */
	private static String getJarPath() {
		// Dir of the running jar file
				String jarPath = WorkoutManager.class.getProtectionDomain().getCodeSource().getLocation().getPath();
				try {
					System.out.println(jarPath);
					String decodedPath = URLDecoder.decode(jarPath, "UTF-8");
					System.out.println(decodedPath);
					
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					File jarPathx = new File(WorkoutManager.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
					System.out.println("------------------");
					System.out.println(jarPathx.getPath());
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		return null;
	}
	
	/**
	 * Returns the current working directory
	 * This is the directory where the jar file was executed not the location of the running jar file
	 * @return
	 */
	private static String getCwd() {
		// Paths requires java.nio
		// return Paths.get(".").toAbsolutePath().normalize().toString();
		return System.getProperty("user.dir");
	}
}
