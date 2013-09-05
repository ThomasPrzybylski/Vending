import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.*;

public class AddGUI {
	JFrame frame;
	JPanel screen, systemGrid, entry;
	JButton add, close;
	JTextField name, catagory, cost, cal, tfat, sfat, ufat, carb, sug, fiber,
			protien;
	String inName, inCatagory;
	double inCost;
	int inCal, inTFat, inSFat, inUFat, inCarb, inSug, inFiber, inProtien;
	Item returning;
	boolean made;

	public AddGUI() {
		made = false;
		GridLayout a = new GridLayout(2, 1);
		frame = new JFrame("a");
		frame.setLayout(a);
		frame.setTitle("Item Add System");
		frame.setSize(1100, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		screen = new JPanel();
		screen.setBackground(Color.WHITE);
		screen.add(new JLabel("Name :"));
		name = new JTextField(12);
		screen.add(name);
		screen.add(new JLabel("Catagory :"));
		catagory = new JTextField(12);
		screen.add(catagory);
		screen.add(new JLabel("Cost :$"));
		cost = new JTextField(12);
		screen.add(cost);
		screen.add(new JLabel("Calories: "));
		cal = new JTextField(12);
		screen.add(cal);
		screen.add(new JLabel("Total Fat: "));
		tfat = new JTextField(12);
		screen.add(tfat);
		screen.add(new JLabel("Saturated Fat: "));
		sfat = new JTextField(12);
		screen.add(sfat);
		screen.add(new JLabel("Unsaturated Fat: "));
		ufat = new JTextField(12);
		screen.add(ufat);
		screen.add(new JLabel("Carbohydrates: "));
		carb = new JTextField(12);
		screen.add(carb);
		screen.add(new JLabel("Sugar: "));
		sug = new JTextField(12);
		screen.add(sug);
		screen.add(new JLabel("Fiber: "));
		fiber = new JTextField(12);
		screen.add(fiber);
		screen.add(new JLabel("Protien: "));
		protien = new JTextField(12);
		screen.add(protien);
		frame.add(screen);
		entry = new JPanel();
		entry.setBackground(Color.CYAN);
		add = new JButton("add");
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				inName = name.getText();
				inCatagory = catagory.getText();
				inCost = (Double.parseDouble(cost.getText()));
				inCal = (Integer.parseInt(cal.getText()));
				inTFat = (Integer.parseInt(tfat.getText()));
				inSFat = (Integer.parseInt(sfat.getText()));
				inUFat = (Integer.parseInt(ufat.getText()));
				inCarb = (Integer.parseInt(carb.getText()));
				inSug = (Integer.parseInt(sug.getText()));
				inFiber = (Integer.parseInt(fiber.getText()));
				inProtien = (Integer.parseInt(protien.getText()));
				int[] inHealthInf = { inCal, inTFat, inSFat, inUFat, inCarb,
						inSug, inFiber, inProtien };
				returning = new Item(inName, inCatagory, inCost, inHealthInf);
				made = true;
			}
		});
		entry.add(add);
		close = new JButton("Close");
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.removeAll();
				frame.dispose();

			}

		});
		entry.add(close);
		frame.add(entry);
		entry.revalidate();
		entry.repaint();
		// return null;

	}

	public Item itemReturning() {
		return returning;
	}

	public static void main(String[] args) {
		new AddGUI();

	}
}
