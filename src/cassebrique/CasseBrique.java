package cassebrique;
import cassebrique.models.Balle;
import cassebrique.models.Brique;
import cassebrique.models.Sprite;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CasseBrique extends Canvas {

    public JFrame fenetre = new JFrame();
    public ArrayList<Balle> listeBalle = new ArrayList<>();
    public ArrayList<Brique> listeBrique = new ArrayList<>();
    public static final int LARGEUR = 500;
    public static final int HAUTEUR = 700;

    public CasseBrique() throws InterruptedException {

        this.fenetre.setSize(LARGEUR, HAUTEUR);
        this.setSize(LARGEUR, HAUTEUR);
        this.setBounds(0,0, LARGEUR, HAUTEUR);

        this.fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panneau = new JPanel();
        panneau.add(this);
        this.fenetre.setContentPane(panneau);

        this.setIgnoreRepaint(true);
        this.setFocusable(false);
        this.fenetre.pack();
        this.fenetre.setResizable(false);
        panneau.setBackground(new Color(255, 255, 255));
        this.fenetre.requestFocus();

        this.fenetre.setVisible(true);
        this.createBufferStrategy(2);

        lancerUnePartie();
    }

    public void lancerUnePartie() throws InterruptedException {

        listeBalle.add(new Balle(10, 5));
        listeBalle.add(new Balle(10, 10));
        listeBalle.add(new Balle(10, 15));
        listeBalle.add(new Balle(10, 20));
        listeBalle.add(new Balle(10, 25));
        listeBalle.add(new Balle(10, 30));

        listeBrique.add(new Brique(20 ,20));

        while(true) {
            Graphics2D dessin = (Graphics2D)this.getBufferStrategy().getDrawGraphics();

            dessin.setColor(new Color(255, 255, 255, 131));
            dessin.fillRect(0,0, LARGEUR, HAUTEUR);

            for(Balle balle : listeBalle) {
                balle.deplacer();
                balle.dessinerOval(dessin);
            }

            for(Brique brique : listeBrique){
                brique.dessinerRect(dessin);
            }



            dessin.dispose();
            this.getBufferStrategy().show();

            Thread.sleep(1000/60);
        }
    }

    //main : raccourci
    public static void main(String[] args) throws InterruptedException {
        new CasseBrique();
    }

}