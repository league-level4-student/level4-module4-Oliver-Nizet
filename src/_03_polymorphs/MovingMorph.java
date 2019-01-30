package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	protected int width;
	protected int height;
	boolean d;

	MovingMorph(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}

	public void update() {
		if(x==0 && y==0) {
			d = true;
		}
		if(x==450 && y==450) {
			d = false;
		}
		if(d) {
			x+=3;
			y+=3;
		} else {
			x-=3;
			y-=3;
		}
		
	}

}
