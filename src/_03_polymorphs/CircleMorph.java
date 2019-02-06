package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	protected int width;
	protected int height;
	boolean d;
	double angle;
	
	CircleMorph(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, width, height);
	}

	public void update() {
		double radius = 100.0;
		angle += 0.1;
		x = (int) (Math.cos(angle)*radius) + 225;
		y = (int) (Math.sin(angle)*radius) + 225;
	}

}
