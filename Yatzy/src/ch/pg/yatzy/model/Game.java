package ch.pg.yatzy.model;

import ch.pg.yatzy.model.Dice;

public class Game {

	public static Dice dice1 = new Dice();
	public static Dice dice2 = new Dice();
	public static Dice dice3 = new Dice();
	public static Dice dice4 = new Dice();
	public static Dice dice5 = new Dice();

	public static Table table1 = new Table();
	public static Table table2 = new Table();
	
	public static Player play1 = new Player();
	public static Player play2 = new Player();

	int roll = 0;
	String actualTable = "table1";

	public void roll() {
		dice1.roll();
		dice2.roll();
		dice3.roll();
		dice4.roll();
		dice5.roll();
		roll++;
	}

	public void Type() {
		Game.table1.setOne(0);
		Game.table1.setTwo(0);
		Game.table1.setThree(0);
		Game.table1.setFour(0);
		Game.table1.setFive(0);
		Game.table1.setSix(0);
		Game.table1.setBonus(0);
		Game.table1.setTriple(0);
		Game.table1.setQuatruple(0);
		Game.table1.setFullhouse(0);
		Game.table1.setSmallstreet(0);
		Game.table1.setBigstreet(0);
		Game.table1.setYatzy(0);
		Game.table1.setChanze(0);
		Game.table1.setCalculateUp(0);
		Game.table1.setCalculateDown(0);
		Game.table1.setSum(0);
		Game.table2.setOne(0);
		Game.table2.setTwo(0);
		Game.table2.setThree(0);
		Game.table2.setFour(0);
		Game.table2.setFive(0);
		Game.table2.setSix(0);
		Game.table2.setBonus(0);
		Game.table2.setTriple(0);
		Game.table2.setQuatruple(0);
		Game.table2.setFullhouse(0);
		Game.table2.setSmallstreet(0);
		Game.table2.setBigstreet(0);
		Game.table2.setYatzy(0);
		Game.table2.setChanze(0);
		Game.table2.setCalculateUp(0);
		Game.table2.setCalculateDown(0);
		Game.table2.setSum(0);
	}

	public String getActualTable() {
		return actualTable;
	}

	public void setAtualTable(String table) {
		this.actualTable = table;
	}
}
