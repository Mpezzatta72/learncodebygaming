import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player  {

    private BufferedImage image;

    private Point pos;

    private int score;

    public Player() {

       loadImage();

    pos = new Point(0,0);
    score = 0;
    
}
    private void loadImage() {
        try{

            image = ImageIO.read(new File("images/player.png"));
    }catch (IOException exc) {
        System.out.println("Error opening image file:" + exc.getMessage());
    }
    }

    public void draw(Graphics g, ImageObserver observer) {

        g.drawImage(
            image,
            pos.x*Board.TILE_SIZE,
            pos.y*Board.TILE_SIZE,
            observer
        );
    }
    
    public void KeyPressed(KeyEvent e) {

        int Key =e.getKeyCode();

        if (Key == KeyEvent.VK_UP) {
            pos.translate(0,-1);
        }
        if (Key == KeyEvent.VK_RIGHT) {
            pos.translate(1,0);
        }
        if (Key == KeyEvent.VK_DOWN) {
            pos.translate(0,1);
        }
        if (Key == KeyEvent.VK_LEFT) {
            pos.translate(-1,0);
        }
    }

    public void tick() {

        if (pos.x < 0) {
            pos.x = 0;
        
        }else if (pos.x >= Board.NUM_COINS) {
         pos.x = Board.NUM_COINS -1;
        }
        if (pos.x <0) {
            pos.x = 0;
        }else if (pos.x >= Board.NUM_COINS) {
            pos.x = Board.NUM_COINS - 1;
        }
        if (pos.y <0) {
            pos.y =0;
        }else if (pos.y >= Board.ROWS) {
            pos.y = Board.ROWS - 1;  
        }
    }
    public String getScore() {
        return String.valueOf(score);
    }
    public void addScore(int amount) {
        score += amount;
    }
    public Point getPos() {
        return pos;
    }
    public void keyPressed(KeyEvent e) {
    }
}    
    