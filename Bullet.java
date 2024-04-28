import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Circle {
	public static final int RADIUS = 3;
	private double rotation;

	public Bullet(Point center, double rotation) {
		super(center, RADIUS); // define RADIUS in Bullet class
		this.rotation = rotation;
	}

	@Override
	public void paint(Graphics brush, Color color) {
		brush.setColor(color);
		brush.fillOval((int) center.x, (int) center.y, RADIUS, RADIUS);
	}

	@Override
	public void move() {
		center.x += 2 * Math.cos(Math.toRadians(rotation));
		center.y += 2 * Math.sin(Math.toRadians(rotation));
	}
	public boolean outOfBounds() {
		boolean outOfBounds = false;
		if ( center.x > Asteroids.SCREEN_WIDTH || 
				center.y > Asteroids.SCREEN_HEIGHT ||
				center.y < 0 ||
				center.x < 0) {
			outOfBounds = true;
		}

			return outOfBounds;
	}

	public Point getCenter() {
		return center;
		
	}



}
