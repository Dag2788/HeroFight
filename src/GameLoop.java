import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.LinkedList;


public class GameLoop implements Runnable {

	private Display display;
	private int width, height;
	public String title;
	private boolean running = false;
	private Controller controller;
	public LinkedList<Creature> creatures;  //game entities A = good guy's bullets
	public LinkedList<Bullet> bullets;
	Player player;
	
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private BufferedImage testImage;
	private SpreedSheet sheet;
	
	//STATES
	private State gameState;
	private State menuState;
	
	//INPUT
	private KeyManager keyManager;
	
	
	//CAMARA
	private GameCamara gameCamara;

	public GameLoop(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	private void init(){
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		//testImage = ImageLoader.loadImage("/textures/halo_sprites.jpg");
		//sheet = new SpreedSheet(testImage);
		Assets.init();
		gameCamara = new GameCamara(this, 0,0);
		gameState = new GameState(this);
		menuState = new MenuState(this);
		State.setState(gameState);
		
	}
	
	private void tick(){
		
		keyManager.tick();
		
		if(State.getState() != null){
			State.getState().tick();
		}
	}

	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//CLEAR SCREEN
		g.clearRect(0, 0, width, height);
		
		//DRAW HERE
		//g.drawImage(sheet.crop(10, 50, 94, 114),5,5,null);
		//g.drawImage(Assets.player1, 100, 100, null);
		if(State.getState() != null){
			State.getState().render(g);
		}
		//END DRAWING
		bs.show();
		g.dispose();
	}

	public void run() {
		
		init();
		int fps = 60;
		double timePerTick = 1000000000/fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		
		while(running){
			
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			lastTime = now;
			
			if (delta >= 1){
				
			
				tick();
				render();
				delta--;
			}
		}
		
		stop();
	}
	
	public KeyManager getKeyManager(){
		return keyManager;
	}

	public GameCamara getGameCamara(){
		return gameCamara;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public synchronized void start(){
		if(running){
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start(); // calls run method
	}
	
	public synchronized void stop(){
		if (running == false){
			return;
		}
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public void setPlayer(Player player1) {
		this.player = player1;
		// TODO Auto-generated method stub
		
	}
	
	public Player getPlayer() {
		return this.player;
		// TODO Auto-generated method stub
		
	}
}
