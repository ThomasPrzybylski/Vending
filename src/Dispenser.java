public class Dispenser {
	private Item thing;
	private int count;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Dispenser(Item thing, int count) {
		this.setThing(thing);
		this.setCount(count);
	}

	public Dispenser() {
		thing = null;
		count = 0;
	}

	public Item getThing() {
		return thing;
	}

	public void setThing(Item thing) {
		this.thing = thing;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void dispence() {
		count--;
	}

	public String toFile() {
		String out = null;
		out += thing.toFile() + "\n";
		out += "Count:               " + count;
		return null;
	}

}
