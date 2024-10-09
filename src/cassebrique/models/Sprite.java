package cassebrique.models;

import java.awt.*;

public class Sprite{

    protected int x;
    protected int y;
    protected Color couleurs = Color.RED;
    protected int size;

    protected float ratioAleatoire(){
        return (float)Math.random() * 0.6f + 0.1f;
    }
    protected float ratioAleatoire(float max, float min){
        return (float)Math.random() * max + min;
    }
    protected int nombreAleatoire(){
        return (int) (Math.random() * 300 + 200);
    }
    protected int nombreAleatoire(int max, int min){
        return (int) (Math.random() * max + min);
    }
}

