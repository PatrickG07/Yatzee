package ch.pg.yatzy.view;

import java.io.IOException;
import java.net.URL;

import ch.pg.yatzy.controller.Controllerstart;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {

	public static Stage mainStage;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);

		primaryStage.setTitle("Yatzy");
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene);
		primaryStage.show();

		mainStage = primaryStage;
	}

	public static void loadScene(String name) {
		Parent parentToLoad = null;

		try {
			URL resourcePath = Controllerstart.class.getResource(name + ".fxml");
			parentToLoad = FXMLLoader.load(resourcePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene sceneToLoad = new Scene(parentToLoad);
		mainStage.setScene(sceneToLoad);
	}
}
