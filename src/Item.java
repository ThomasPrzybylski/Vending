public class Item {
	private String name;
	private String catagory;
	private double cost;
	private int[] healthInf = new int[8];

	public Item(String name, double cost, int[] healthInf) {
		this.setName(name);
		this.setCost(cost);
		this.setHealthInf(healthInf);

	}

	public Item(String name, String catagory, double cost, int[] healthInf) {
		this.setName(name);
		this.setCatagory(catagory);
		this.setCost(cost);
		this.setHealthInf(healthInf);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getHealthInf() {
		String out = null;
		out += "Calories: " + healthInf[0] + "/n";
		out += "Total Fat: " + healthInf[1] + "g" + "/n";
		out += "Saturated Fat: " + healthInf[2] + "g" + "/n";
		out += "Unsaturated Fat: " + healthInf[3] + "g" + "/n";
		out += "Total Carbohydrates: " + healthInf[4] + "g" + "/n";
		out += "Sugars: " + healthInf[5] + "g" + "/n";
		out += "Fiber: " + healthInf[6] + "g" + "/n";
		out += "Protien: " + healthInf[7] + "g" + "/n";
		return out;
	}

	public String toFile() {
		String out = null;
		out += "Name:                " + name + "/n";
		out += "Cost:                " + cost + "/n";
		out += "Catagory:            " + catagory + "/n";
		out += "Calories:            " + healthInf[0] + "/n";
		out += "Total Fat:           " + healthInf[1] + "/n";
		out += "Saturated Fat:       " + healthInf[2] + "/n";
		out += "Unsaturated Fat:     " + healthInf[3] + "/n";
		out += "Total Carbohydrates: " + healthInf[4] + "/n";
		out += "Sugars:              " + healthInf[5] + "/n";
		out += "Fiber:               " + healthInf[6] + "/n";
		out += "Protien:             " + healthInf[7] + "/n";
		return out;
	}

	public void setHealthInf(int[] healthInf) {
		this.healthInf = healthInf;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public int getHealthInf(int i) {
		return healthInf[i];
	}
}
