import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyManager implements KeyListener {
	
	private boolean[] keys;
	public boolean up,down,left,right,shoot;
	
	public KeyManager(){
		keys = new boolean[256];
	}
	
	public void tick(){
		up = keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_DOWN];
		right = keys[KeyEvent.VK_RIGHT];
		left = keys[KeyEvent.VK_LEFT];
		shoot = keys[KeyEvent.VK_SPACE];
	}
	
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		//System.out.println("pressed");
	}

	
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}


	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



}
