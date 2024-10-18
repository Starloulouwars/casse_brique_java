package cassebrique.models;
import java.util.Random;

public class Bonus {

    public static int bonus() {

        Random rand = new Random();
        int bonus = rand.nextInt(10);
        return(bonus);
    }

}
