import java.awt.Graphics;


public abstract class Entity extends GameObject {

	protected GameLoop game;
	protected float x,y;
	protected int width, height;
	
	public Entity(GameLoop game, float x, float y, int width, int height){
		super(x,y);
		this.game = game;
		this.width = width;
		this.height = height;
	}

	public abstract void tick();
	public abstract void render(Graphics g);

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
