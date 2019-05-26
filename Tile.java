package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Tile {
	public static final int WIDTH = 80;
	public static final int HEIGHT = 80;
	public static final int Arc_Width = 20;
	public static final int Arc_Height = 20;
	public static final int Speed = 20;
	
	private int value; 
	private BufferedImage tileImage;
	private Color background;
	private Color text;
	private Font font;
	private int x;
	private int y;
	
	public Tile(int value, int x, int y)
	{
		this.value = value;
		this.x = x;
		this.y = y;
		tileImage = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_ARGB);
		drawImage();
	}
	
	public void drawImage() {
		Graphics2D g = (Graphics2D)tileImage.getGraphics();
		if(value == 2){
			background = new Color (0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 4){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 8){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 16){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 32){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 64){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 128){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 256){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 512){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 1024){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else if (value == 2048){
			background = new Color(0xe9e9e9);
			text = new Color(0x000000);
		}
		else{
			background = Color.BLACK;
			text = Color.WHITE;
		}
		
		g.setColor(new Color(0,0,0,0));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(background);
		g.fillRoundRect(0, 0, WIDTH, HEIGHT, Arc_Width, Arc_Height);
		g.setColor(text);
		
		if(value <= 64){
			font = Game.main.deriveFont(36f);
		}
		else{
			font = Game.main;
		}
		g.setFont(font);
		
			int drawX = WIDTH / 2 - DrawUtils.getMsgWidth(""+value, font, g) / 2;
			int drawY = HEIGHT / 2 + DrawUtils.getMsgHeight(""+value, font, g) / 2;
			g.drawString("" + value, drawX, drawY);
			g.dispose();
	}
}
