package ch.pg.yatzy.model;

import java.util.Arrays;

public class Table {

	private int one;
	private int two;
	private int three;
	private int four;
	private int five;
	private int six;
	private int bonus;
	private int triple;
	private int quatruple;
	private int fullhouse;
	private int smallstreet;
	private int bigstreet;
	private int yatzy;
	private int chanze;
	private int calculateUp;
	private int calculateDown;
	private int sum;
	
	int d1;
	int d2;
	int d3;
	int d4;
	int d5;
	int[] array = new int[5];
	
	/**
	 * To Calculate first row.
	 */
	public void calculateUp() {
		calculateUp = one + two + three + four + five + six;
		if (calculateUp > 62) {
			calculateUp = 35 + calculateUp;
		}
		calculateDown();
	}

	public int getCalculateUp() {
		return calculateUp;
	}

	/**
	 * To Calculate the second row.
	 */
	public void calculateDown() {
		calculateDown = triple + quatruple + fullhouse + smallstreet + bigstreet + yatzy + chanze;
		calculatesum();
	}

	public int getCalculateDown() {
		return calculateDown;
	}

	/**
	 * To calculate the sum.
	 */
	public void calculatesum() {
		sum = calculateUp + calculateDown;
	}

	public int getSum() {
		return sum;
	}

	/**
	 * To calculate how many ones jou got.
	 */
	public void One() {
		if (Game.dice1.getValue() == 1) {
			one++;
		}
		if (Game.dice2.getValue() == 1) {
			one++;
		}
		if (Game.dice3.getValue() == 1) {
			one++;
		}
		if (Game.dice4.getValue() == 1) {
			one++;
		}
		if (Game.dice5.getValue() == 1) {
			one++;
		}
	}

	public int getOne() {
		return one;
	}

	/**
	 * To calculate how many twos jou got.
	 */
	public void Two() {
		if (Game.dice1.getValue() == 2) {
			two = two + 2;
		}
		if (Game.dice2.getValue() == 2) {
			two = two + 2;
		}
		if (Game.dice3.getValue() == 2) {
			two = two + 2;
		}
		if (Game.dice4.getValue() == 2) {
			two = two + 2;
		}
		if (Game.dice5.getValue() == 2) {
			two = two + 2;
		}
	}

	public int getTwo() {
		return two;
	}
	
	/**
	 * To calculate how many threes jou got.
	 */
	public void Three() {
		if (Game.dice1.getValue() == 3) {
			three = three + 3;
		}
		if (Game.dice2.getValue() == 3) {
			three = three + 3;
		}
		if (Game.dice3.getValue() == 3) {
			three = three + 3;
		}
		if (Game.dice4.getValue() == 3) {
			three = three + 3;
		}
		if (Game.dice5.getValue() == 3) {
			three = three + 3;
		}
	}

	public int getThree() {
		return three;
	}

	/**
	 * To calculate how many fours jou got.
	 */
	public void Four() {
		if (Game.dice1.getValue() == 4) {
			four = four + 4;
		}
		if (Game.dice2.getValue() == 4) {
			four = four + 4;
		}
		if (Game.dice3.getValue() == 4) {
			four = four + 4;
		}
		if (Game.dice4.getValue() == 4) {
			four = four + 4;
		}
		if (Game.dice5.getValue() == 4) {
			four = four + 4;
		}
	}

	public int getFour() {
		return four;
	}

	/**
	 * To calculate how many fives jou got.
	 */
	public void Five() {
		if (Game.dice1.getValue() == 5) {
			five = five + 5;
		}
		if (Game.dice2.getValue() == 5) {
			five = five + 5;
		}
		if (Game.dice3.getValue() == 5) {
			five = five + 5;
		}
		if (Game.dice4.getValue() == 5) {
			five = five + 5;
		}
		if (Game.dice5.getValue() == 5) {
			five = five + 5;
		}
	}

	public int getFive() {
		return five;
	}

	/**
	 * To calculate how many sixes jou got.
	 */
	public void Six() {
		if (Game.dice1.getValue() == 6) {
			six = six + 6;
		}
		if (Game.dice2.getValue() == 6) {
			six = six + 6;
		}
		if (Game.dice3.getValue() == 6) {
			six = six + 6;
		}
		if (Game.dice4.getValue() == 6) {
			six = six + 6;
		}
		if (Game.dice5.getValue() == 6) {
			six = six + 6;
		}
	}

	public int getSix() {
		return six;
	}

	public int getBonus() {
		return bonus;
	}

	/**
	 * To calculate if you have a triple.
	 */
	public void Triple() {
		array[0] = Game.dice1.getValue();
		array[1] = Game.dice2.getValue();
		array[2] = Game.dice3.getValue();
		array[3] = Game.dice4.getValue();
		array[4] = Game.dice5.getValue();
		Arrays.sort(array);
		d1 = array[0];
		d2 = array[1];
		d3 = array[2];
		d4 = array[3];
		d5 = array[4];
		if (d1 == d2 && d1 == d3 || d2 == d3 && d2 == d4 || d3 == d4 && d3 == d5) {
			triple = d1 + d2 + d3 + d4 + d5;
		}
	}

	public int getTriple() {
		return triple;
	}

	/**
	 * To calculate if you have a quatruple.
	 */
	public void Quatruple() {
		array[0] = Game.dice1.getValue();
		array[1] = Game.dice2.getValue();
		array[2] = Game.dice3.getValue();
		array[3] = Game.dice4.getValue();
		array[4] = Game.dice5.getValue();
		Arrays.sort(array);
		d1 = array[0];
		d2 = array[1];
		d3 = array[2];
		d4 = array[3];
		d5 = array[4];
		if (d1 == d2 && d1 == d3 && d1 == d4 || d2 == d3 && d2 == d4 && d2 == d5) {
			quatruple = d1 + d2 + d3 + d4 + d5;
		}
	}

