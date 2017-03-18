package ch.pg.yatzy.controller;

import ch.pg.yatzy.model.Game;
import ch.pg.yatzy.view.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controllerplayer {
	
	@FXML
	protected TextField player1;
	@FXML
	protected TextField player2;

	@FXML
	protected void Play(ActionEvent e) {
		if (!player1.getText().equals("") && !player2.getText().equals("")) {
			Game.play1.setName(player1.getText());
			Game.play2.setName(player2.getText());

			Start.loadScene("/ch/pg/yatzy/view/Playground");
		} else {
			player1.setStyle("-fx-text-box-border: red;");
			player2.setStyle("-fx-text-box-border: red;");
		}
	}

	@FXML
	protected void Back(ActionEvent e) {
		Start.loadScene("/ch/pg/yatzy/view/Main");
	}

}
