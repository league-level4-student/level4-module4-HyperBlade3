package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	
	private boolean leftRight = false;
	
	MovingMorph(int x, int y) {
		super(x, y);
		
	}

	@Override
	public void draw(Graphics g) {
		setWidth(50);
		setHeight(50);
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}

	@Override
	public void update() {
		
		
	
		if (getX() > 400) {
			leftRight = true;
			
		}
		else if (getX() < 50) {
			leftRight = false;
		}
		
		if (leftRight == true) {
			setX(getX() - 5);
			
		}
		else if (leftRight == false){
			setX(getX() + 5);
		}
		
		
		
	}

	

}
