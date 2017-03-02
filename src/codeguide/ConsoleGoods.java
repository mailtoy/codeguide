package codeguide;

import java.util.Scanner;
/**
 * //TODO Complete the Javadoc in this class.
 * @author Kanchanok Kannee
 *
 */
public class ConsoleGoods {
	
	//TODO Rename using by meaningful names.
	private int num = 0;
	private Goods[] a = new Goods[20];
	private Scanner s = new Scanner(System.in);

	
	//TODO that is being duplicated. So we can write a separate method.
	/**
	 * Add name and price of goods in array.
	 */
	private void addGoods() {
		System.out.println("A goods name is ");
		String name = s.next();
		System.out.println("How much? : ");
		int cost = s.nextInt();
		a[num] = new Goods(name, cost);
		num++;
		System.out.println(".......................");
	}

	/**
	 * //TODO This method has a magic number, replace magic numbers with symbolic constant( ONE_DECIMAL )
	 * Show the list of goods.
	 */
	private void showGoods() {
		if (num == 0) {
			System.out.println("No Goods!");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.println((i + 1)+ ". " + a[i].getName() + " " + a[i].getCost()*1.0 + " Baht.");
			}
		}
		System.out.println(".......................");
	}
	
	/**
	 * The play method plays a program using input from a user.
	 * @param type
	 * @return
	 */
	public String play(Goods type) {
		String menu = "";
		do {
			if (menu.equals("a")) {
				addGoods();

			}
			if (menu.equals("s")) {
				showGoods();
			}
			
			if (menu.equals("q")) {
				break;
			}
			System.out.print("(a)ad, (s)how, (q)uit : ");
			menu = s.next();
		} while (true);
		System.out.println("Bye");
		return "";

	}

}
