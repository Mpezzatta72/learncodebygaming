  import java.awt.Graphics;  
  import java.awt.image.BufferedImage;
  import java.awt.image.ImageObserver;
  import java.awt.Point;
  import java.io.File;   
  import java.io.IOException;
  import javax.imageio.ImageIO;

  public class void coin {
    
    private BufferedImage image;
    
    private Point pos;
    
    public Coin(int x, int y) {
       
           loadImage();
        
        pos = new Point(x, y);
    } 
  
    private void loadImage() {
      try {
          image = ImageIO.read(new File("image/coin.png"));
      } catch (IOException exc) {
          System.out.println("Error opening image file: " + exc.getMessage());
      }
    }

     public void draw(Graphics g, ImageObserver observer) {

     g.drawImage(
      image,
      pos.x * Board.TILE_SIZE,
      pos.y * Board.TILE_SIZE,
      observer  
    );
  }

  public Point getPos() {  
      return pos;
  }

}  
