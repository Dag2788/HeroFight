import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Halo_Bullet extends Bullet {

	BufferedImage bulletL, bulletR;
	private int direction;
	private float x1, y1;
	public Halo_Bullet(GameLoop game, float x, float y, int width, int height) {
		super(game, x, y, width, height);
		bulletL = Assets.bulletL;
		bulletR = Assets.bulletR;
		 this.x1 = x;
		 this.y1 = y+6;
	}

	@Override
	public void tick() {
		if(this.getDirection() == 2)
			x1 += 20;
		else if (this.getDirection() == 1){
			x1 -= 20;
	
		}
		
	}

	@Override
	public void render(Graphics g) {
		if(this.getDirection() == 1)
		g.drawImage(bulletL, (int)x1, (int)y1, null);
		else 
			g.drawImage(bulletR, (int)x1, (int)y1, null);
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

}
