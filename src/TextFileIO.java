import java.util.Scanner;
import java.io.*;

public class TextFileIO {
	/*
	 * public static void main(String[] args) { String fileName = "vending.txt";
	 * PrintWriter textStream =TextFileIO.createTextWrite(fileName); String out
	 * = null; textStream.println("1");
	 * textStream.println("Name:                " + "Coke");
	 * textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 120);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("2"); textStream.println("Name:                " +
	 * "Root Beer"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 120);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("3"); textStream.println("Name:                " +
	 * "Moutain Dew"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 120);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("4"); textStream.println("Name:                " +
	 * "Pepsi"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 120);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("5"); textStream.println("Name:                " +
	 * "Sprite"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 120);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("6"); textStream.println("Name:                " +
	 * "Iced Tea"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 10);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 1);
	 * textStream.println("Sugars:              " + 1);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("7"); textStream.println("Name:                " +
	 * "Chips"); textStream.println("Catagory:            " + "Food");
	 * textStream.println("Cost:                " + 2.00);
	 * textStream.println("Calories:            " + 140);
	 * textStream.println("Total Fat:           " + 2);
	 * textStream.println("Saturated Fat:       " + 1);
	 * textStream.println("Unsaturated Fat:     " + 1);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("8"); textStream.println("Name:                " +
	 * "Beef Jerky"); textStream.println("Catagory:            " + "Food");
	 * textStream.println("Cost:                " + 1.00);
	 * textStream.println("Calories:            " + 50);
	 * textStream.println("Total Fat:           " + 4);
	 * textStream.println("Saturated Fat:       " + 2);
	 * textStream.println("Unsaturated Fat:     " + 2);
	 * textStream.println("Total Carbohydrates: " + 0);
	 * textStream.println("Sugars:              " + 0);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 12);
	 * 
	 * textStream.println("9"); textStream.println("Name:                " +
	 * "Water"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.00);
	 * textStream.println("Calories:            " + 0);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 0);
	 * textStream.println("Sugars:              " + 0);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("10"); textStream.println("Name:                " +
	 * "Chetos"); textStream.println("Catagory:            " + "Food");
	 * textStream.println("Cost:                " + 2.00);
	 * textStream.println("Calories:            " + 140);
	 * textStream.println("Total Fat:           " + 2);
	 * textStream.println("Saturated Fat:       " + 1);
	 * textStream.println("Unsaturated Fat:     " + 1);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("11"); textStream.println("Name:                " +
	 * "Chocolate Bar"); textStream.println("Catagory:            " + "Food");
	 * textStream.println("Cost:                " + .50);
	 * textStream.println("Calories:            " + 60);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 6);
	 * textStream.println("Sugars:              " + 6);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("12"); textStream.println("Name:                " +
	 * "Birch Beer"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 120);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("13"); textStream.println("Name:                " +
	 * "Snickers"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + .50);
	 * textStream.println("Calories:            " + 60);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 6);
	 * textStream.println("Sugars:              " + 6);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("14"); textStream.println("Name:                " +
	 * "Dr. Pepper"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 120);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("15"); textStream.println("Name:                " +
	 * "Lemon Lime Soda"); textStream.println("Catagory:            " +
	 * "Drink"); textStream.println("Cost:                " + 1.50);
	 * textStream.println("Calories:            " + 120);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("16"); textStream.println("Name:                " +
	 * "Sweet Iced Tea"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.75);
	 * textStream.println("Calories:            " + 100);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 10);
	 * textStream.println("Sugars:              " + 10);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("17"); textStream.println("Name:                " +
	 * "Tortilla Chips"); textStream.println("Catagory:            " + "Food");
	 * textStream.println("Cost:                " + 2.00);
	 * textStream.println("Calories:            " + 140);
	 * textStream.println("Total Fat:           " + 2);
	 * textStream.println("Saturated Fat:       " + 1);
	 * textStream.println("Unsaturated Fat:     " + 1);
	 * textStream.println("Total Carbohydrates: " + 12);
	 * textStream.println("Sugars:              " + 12);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("18"); textStream.println("Name:                " +
	 * "Deer Jerky"); textStream.println("Catagory:            " + "Food");
	 * textStream.println("Cost:                " + 1.25);
	 * textStream.println("Calories:            " + 50);
	 * textStream.println("Total Fat:           " + 4);
	 * textStream.println("Saturated Fat:       " + 2);
	 * textStream.println("Unsaturated Fat:     " + 2);
	 * textStream.println("Total Carbohydrates: " + 0);
	 * textStream.println("Sugars:              " + 0);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 12);
	 * 
	 * textStream.println("19"); textStream.println("Name:                " +
	 * "Filtered Water"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.00);
	 * textStream.println("Calories:            " + 0);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 0);
	 * textStream.println("Sugars:              " + 0);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0);
	 * 
	 * textStream.println("20"); textStream.println("Name:                " +
	 * "Spring Water"); textStream.println("Catagory:            " + "Drink");
	 * textStream.println("Cost:                " + 1.00);
	 * textStream.println("Calories:            " + 0);
	 * textStream.println("Total Fat:           " + 0);
	 * textStream.println("Saturated Fat:       " + 0);
	 * textStream.println("Unsaturated Fat:     " + 0);
	 * textStream.println("Total Carbohydrates: " + 0);
	 * textStream.println("Sugars:              " + 0);
	 * textStream.println("Fiber:               " + 0);
	 * textStream.println("Protien:             " + 0);
	 * textStream.println("Count:               " + 0); textStream.close( ); }
	 */
	public void systemWrite(Vending a) {
		String fileName = "vending.txt";
		PrintWriter textStream = TextFileIO.createTextWrite(fileName);
		textStream.println(a.toFile());
		textStream.close();
	}

	public Dispenser[] systemRead() {
		Dispenser[] dispsys = new Dispenser[20];
		String fileName = "vending.txt";
		Scanner scanFile = TextFileIO.createTextRead(fileName);// scan a file
		while (scanFile.hasNext()) {
			int num = Integer.parseInt(scanFile.nextLine());
			String name = scanFile.nextLine().substring(21);
			String catagory = scanFile.nextLine().substring(21);
			double cost = Double.parseDouble(scanFile.nextLine().substring(21));
			int cal = Integer.parseInt(scanFile.nextLine().substring(21));
			int tfat = Integer.parseInt(scanFile.nextLine().substring(21));
			int sfat = Integer.parseInt(scanFile.nextLine().substring(21));
			int ufat = Integer.parseInt(scanFile.nextLine().substring(21));
			int carb = Integer.parseInt(scanFile.nextLine().substring(21));
			int sug = Integer.parseInt(scanFile.nextLine().substring(21));
			int fiber = Integer.parseInt(scanFile.nextLine().substring(21));
			int protien = Integer.parseInt(scanFile.nextLine().substring(21));
			int count = Integer.parseInt(scanFile.nextLine().substring(21));
			int[] inf = { cal, tfat, sfat, ufat, carb, sug, fiber, protien };
			Item thing = new Item(name, catagory, cost, inf);
			Dispenser disp = new Dispenser(thing, count);
			dispsys[num - 1] = disp;
		}
		scanFile.close();
		return dispsys;

	}

	public static PrintWriter createTextWrite(String S) {
		PrintWriter TStream = null;
		try {
			TStream = new PrintWriter(new FileOutputStream(S));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file in createTextWrite");
			System.exit(0);
		}
		return TStream;
	}

	public static Scanner createTextRead(String S) {
		Scanner textFile = null;
		try {
			textFile = new Scanner(new File(S));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.out.println("or could not be opened.");
		}
		return textFile;
	}

}
