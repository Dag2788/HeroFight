import java.awt.image.BufferedImage;


public class SpreedSheet {

	private BufferedImage sheet;
	
	public SpreedSheet(BufferedImage sheet){
		this.sheet = sheet;
	}

	public BufferedImage crop(int x, int y, int width, int height){
		return sheet.getSubimage(x, y, width, height);
	}
}
