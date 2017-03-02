package codeguide;

/**
 * A main class to create objects and connect objects together.
 * @author Kanchanok Kannee
 *
 */
public class Main {
	
	/**
	 * The play method plays a program.
	 * 
	 * @param create object and start the program.
	 * 
	 */
	public static void main (String [] arg) {
		Goods type = new Goods();
		ConsoleGoods ui = new ConsoleGoods();
		ui.play(type);
	}
	
}
