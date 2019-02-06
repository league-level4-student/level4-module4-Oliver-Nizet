package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BlueMorph extends Polymorph{
	protected int width;
	protected int height;
	
	BlueMorph(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}
	
}
