import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class OperatorGUI {
	JFrame frame, passframe;
	JPanel passScreen, screen;
	JButton add, register, enter, close, exit;
	JTextField username;
	JPasswordField password;
	User dilbert, user;
	User[] users;
	boolean authenticated, admin;

	public OperatorGUI(final Connection conn) {
		authenticated = false;
		admin = false;
		final User[] users = { dilbert = new User("dilbert", "P@$$w0rd", true),
				user = new User("user", "password", false) };
		GridLayout a = new GridLayout(2, 1);
		passframe = new JFrame("a");
		passframe.setLayout(a);
		passframe.setTitle("Authenticator");
		passframe.setSize(1200, 300);
		passframe.setVisible(true);
		passframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		passScreen = new JPanel();
		passScreen.add(new JLabel("Username :"));
		username = new JTextField(12);
		passScreen.add(username);
		passScreen.add(new JLabel("Password :"));
		password = new JPasswordField(12);
		passScreen.add(password);
		enter = new JButton("Enter");
		enter.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (int x = 0; x < users.length; x++) {
					if (username.getText().equals(users[x].getUsername())) {
						if (password.getText().equals(users[x].getPassword())) {
							authenticated = true;
							if (users[x].isAdmin()) {
								admin = true;
							}
						}
					}
				}
			}
		});
		passScreen.add(enter);
		exit = new JButton("Close");
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				passframe.removeAll();
				passframe.dispose();

			}

		});
		passframe.add(passScreen);
		passScreen.add(exit);
		passScreen.revalidate();
		passScreen.repaint();

		// passScreen.repaint();
		// passframe.repaint();
	}

	public static void main(String[] args) {
		new OperatorGUI(null);
	}
}
