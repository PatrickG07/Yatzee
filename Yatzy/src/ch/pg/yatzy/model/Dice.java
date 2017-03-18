package ch.pg.yatzy.model;

import javafx.scene.image.Image;
import java.util.Random;

public class Dice {

	private int value;
	private boolean fixed;
	private Image picture;

	public void roll() {
		if (fixed == false) {
			Random random = new Random();
			value = random.nextInt(6) + 1;

			switch (value) {
			case 1:
				picture = new Image("/ch/pg/yatzy/sources/dice-1.png");
				break;
			case 2:
				picture = new Image("/ch/pg/yatzy/sources/dice-2.png");
				break;
			case 3:
				picture = new Image("/ch/pg/yatzy/sources/dice-3.png");
				break;
			case 4:
				picture = new Image("/ch/pg/yatzy/sources/dice-4.png");
				break;
			case 5:
				picture = new Image("/ch/pg/yatzy/sources/dice-5.png");
				break;
			case 6:
				picture = new Image("/ch/pg/yatzy/sources/dice-6.png");
				break;
			}
		}
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isFixed() {
		return fixed;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	public Image getPicture() {
		return picture;
	}
}
