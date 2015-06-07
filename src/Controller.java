import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;


public class Controller {

	private LinkedList<Creature> e = new LinkedList<Creature>();
	private LinkedList<Bullet> b = new LinkedList<Bullet>();
	
	Random r = new Random();
	
	GameLoop game;
	Creature ent;
	Bullet entB;


	
	public Controller(GameLoop game){
		this.game = game;
		
		
	}
	
	public void tick(){
		//A class
		for (int i =0; i<e.size(); i++){
			ent = e.get(i);
			
		if(ent.getX() >= 1500)
			removeEntity(ent);
		if(ent.getY() < -10)
			removeEntity(ent);
		if(ent.getX() < -10)
			removeEntity(ent);
		
		 ent.tick();
		}
		//B CLASS
		for (int i =0; i<b.size(); i++){
			entB = b.get(i);
			
		if(entB.getX() >= 1500)
			removeEntity(entB);
		if(entB.getY() < -100)
			removeEntity(entB);
		if(entB.getX() < -100)
			removeEntity(entB);
		
		 entB.tick();
		}
		
		
		
		
	}
	
	public void render(Graphics g){
		//A CLASS
		for (int i =0; i<e.size(); i++){
			ent = e.get(i);
			ent.render(g);
		}
		// B CLASS
		for (int i =0; i<b.size(); i++){
			entB = b.get(i);
			entB.render(g);
		}
	
	
	}
	
	

	
	public void addEntity (Creature block){
		e.add(block);
	}
	
	public void removeEntity(Creature block){
	    e.remove(block);
	}
	
	public void addEntity (Bullet block){
		b.add(block);
	
	}
	
	public void removeEntity(Bullet block){
	    b.remove(block);
	
	}
	

	
	
	
	

	public Creature getEnt() {
		return ent;
	}

	public void setEnt(Creature ent) {
		this.ent = ent;
	}

	public Bullet getEntB() {
		return entB;
	}

	public void setEntB(Bullet entB) {
		this.entB = entB;
	}

	

	public LinkedList<Creature> getE() {
		return e;
	}

	public void setE(LinkedList<Creature> e) {
		this.e = e;
	}

	public LinkedList<Bullet> getB() {
		return b;
	}

	public void setB(LinkedList<Bullet> b) {
		this.b = b;
	}

	

/*	public void addEnemy_count (int enemy_count){
		
		for (int i =0; i<enemy_count; i++){
			addEntity(new Enemy(r.nextInt(1200), r.nextInt(700), tex, game));
		}
	}
	*/
	
}
