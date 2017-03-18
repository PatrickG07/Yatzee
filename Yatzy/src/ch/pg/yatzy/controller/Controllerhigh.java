package ch.pg.yatzy.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ch.pg.yatzy.view.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controllerhigh {
	@FXML protected TextArea textarea;
	
	String all;
	String brek = System.getProperty("line.separator");
	
	@FXML
	public void initialize() {
		textarea.setText("");
		all = "";
		try {
			Class.forName("org.sqlite.JDBC").newInstance();
			Connection con = DriverManager.getConnection("jdbc:sqlite:Yatze.db");
			System.out.println("connection made...");
			String select = "SELECT Name, Highscore FROM Highscore order by Highscore asc";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			try {
				while(rs.next()){
					all = rs.getString("Name") + "     " +rs.getString("Highscore") + brek + all;
				}
				textarea.setText(all);
			} catch (SQLException e1) {
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
	}
	
	@FXML
	protected void Back(ActionEvent e) {
		Start.loadScene("/ch/pg/yatzy/view/Main");
	}
}
