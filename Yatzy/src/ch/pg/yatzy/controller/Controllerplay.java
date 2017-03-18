package ch.pg.yatzy.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch.pg.yatzy.model.Game;
import ch.pg.yatzy.view.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controllerplay {

	@FXML
	protected Label player11, player12, player21, player22, summup1, summup2, sumall1, sumall2;
	@FXML
	protected ImageView image1, image2, image3, image4, image5;
	@FXML
	protected Button roll, one1, one2, two1, two2, three1, three2, four1, four2, five1, five2, six1, six2, trip1, trip2,
			quad1, quad2, house1, house2, sstreet1, sstreet2, bstreet1, bstreet2, yatze1, yatze2, chan1, chan2;
	@FXML
	protected Pane up1, up2, down1, down2;

	int gameend = 0;

	Game game = new Game();
	String table = "table1";
	int i = 3;

	@FXML
	public void initialize() {
		player11.setText(Game.play1.getName());
		player12.setText(Game.play1.getName());
		player21.setText(Game.play2.getName());
		player22.setText(Game.play2.getName());
	}

	@FXML
	protected void Roll(ActionEvent e) {
		image1.setVisible(true);
		image2.setVisible(true);
		image3.setVisible(true);
		image4.setVisible(true);
		image5.setVisible(true);
		if (i > 0) {
			i--;
			roll.setText("Roll(" + i + ")");
			image1.setDisable(false);
			image2.setDisable(false);
			image3.setDisable(false);
			image4.setDisable(false);
			image5.setDisable(false);
			game.roll();
			image1.setImage(Game.dice1.getPicture());
			image2.setImage(Game.dice2.getPicture());
			image3.setImage(Game.dice3.getPicture());
			image4.setImage(Game.dice4.getPicture());
			image5.setImage(Game.dice5.getPicture());
			if (i == 0) {
				roll.setDisable(true);
			}
		}
	}

	@FXML
	protected void Fix(MouseEvent e) {
		ImageView fixer = (ImageView) e.getSource();
		if (fixer.getOpacity() == 1) {
			fixer.setOpacity(0.30);
			switch (fixer.getId()) {
			case ("image1"):
				Game.dice1.setFixed(true);
				break;
			case ("image2"):
				Game.dice2.setFixed(true);
				break;
			case ("image3"):
				Game.dice3.setFixed(true);
				break;
			case ("image4"):
				Game.dice4.setFixed(true);
				break;
			case ("image5"):
				Game.dice5.setFixed(true);
				break;
			}
		} else {
			fixer.setOpacity(1);
			switch (fixer.getId()) {
			case ("image1"):
				Game.dice1.setFixed(false);
				break;
			case ("image2"):
				Game.dice2.setFixed(false);
				break;
			case ("image3"):
				Game.dice3.setFixed(false);
				break;
			case ("image4"):
				Game.dice4.setFixed(false);
				break;
			case ("image5"):
				Game.dice5.setFixed(false);
				break;
			}
		}
	}

	@FXML
	protected void Set(ActionEvent e) {
		if (Game.dice1.getValue() != 0) {
			gameend++;
			Button seter = (Button) e.getSource();
			seter.setDisable(true);
			String text = null;
			switch (seter.getId()) {
			// eins 1
			case ("one1"):
				Game.table1.One();
				text = new Integer(Game.table1.getOne()).toString();
				break;
			case ("one2"):
				Game.table2.One();
				text = new Integer(Game.table2.getOne()).toString();
				break;
			// zwei 2
			case ("two1"):
				Game.table1.Two();
				text = new Integer(Game.table1.getTwo()).toString();
				break;
			case ("two2"):
				Game.table2.Two();
				text = new Integer(Game.table2.getTwo()).toString();
				break;
			// drei 3
			case ("three1"):
				Game.table1.Three();
				text = new Integer(Game.table1.getThree()).toString();
				break;
			case ("three2"):
				Game.table2.Three();
				text = new Integer(Game.table2.getThree()).toString();
				break;
			// fier 4
			case ("four1"):
				Game.table1.Four();
				text = new Integer(Game.table1.getFour()).toString();
				break;
			case ("four2"):
				Game.table2.Four();
				text = new Integer(Game.table2.getFour()).toString();
				break;
			// fünf 5
			case ("five1"):
				Game.table1.Five();
				text = new Integer(Game.table1.getFive()).toString();
				break;
			case ("five2"):
				Game.table2.Five();
				text = new Integer(Game.table2.getFive()).toString();
				break;
			// sechs 6
			case ("six1"):
				Game.table1.Six();
				text = new Integer(Game.table1.getSix()).toString();
				break;
			case ("six2"):
				Game.table2.Six();
				text = new Integer(Game.table2.getSix()).toString();
				break;
			// thriple
			case ("trip1"):
				Game.table1.Triple();
				text = new Integer(Game.table1.getTriple()).toString();
				break;
			case ("trip2"):
				Game.table2.Triple();
				text = new Integer(Game.table2.getTriple()).toString();
				break;
			// quatruple
			case ("quad1"):
				Game.table1.Quatruple();
				text = new Integer(Game.table1.getQuatruple()).toString();
				break;
			case ("quad2"):
				Game.table2.Quatruple();
				text = new Integer(Game.table2.getQuatruple()).toString();
				break;
			// house
			case ("house1"):
				Game.table1.House();
				text = new Integer(Game.table1.getFullhouse()).toString();
				break;
			case ("house2"):
				Game.table2.House();
				text = new Integer(Game.table2.getFullhouse()).toString();
				break;
			// smalstreet
			case ("sstreet1"):
				Game.table1.Smallstreet();
				text = new Integer(Game.table1.getSmallstreet()).toString();
				break;
			case ("sstreet2"):
				Game.table2.Smallstreet();
				text = new Integer(Game.table2.getSmallstreet()).toString();
				break;
			// bigstreet
			case ("bstreet1"):
				Game.table1.BigStreet();
				text = new Integer(Game.table1.getBigstreet()).toString();
				break;
			case ("bstreet2"):
				Game.table2.BigStreet();
				text = new Integer(Game.table2.getBigstreet()).toString();
				break;
			// Yatze
			case ("yatze1"):
				Game.table1.Yatzy();
				text = new Integer(Game.table1.getYatzy()).toString();
				break;
			case ("yatze2"):
				Game.table2.Yatzy();
				text = new Integer(Game.table2.getYatzy()).toString();
				seter.setText(text);
				break;
			// chanze
			case ("chan1"):
				Game.table1.Chanze();
				text = new Integer(Game.table1.getChanze()).toString();
				break;
			case ("chan2"):
				Game.table2.Chanze();
				text = new Integer(Game.table2.getChanze()).toString();
				break;
			}
			seter.setText(text);
			Game.table1.calculateUp();
			text = new Integer(Game.table1.getCalculateUp()).toString();
			summup1.setText(text);
			text = new Integer(Game.table1.getSum()).toString();
			sumall1.setText(text);
			Game.table2.calculateUp();
			text = new Integer(Game.table2.getCalculateUp()).toString();
			summup2.setText(text);
			text = new Integer(Game.table2.getSum()).toString();
			sumall2.setText(text);
			roll.setDisable(false);
			roll.setText("Roll(3)");
			i = 3;
			image1.setDisable(true);
			image2.setDisable(true);
			image3.setDisable(true);
			image4.setDisable(true);
			image5.setDisable(true);
			image1.setOpacity(1);
			image2.setOpacity(1);
			image3.setOpacity(1);
			image4.setOpacity(1);
			image5.setOpacity(1);
			image1.setVisible(false);
			image2.setVisible(false);
			image3.setVisible(false);
			image4.setVisible(false);
			image5.setVisible(false);
			Game.dice1.setFixed(false);
			Game.dice2.setFixed(false);
			Game.dice3.setFixed(false);
			Game.dice4.setFixed(false);
			Game.dice5.setFixed(false);
			Game.dice1.setValue(0);
			if (game.getActualTable() == "table1") {
				up1.setDisable(true);
				down1.setDisable(true);
				up2.setDisable(false);
				down2.setDisable(false);
				game.setAtualTable("table2");
			} else {
				up1.setDisable(false);
				down1.setDisable(false);
				up2.setDisable(true);
				down2.setDisable(true);
				game.setAtualTable("table1");
			}
			if (gameend >= 26) {
				String text2;
				if (Game.table1.getSum() > Game.table2.getSix()) {
					text = "The Winner is: " + Game.play1.getName();
					text2 = new Integer(Game.table1.getSum()).toString();
				} else if (Game.table2.getSum() > Game.table1.getSix()) {
					text = "The Winner is: " + Game.play2.getName();
					text2 = new Integer(Game.table2.getSum()).toString();
				} else {
					text = "The Winners are: " + Game.play1.getName() + " and " + Game.play2.getName();
					text2 = new Integer(Game.table1.getSum()).toString();
				}
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Winner!");
				alert.setHeaderText(text);
				alert.setContentText("Points: " + text2);
				alert.showAndWait();

				try {
					Class.forName("org.sqlite.JDBC").newInstance();
					Connection con = DriverManager.getConnection("jdbc:sqlite:Yatze.db");
					System.out.println("connection made...");
					PreparedStatement stmt = con
							.prepareStatement("INSERT INTO Highscore(Name, Highscore) VALUES(?, ?)");
					try {
						stmt.setString(1, Game.play1.getName());
						stmt.setString(2, "" + Game.table1.getSum());
						stmt.execute();
						System.out.println("Data is inserted 1");
						stmt.close();
					} catch (SQLException e1) {
					}
					try {
						stmt.close();
						stmt = con.prepareStatement("INSERT INTO Highscore(Name, Highscore) VALUES(?, ?)");
						stmt.setString(1, Game.play2.getName());
						stmt.setString(2, "" + Game.table2.getSum());
						stmt.execute();
						System.out.println("Data is inserted 2");
						stmt.close();
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
				game.Type();
				Start.loadScene("/ch/pg/yatzy/view/Main");
			}
		}
	}
}
