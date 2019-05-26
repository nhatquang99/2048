package src;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		JFrame display = new JFrame("2048 Game");
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setResizable(false);
		display.add(game);
		display.pack();
		display.setLocationRelativeTo(null);
		display.setVisible(true);
		
		game.start();
	}

}
