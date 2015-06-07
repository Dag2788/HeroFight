public abstract class Bullet extends Entity {

	
	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 6.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 64,
							DEFAULT_CREATURE_HEIGHT = 64;
	
	
	Controller controller;
	protected int health;
	protected float speed;
	protected float xMove, yMove;
	private int direction;
	
	public Bullet(GameLoop game, float x, float y, int width, int height) {
		super(game, x, y, width, height);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		xMove = x;
		yMove = y;
		this.controller = game.getController();
	}

	public void move(){
		x+= xMove;
		y+= yMove;
	}
	
	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}


}

