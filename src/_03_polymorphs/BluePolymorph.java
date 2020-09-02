package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	
	
	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		setWidth(50);
		setHeight(50);
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}


	@Override
	public void update() {
		
		
	}
	
}
