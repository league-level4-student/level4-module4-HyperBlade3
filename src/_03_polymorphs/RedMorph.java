package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{
	
	
	
	RedMorph(int x, int y) {
		super(x, y);
		
	}

	
	public void draw(Graphics g) {
		setWidth(50);
		setHeight(50);
		g.setColor(Color.RED);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}




	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
