package cassebrique.models;

import cassebrique.CasseBrique;

import java.awt.*;

public class Barre extends Rectangle {

    protected int vitesse;
    public static int hauteurDefaut = 30;
    public static int largeurDefaut = 200;

    public Barre(int x, int y) {
        super(x, y, largeurDefaut, hauteurDefaut , Color.BLUE);
        this.vitesse = 10;
    }
    public void deplacerBarreD() {
        x += vitesse;
        if (x > CasseBrique.LARGEUR - largeur){
            x = CasseBrique.LARGEUR - largeur;
        }

    }
    public void deplacerBarreG() {
        x -= vitesse;
        if (x < 0){
            x = 0;
        }
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}