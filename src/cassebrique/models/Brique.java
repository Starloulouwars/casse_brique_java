package cassebrique.models;
import cassebrique.CasseBrique;
import cassebrique.models.Sprite;

import java.awt.*;

public class Brique extends Sprite{

    protected int sizex;
    protected int sizey;



    public Brique (int x, int y){
        this.sizex = 100;
        this.sizey = 20;
    }

    public void dessinerRect(Graphics2D dessin){

        dessin.setColor(couleurs);
        dessin.fillRect(x,y, sizex, sizey);
    }

}
