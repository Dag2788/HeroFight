import java.awt.Graphics;
import java.util.LinkedList;


public class GameState extends State{

	private Player player1;
	private World world;
	private Batman batman;
	private Controller controller;
	public LinkedList<Creature> creatures;  //game entities A = good guy's bullets
	public LinkedList<Bullet> bullets;
	public GameState(GameLoop game){
		super(game);
		player1 = new Player(game, 500, 500);
		world = new World(game, "res/worlds/world1.txt");
		controller = new Controller(game);
		game.setController(controller);
		batman = new Batman(game, 600, 600);
		creatures = controller.getE();
		bullets = controller.getB();
		creatures.add(player1);
		creatures.add(batman);
		game.setPlayer(player1);
		
	}
	
	public void tick() {
		world.tick();
		player1.tick();
		controller.tick();
		batman.tick();
		
	}

	
	public void render(Graphics g) {
		world.render(g);
		player1.render(g);
		controller.render(g);
		batman.render(g);
		//Tile.tiles[0].render(g, 0, 0);
		//Tile.tiles[1].render(g, 200, 200);
	}

	

}
