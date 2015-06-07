import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Tile {

	//STATIC :
	
	public static Tile[] tiles = new Tile[256];
	//public static Tile grassTile = new GrassTile(0);
	//public static Tile rockTile = new RockTile(1);
	public static Tile Island_Tile1 = new Island_Tile1(1);
	public static Tile Island_Tile2 = new Island_Tile2(2);
	public static Tile Island_Tile3 = new Island_Tile3(3);
	public static Tile Island_Tile4 = new Island_Tile4(4);
	public static Tile Island_Tile5 = new Island_Tile5(5);
	public static Tile Island_Tile6 = new Island_Tile6(6);
	public static Tile Island_Tile7 = new Island_Tile7(7);
	public static Tile Island_Tile8 = new Island_Tile8(8);
	public static Tile Island_Tile9 = new Island_Tile9(9);
	public static Tile Island_Tile10 = new Island_Tile10(10);
	public static Tile Island_Tile11 = new Island_Tile11(11);
	/*public static Tile Island_Tile12 = new Island_Tile12(14);
	public static Tile Island_Tile13 = new Island_Tile13(15);
	public static Tile Island_Tile14 = new Island_Tile14(16);
	public static Tile Island_Tile15 = new Island_Tile15(17);
	public static Tile Island_Tile16 = new Island_Tile16(18);
	public static Tile Island_Tile17= new Island_Tile17(19);
	public static Tile Island_Tile18 = new Island_Tile18(20);
	public static Tile Island_Tile19 = new Island_Tile19(21);
	public static Tile Island_Tile20 = new Island_Tile20(22);
	public static Tile Island_Tile21 = new Island_Tile21(23);
	public static Tile Island_Tile22 = new Island_Tile22(24);
	public static Tile Island_Tile23 = new Island_Tile23(25);
	public static Tile Island_Tile24 = new Island_Tile24(26);
	public static Tile Island_Tile25 = new Island_Tile25(27);
	public static Tile Island_Tile26 = new Island_Tile26(28);
	public static Tile Island_Tile27 = new Island_Tile27(29);
	public static Tile Island_Tile28 = new Island_Tile28(30);*/
	public static Tile Sky_Tile = new Sky_Tile(31);
	
	
	//CLASS
	public static final int TILEWIDTH =920, TILEHEIGHT = 1125;
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}

	
	public void tick(){
		
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture,  x, y, null);
	}
	
	
	public boolean isSolid(){
		return false;
	}
	
	public int getID(){
		return id;
	}
}
