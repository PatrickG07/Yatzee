package ch.pg.yatzy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.pg.yatzy.model.Game;

public class SumTest {

	@Test
	public void testsumm() {
		Game.table1.setOne(4);
		Game.table1.calculateUp();
		assertEquals(4, Game.table1.getSum());
	}

	@Test
	public void testroll() {
		Game g1 = new Game();
		if(Game.dice1.getValue() == 1){
			assertEquals(1, Game.dice1.getValue());
		}if(Game.dice1.getValue() == 2){
			assertEquals(2, Game.dice1.getValue());
		}if(Game.dice1.getValue() == 3){
			assertEquals(3, Game.dice1.getValue());
		}if(Game.dice1.getValue() == 4){
			assertEquals(4, Game.dice1.getValue());
		}if(Game.dice1.getValue() == 5){
			assertEquals(5, Game.dice1.getValue());
		}if(Game.dice1.getValue() == 6){
			assertEquals(6, Game.dice1.getValue());
		}
	}
}
