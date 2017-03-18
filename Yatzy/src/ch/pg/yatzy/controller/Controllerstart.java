package ch.pg.yatzy.controller;

import ch.pg.yatzy.view.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controllerstart {

	@FXML
	protected void Spielen(ActionEvent e) {
		Start.loadScene("/ch/pg/yatzy/view/Playerchange");
	}

	@FXML
	protected void Highscore(ActionEvent e) {
		Start.loadScene("/ch/pg/yatzy/view/Highscore");
	}

	@FXML
	protected void Quit(ActionEvent e) {
		System.exit(0);
	}
}
