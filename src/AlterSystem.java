import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AlterSystem {
	JFrame frame;
	JPanel screen, systemGrid, entry;
	JButton save, close, next, previous;
	JTextField name, catagory, cost, cal, tfat, sfat, ufat, carb, sug, fiber,
			protien;
	String inName, inCatagory;
	double inCost;
	int inCal, inTFat, inSFat, inUFat, inCarb, inSug, inFiber, inProtien;
	Item returning;
	boolean made;
	public Dispenser[] disps;
	int x = 0;

	public AlterSystem(Dispenser[] disp) {
		Dispenser[] disps = disp;
		made = false;
		GridLayout a = new GridLayout(2, 1);
		frame = new JFrame("a");
		frame.setLayout(a);
		frame.setTitle("Item Add System");
		frame.setSize(1100, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		screen = new JPanel();
		screen.setBackground(Color.WHITE);
		screen.add(new JLabel("Name :"));
		name = new JTextField(12);
		name.setText(disps[x].getThing().getName());
		screen.add(name);
		screen.add(new JLabel("Catagory :"));
		catagory = new JTextField(12);
		catagory.setText(disps[x].getThing().getCatagory());
		screen.add(catagory);
		screen.add(new JLabel("Cost :$"));
		cost = new JTextField(12);
		cost.setText(disps[x].getThing().getCost() + "");
		screen.add(cost);
		screen.add(new JLabel("Calories: "));
		cal = new JTextField(12);
		cal.setText(disps[x].getThing().getHealthInf(0) + "");
		screen.add(cal);
		screen.add(new JLabel("Total Fat: "));
		tfat = new JTextField(12);
		tfat.setText(disps[x].getThing().getHealthInf(1) + "");
		screen.add(tfat);
		screen.add(new JLabel("Saturated Fat: "));
		sfat = new JTextField(12);
		sfat.setText(disps[x].getThing().getHealthInf(2) + "");
		screen.add(sfat);
		screen.add(new JLabel("Unsaturated Fat: "));
		ufat = new JTextField(12);
		ufat.setText(disps[x].getThing().getHealthInf(3) + "");
		screen.add(ufat);
		screen.add(new JLabel("Carbohydrates: "));
		carb = new JTextField(12);
		carb.setText(disps[x].getThing().getHealthInf(4) + "");
		screen.add(carb);
		screen.add(new JLabel("Sugar: "));
		sug = new JTextField(12);
		sug.setText(disps[x].getThing().getHealthInf(5) + "");
		screen.add(sug);
		screen.add(new JLabel("Fiber: "));
		fiber = new JTextField(12);
		fiber.setText(disps[x].getThing().getHealthInf(6) + "");
		screen.add(fiber);
		screen.add(new JLabel("Protien: "));
		protien = new JTextField(12);
		protien.setText(disps[x].getThing().getHealthInf(7) + "");
		screen.add(protien);
		frame.add(screen);
		entry = new JPanel();
		entry.setBackground(Color.CYAN);
		save = new JButton("Save");
		save.addActionListener(new ActionListener() {

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
		entry.add(save);
		next = new JButton("next");
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (x < 8) {
					x++;
					entry.revalidate();
					entry.repaint();
				} else {
					JOptionPane q = new JOptionPane("Error-Out of Bounds");
					q.setMessageType(1);
				}
			}
		});
		entry.add(next);
		previous = new JButton("previous");
		previous.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (x > 0) {
					x--;
					entry.revalidate();
					entry.repaint();
				}
			}
		});
		entry.add(previous);
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

	public Dispenser[] dispsReturn() {
		return disps;
	}

	public static void main(String[] args) {
		new AlterSystem(null);

	}
}
