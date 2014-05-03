import javax.swing.JFrame;

import Console.Console;


public class runner {

	public static void main(String[] args) {
		final Console console = new Console();
		JFrame jf = new JFrame("Game attempt");
		jf.setSize(250,351);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		console.out("Starting this....");
		
		jf.setVisible(true);

	}

}
