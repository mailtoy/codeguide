package codeguide;

/**
 *
 * Exercise for other students to do.
 * @author Kanchanok Kannee
 *
 */
public class Goods  {
	
	private String name;
	private int cost;

	//TODO Complete the Javadoc in this class.
	public Goods() {
	}
	
	/**
	 * Goods with given name and cost of goods.
	 * @param name is the name of goods.
	 * @param cost is the price of goods.
	 */
	public Goods(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	/**
	 * Get the name of this object.
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the price of this object.
	 * @return
	 */
	public int getCost() {
		return cost;
	}
	
	

}
