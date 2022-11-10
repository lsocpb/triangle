import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Trojkat t = new Trojkat();

        t.draw_pattern(5, 5);
        t.writerClose();
    }
}