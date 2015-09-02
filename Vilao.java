import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
/**
 * Write a description of class Vilao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vilao extends JPanel
{
    private String snake = "Vilao.png";

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private Vilao next;
    private Vilao previous;

    public Vilao() {
        //ImageIcon ii = new ImageIcon("images/"+this.getClass().getResource("head.png"));
        //ImageIcon ii = new ImageIcon(Image.class.getClassLoader().getResource("head.png"));
        ImageIcon ii = new ImageIcon("images/leftVilao.png");
        image = ii.getImage();
        x = 800;
        y = 600;
    }
    
    public void moveX(int _x) {
        x += _x;
    }

    public void moveY(int _y){
        y += _y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setX(int _x){
        x = _x;
    }
    
    public void setY(int _y){
        y = _y;
    }

    public Vilao getNext(){
        return next;
    }

    public void setNext(Vilao _Vilao){
        next = _Vilao;
    }

    public Vilao getPrevious(){
        return previous;
    }

    public void setPrevious(Vilao _Vilao){
        previous = _Vilao;
    }

    public Image getImage() {
        return image;
    }
}