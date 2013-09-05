public class VendingDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if ((int) (Math.random() * 10000000) + 1 > 5000000) {
			TextFileIO io = new TextFileIO();
			Dispenser[] b = io.systemRead();
			Vending vend = new Vending(b,
					((int) (Math.random() * 10000000) + 1));
			vend.display();
		} else {
			System.out.println("System is down");
			System.exit(0);
		}
	}

}
