package waveGame;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SlowEnemy extends GameObject{
	private Handler handler;
	public SlowEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		velX = 2;
		velY = 2;
	}
	public Rectangle getBounds(){
		return new Rectangle(x, y, 16, 16);
	}
	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 40) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		handler.addObject(new Trail(x, y, ID.Trail, Color.yellow, 16, 16, 0.03f, handler));
	}
	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, 16, 16);
	}

}

