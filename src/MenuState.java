import java.awt.Graphics;


public class MenuState extends State{

	public MenuState(GameLoop game){
		super(game);
	}
	
	public void tick() {
		
		
	}

	
	public void render(Graphics g) {
		g.drawImage(Assets.player1, 10, 10, null);
		
	}

	

}
