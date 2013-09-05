import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.*;

public class SystemGUI {
	JFrame frame, frameb;
	JPanel screen, systemGrid, entry, screenb;
	static Item[] drinkOptions;
	static Item[] foodOptions;
	JTextField payAmmount;
	Connection conn;
	JButton d1, d2, d3, d4, d5, d6, dmore;
	JButton e1, e2, e3, e4, e5, e6, emore;
	JButton close, clear;
	int applength1, entlength1 = 0;
	int applength, entlength = 0;
	int reciptCount = 0;
	double totalCost = 0;
	String[] recipt = new String[100];

	public SystemGUI(Dispenser[] disp) {

		getData(disp);

		GridLayout a = new GridLayout(2, 2);
		frame = new JFrame("a");
		frame.setLayout(a);
		frame.setTitle("Food System");
		frame.setSize(1200, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen = new JPanel();
		screen.setBackground(Color.WHITE);
		GridLayout q = new GridLayout(21, 1);
		screen.setLayout(q);
		frame.add(screen);
		screen.revalidate();
		screen.repaint();

		systemGrid = new JPanel();
		systemGrid.setBackground(Color.CYAN);
		GridLayout b = new GridLayout(8, 2);
		systemGrid.setLayout(b);

		systemGrid.add(new JLabel("Drinkss:"));
		systemGrid.add(new JLabel("Food:"));
		e1 = new JButton(drinkOptions[entlength1].getName());
		e2 = new JButton(drinkOptions[entlength1 + 1].getName());
		e3 = new JButton(drinkOptions[entlength1 + 2].getName());
		e4 = new JButton(drinkOptions[entlength1 + 3].getName());
		e5 = new JButton(drinkOptions[entlength1 + 4].getName());
		e6 = new JButton(drinkOptions[entlength1 + 5].getName());
		emore = new JButton("View More");
		emore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if ((drinkOptions.length - (entlength1 + 5)) > 6) {
					applength1 = applength1 + 6;
				} else {
					applength1 = drinkOptions.length - 6;
				}
				e1.setText(drinkOptions[entlength1].getName());
				e2.setText(drinkOptions[entlength1 + 1].getName());
				e3.setText(drinkOptions[entlength1 + 2].getName());
				e4.setText(drinkOptions[entlength1 + 3].getName());
				e5.setText(drinkOptions[entlength1 + 4].getName());
				e6.setText(drinkOptions[entlength1 + 5].getName());
				systemGrid.revalidate();
				systemGrid.repaint();
			}
		});
		d1 = new JButton(foodOptions[applength1].getName());
		d2 = new JButton(foodOptions[applength1 + 1].getName());
		d3 = new JButton(foodOptions[applength1 + 2].getName());
		d4 = new JButton(foodOptions[applength1 + 3].getName());
		d5 = new JButton(foodOptions[applength1 + 4].getName());
		d6 = new JButton(foodOptions[applength1 + 5].getName());
		dmore = new JButton("View More");
		dmore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if ((drinkOptions.length - (entlength1 + 5)) > 6) {
					entlength1 = entlength + 6;
				} else {
					entlength1 = foodOptions.length - 6;
				}
				d1.setText(foodOptions[applength1].getName());
				d2.setText(foodOptions[applength1 + 1].getName());
				d3.setText(foodOptions[applength1 + 2].getName());
				d4.setText(foodOptions[applength1 + 3].getName());
				d5.setText(foodOptions[applength1 + 4].getName());
				d6.setText(foodOptions[applength1 + 5].getName());
				systemGrid.revalidate();
				systemGrid.repaint();
			}
		});

		systemGrid.add(d1);
		d1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(foodOptions[applength1])[0];
				totalCost += Double
						.parseDouble(reciptEntry(foodOptions[applength1])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(e1);
		e1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(drinkOptions[entlength1])[0];
				totalCost += Double
						.parseDouble(reciptEntry(drinkOptions[entlength1])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(d2);
		d2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(foodOptions[applength1 + 1])[0];
				totalCost += Double
						.parseDouble(reciptEntry(foodOptions[applength1 + 1])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(e2);
		e2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(drinkOptions[entlength1 + 1])[0];
				totalCost += Double
						.parseDouble(reciptEntry(drinkOptions[entlength1 + 1])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(d3);
		d3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(foodOptions[applength1 + 2])[0];
				totalCost += Double
						.parseDouble(reciptEntry(foodOptions[applength1 + 2])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(e3);
		e3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(drinkOptions[entlength1 + 2])[0];
				totalCost += Double
						.parseDouble(reciptEntry(drinkOptions[entlength1 + 2])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(d4);
		d4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(foodOptions[applength1 + 3])[0];
				totalCost += Double
						.parseDouble(reciptEntry(foodOptions[applength1 + 3])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(e4);
		e4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(drinkOptions[entlength1 + 3])[0];
				totalCost += Double
						.parseDouble(reciptEntry(drinkOptions[entlength1 + 3])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(d5);
		d5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(foodOptions[applength1 + 4])[0];
				totalCost += Double
						.parseDouble(reciptEntry(foodOptions[applength1 + 4])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(e5);
		e5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(drinkOptions[entlength1 + 4])[0];
				totalCost += Double
						.parseDouble(reciptEntry(drinkOptions[entlength1 + 4])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(d6);
		d6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(foodOptions[applength1 + 5])[0];
				totalCost += Double
						.parseDouble(reciptEntry(foodOptions[applength1 + 5])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(e6);
		e6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String outinf = reciptEntry(drinkOptions[entlength1 + 5])[0];
				totalCost += Double
						.parseDouble(reciptEntry(drinkOptions[entlength1 + 5])[1]);
				screen.add(new JLabel(outinf));
				recipt[reciptCount] = outinf;
				reciptCount++;
				screen.revalidate();
				screen.repaint();
			}

		});
		systemGrid.add(dmore);
		systemGrid.add(emore);
		frame.add(systemGrid);
		// systemGrid.revalidate();
		// systemGrid.repaint();

		entry = new JPanel();
		entry.setBackground(Color.red);
		close = new JButton("Close");
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.removeAll();
				frame.dispose();

			}

		});
		entry.add(close);
		clear = new JButton("Clear Recipt");
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int count = 0; count < reciptCount + 1; count++) {
					recipt[count] = null;
				}
				totalCost = 0;
				screen.removeAll();
				screen.revalidate();
				screen.repaint();

			}

		});
		clear = new JButton("Pay");
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GridLayout a = new GridLayout(1, 1);
				frameb = new JFrame("b");
				frameb.setLayout(a);
				frameb.setTitle("Food System");
				frameb.setSize(1200, 1000);
				frameb.setVisible(true);
				frameb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				screenb = new JPanel();
				screenb.setBackground(Color.WHITE);

				screenb.add(new JLabel("Total Cost: $" + totalCost));
				screenb.add(new JLabel("Imput Payment Value: $"));
				payAmmount = new JTextField(12);
				JButton pay = new JButton("Enter");
				pay.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						if (Double.parseDouble(payAmmount.getText()) >= totalCost) {
							System.out
									.println("Paid In Full, Returning change of: $"
											+ (Double.parseDouble(payAmmount
													.getText()) - totalCost));
							frameb.removeAll();
							frameb.dispose();
						} else {
							System.out
									.println("Error, Imput sufficent funds, or close to selcet diferent objects");
							System.out.println("Returning value of: $"
									+ (Double.parseDouble(payAmmount.getText())));
						}

					}
				});
				screenb.add(payAmmount);
				screenb.add(pay);
				frameb.add(screenb);

			}

		});
		entry.add(clear);
		frame.add(entry);

	}

	public static void getData(Dispenser[] disp) {
		drinkOptions = new Item[6];
		int applength = 0;
		foodOptions = new Item[6];
		int entlength = 0;
		Dispenser[] out = new Dispenser[20];
		for (int y = 0; y < 10; y++) {
			out[y] = null;
		}
		for (int y = 0; y < 20; y++) {
			out[y] = disp[y];
		}
		for (int x = 0; x < 20; x++) {
			if (out != null) {
				String type = "";
				System.out.println("" + out[x].getThing().getCatagory());
				type = out[x].getThing().getCatagory();
				if (type != null) {

					if (type.equalsIgnoreCase("Drink")) {
						if (drinkOptions.length == applength) {
							Item[] temp = new Item[drinkOptions.length + 1];
							for (int z = 0; z < drinkOptions.length; z++) {
								temp[z] = drinkOptions[z];
							}
							drinkOptions = temp;
						}
						drinkOptions[applength] = out[x].getThing();
						applength++;
					} else if ((out[x].getThing().getCatagory())
							.equalsIgnoreCase("Food")) {
						if (foodOptions.length == entlength) {
							Item[] temp = new Item[foodOptions.length + 1];
							for (int z = 0; z < foodOptions.length; z++) {
								temp[z] = foodOptions[z];
							}
							foodOptions = temp;
						}
						foodOptions[entlength] = out[x].getThing();
						entlength++;
					}

				}
			}
		}
		// sort(drinkOptions);
		// sort(foodOptions);
		// sort(beverageOptions);
		// sort(dessertOptions);
	}

	public static void sort(Item[] food) {
		for (int x = 0; x < food.length - 1; x++) {
			if (food[x].getName().compareTo(food[x + 1].getName()) < 0) {
				swap(food[x], food[x + 1]);
				if (x > 2) {
					x -= 2;
				} else if (x > 1) {
					x -= 1;
				}
			}
		}
	}

	private static void swap(Object x, Object y) {
		Object temp = x;
		x = y;
		y = temp;

	}

	public static String[] reciptEntry(Item food) {
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		String output = "";
		output += food.getName() + " : ";
		output += n.format(food.getCost());
		String outcost = "" + food.getCost();
		String[] out = { output, outcost };
		return out;
	}

	public static void main(String[] args) {
		new SystemGUI(null);
	}

}
