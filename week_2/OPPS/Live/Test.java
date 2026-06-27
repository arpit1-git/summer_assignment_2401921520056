package week_2.OOPS.Live;
import week_2.OOPS.Music.Playable;
import week_2.OOPS.Music.String.Veena;
import week_2.OOPS.Music.Wind.Saxophone;
public class Test {
     public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
