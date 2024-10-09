package cassebrique.models;
import cassebrique.CasseBrique;
import cassebrique.models.Sprite;

import java.awt.*;

public class Balle extends Sprite {
    protected int xSpeed;
    protected int ySpeed;

    public Balle(int xSpeed, int ySpeed) {
        this.x = nombreAleatoire(CasseBrique.LARGEUR - size, size );
        this.y = nombreAleatoire(CasseBrique.HAUTEUR - size, size);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.size = 20;

        //random * a + b   soit a + b = max et b = min

        this.couleurs = new Color(ratioAleatoire(), ratioAleatoire(), ratioAleatoire());
    }
    public void deplacer() {
        x += xSpeed;
        y += ySpeed;

        if (x>= CasseBrique.LARGEUR - size  || x<=0){
            xSpeed = -xSpeed;
        }
        if (y >=CasseBrique.HAUTEUR - size || y <=0){
            ySpeed = -ySpeed;
        }
    }
    public void dessinerOval(Graphics2D dessin){

        dessin.setColor(couleurs);
        dessin.fillOval(x,y, size, size);
    }
}