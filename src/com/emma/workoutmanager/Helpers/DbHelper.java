package com.emma.workoutmanager.Helpers;

import com.emma.workoutmanager.WorkoutManager;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JLabel;

public class DbHelper {
	private JLabel statusLabel;
	
	public DbHelper(JLabel statusLabel) {
		this.statusLabel = statusLabel;
	}
	
	public void initDb() {
		// let's create the database in the same directory as the running jar file
		// only if the file does not already exist
		
		// Path to currently running jar 
		String jarPath = PathHelpers.getJarPath(WorkoutManager.class);
		String dbName = "workoutmgr.db";
		String dbFilePath = Paths.get(jarPath, dbName).toString();
		
		if(!PathHelpers.FileExists(dbFilePath)) {
			// create db
			String url = "jdbc:sqlite:" + dbFilePath;
			try (Connection conn = DriverManager.getConnection(url)) {
				if(conn != null) {
					DatabaseMetaData meta = conn.getMetaData();
					// Display success in window
					String msg = "DriverName: " + meta.getDriverName() + ". Database successfully created.";
					this.statusLabel.setText(msg);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} else {
			this.statusLabel.setText("Database file already exists");
		}
		
	}
}
