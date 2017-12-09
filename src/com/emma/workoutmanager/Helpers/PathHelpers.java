package com.emma.workoutmanager.Helpers;

import java.io.File;
import java.net.URISyntaxException;

import com.emma.workoutmanager.WorkoutManager;

public class PathHelpers {
	
	/**
	 * Returns the path to the currently running jar file
	 * 
	 * @param <WorkoutManager>
	 * @return String
	 */
	public static String getJarPath(Class<WorkoutManager> className) {
		try {
			return new File(className.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getPath();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Returns the current working directory
	 * This is the directory where the jar file was executed not the location of the running jar file
	 * 
	 * @return String
	 */
	public static String getCwd() {
		// Paths requires java.nio
		// return Paths.get(".").toAbsolutePath().normalize().toString();
		return System.getProperty("user.dir");
	}
	
	public static Boolean FileExists(String filePath) {
		return new File(filePath).isFile();
	}
}