	public int getQuatruple() {
		return quatruple;
	}

	/**
	 * To calculate if you have a fullhouse.
	 */
	public void House() {
		array[0] = Game.dice1.getValue();
		array[1] = Game.dice2.getValue();
		array[2] = Game.dice3.getValue();
		array[3] = Game.dice4.getValue();
		array[4] = Game.dice5.getValue();
		Arrays.sort(array);
		d1 = array[0];
		d2 = array[1];
		d3 = array[2];
		d4 = array[3];
		d5 = array[4];
		if (d1 == d2 && d1 == d3 && d4 == d5 || d1 == d2 && d3 == d4 && d3 == d5) {
			fullhouse = 25;
		}
	}

	public int getFullhouse() {
		return fullhouse;
	}

	/**
	 * To calculate if you have a smalsteet(1-4).
	 */
	public void Smallstreet() {
		array[0] = Game.dice1.getValue();
		array[1] = Game.dice2.getValue();
		array[2] = Game.dice3.getValue();
		array[3] = Game.dice4.getValue();
		array[4] = Game.dice5.getValue();
		Arrays.sort(array);
		d1 = array[0];
		d2 = array[1];
		d3 = array[2];
		d4 = array[3];
		d5 = array[4];
		if(d1 == d2){
			array[0] = 8;
		}
		if(d2 == d3){
			array[1] = 8;
		}
		if(d3 == d4){
			array[2] = 8;
		}
		if(d4 == d5){
			array[3] = 8;
		}
		Arrays.sort(array);
		int c1 = array[0];
		int c2 = array[1];
		int c3 = array[2];
		int c4 = array[3];
		int c5 = array[4];

		if ((c1 + 1) == c2 && (c2 + 1) == c3 && (c3 + 1) == c4 || (c2 + 1) == c3 && (c3 + 1) == c4 && (c4 + 1) == c5) {
			smallstreet = 30;
		}
	}

	public int getSmallstreet() {
		return smallstreet;
	}

	/**
	 * To calculate if you have a bigsteet(1-5).
	 */
	public void BigStreet() {
		array[0] = Game.dice1.getValue();
		array[1] = Game.dice2.getValue();
		array[2] = Game.dice3.getValue();
		array[3] = Game.dice4.getValue();
		array[4] = Game.dice5.getValue();
		Arrays.sort(array);
		d1 = array[0];
		d2 = array[1];
		d3 = array[2];
		d4 = array[3];
		d5 = array[4];
		if ((d1 + 1) == d2 && (d2 + 1) == d3 && (d3 + 1) == d4 && (d4 + 1) == d5) {
			bigstreet = 40;
		}
	}

	public int getBigstreet() {
		return bigstreet;
	}

	/**
	 * To calculate if you have a yatzy.
	 */
	public void Yatzy() {
		array[0] = Game.dice1.getValue();
		array[1] = Game.dice2.getValue();
		array[2] = Game.dice3.getValue();
		array[3] = Game.dice4.getValue();
		array[4] = Game.dice5.getValue();
		Arrays.sort(array);
		d1 = array[0];
		d2 = array[1];
		d3 = array[2];
		d4 = array[3];
		d5 = array[4];
		if (d1 == d2 && d1 == d3 && d1 == d4 && d1 == d5) {
			yatzy = 50;
		} else {
			yatzy = 0;
		}
	}

	public int getYatzy() {
		return yatzy;
	}

	/**
	 * To calculate the chanze.
	 */
	public void Chanze() {
		array[0] = Game.dice1.getValue();
		array[1] = Game.dice2.getValue();
		array[2] = Game.dice3.getValue();
		array[3] = Game.dice4.getValue();
		array[4] = Game.dice5.getValue();
		Arrays.sort(array);
		d1 = array[0];
		d2 = array[1];
		d3 = array[2];
		d4 = array[3];
		d5 = array[4];
		chanze = d1 + d2 + d3 + d4 + d5;
	}

	public int getChanze() {
		return chanze;
	}

	public int getD1() {
		return d1;
	}

	public void setD1(int d1) {
		this.d1 = d1;
	}

	public int getD2() {
		return d2;
	}

	public void setD2(int d2) {
		this.d2 = d2;
	}

	public int getD3() {
		return d3;
	}

	public void setD3(int d3) {
		this.d3 = d3;
	}

	public int getD4() {
		return d4;
	}

	public void setD4(int d4) {
		this.d4 = d4;
	}

	public int getD5() {
		return d5;
	}

	public void setD5(int d5) {
		this.d5 = d5;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public void setThree(int three) {
		this.three = three;
	}

	public void setFour(int four) {
		this.four = four;
	}

	public void setFive(int five) {
		this.five = five;
	}

	public void setSix(int six) {
		this.six = six;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setTriple(int triple) {
		this.triple = triple;
	}

	public void setQuatruple(int quatruple) {
		this.quatruple = quatruple;
	}

	public void setFullhouse(int fullhouse) {
		this.fullhouse = fullhouse;
	}

	public void setSmallstreet(int smallstreet) {
		this.smallstreet = smallstreet;
	}

	public void setBigstreet(int bigstreet) {
		this.bigstreet = bigstreet;
	}

	public void setYatzy(int yatzy) {
		this.yatzy = yatzy;
	}

	public void setChanze(int chanze) {
		this.chanze = chanze;
	}

	public void setCalculateUp(int calculateUp) {
		this.calculateUp = calculateUp;
	}

	public void setCalculateDown(int calculateDown) {
		this.calculateDown = calculateDown;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}