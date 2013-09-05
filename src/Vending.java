import java.awt.Dimension;
import java.util.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.*;

public class Vending {

	JFrame theFrame;
	JPanel panel;
	JButton close, next;
	public Dispenser[] a = new Dispenser[20];
	public int customerNumber;

	public Vending(Dispenser[] b, int num) {
		set(b);
		this.setCustomer(num);
	}

	public void set(Dispenser[] a) {
		this.a = a;
	}

	public Dispenser[] get() {
		return a;
	}

	public void setCustomer(int num) {
		this.customerNumber = num;
	}

	public String toFile() {
		String out = null;
		for (int x = 0; x < a.length; x++) {
			out += x;
			out += a[x].toFile();
		}
		return out;
	}

	public void refill() {
		for (int x = 0; x < a.length; x++) {
			a[x].setCount(20);
		}
	}

	public void display() {
		Calendar cal = Calendar.getInstance();
		theFrame = new JFrame("" + cal.getTime());
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setPreferredSize(new Dimension(600, 300));
		theFrame.pack();
		theFrame.setVisible(true);

		JPanel pane = new JPanel();
		panel = new JPanel();

		theFrame.setLayout(new GridLayout(2, 1));
		pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel label1 = new JLabel("Welcome Customer number: " + customerNumber
				+ " To Vending Machine #" + (int) ((Math.random() * 4) + 1));

		JButton cont = new JButton("Continue");
		cont.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new SystemGUI(a);
			}
		});

		close = new JButton("Close");
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		next = new JButton("next");
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setCustomer(((int) (Math.random() * 10000000) + 1));
				panel.revalidate();
				panel.repaint();
				theFrame.revalidate();
				theFrame.repaint();

			}
		});

		JButton admin = new JButton("Run as Admin");
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame admin = new JFrame("Admin");
				admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				admin.setPreferredSize(new Dimension(600, 300));
				admin.pack();
				admin.setVisible(true);

				JPanel adminPane = new JPanel();

				JButton add = new JButton("Add Item");
				add.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						AddGUI addSys = new AddGUI();
						Item temp = addSys.itemReturning();
						for (int x = 0; x < a.length; x++) {
							if (a[x].equals(null)) {
								a[x].setThing(temp);
								x = 21;
							}
						}
					}
				});
				JButton refill = new JButton("Refill");
				add.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.out.println("System Filled");
						refill();
					}
				});
				adminPane.add(add);
				adminPane.add(refill);
				adminPane.add(close);
				admin.add(adminPane);
			}
		});
		pane.add(label1);
		panel.add(cont);
		panel.add(close);
		panel.add(next);
		panel.add(admin);
		theFrame.add(pane);
		theFrame.add(panel);

	}

}
