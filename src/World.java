import java.awt.Graphics;


public class World {

	private GameLoop game;
	private int width, height;
	private int[][] tiles;
	private int spawnx, spawny;
	
	
	public World(GameLoop game, String path){
		this.game = game;
		loadWorld(path);
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		//TO RENDER THE WORLD 
		int xStart = (int) Math.max(0, game.getGameCamara().getxOffset()/ Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (game.getGameCamara().getxOffset()+ game.getWidth())/Tile.TILEWIDTH +1);
		int yStart = (int) Math.max(0, game.getGameCamara().getyOffset()/ Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(width, (game.getGameCamara().getyOffset()+ game.getHeight())/Tile.TILEHEIGHT +1);
		
		
		for(int y = yStart; y< yEnd; y++){
			for(int x = xStart; x < xEnd; x++){
				getTile(x,y).render(g, (int)(x* Tile.TILEWIDTH -game.getGameCamara().getxOffset()),
						(int)(y*Tile.TILEHEIGHT- game.getGameCamara().getyOffset()));

			}
		}
	}
	
	public Tile getTile(int x, int y){
		Tile t = Tile.tiles[tiles[x][y]];
		if( t == null)
			return Tile.Island_Tile1;
		return t;
	}
	
	private void loadWorld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnx = Utils.parseInt(tokens[2]);
		spawny = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y< height; y++){
			for (int x =0; x<width; x++){
				tiles[x][y] = Utils.parseInt(tokens[(x+y*width)+ 4]);
			}
		}
	}

}
