import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Trojkat {

    private PrintWriter write = new PrintWriter("Out.txt");

    public Trojkat() throws FileNotFoundException {
    }


    public void writerClose(){
        write.close();
    }

    public char draw_space(int nSpaces){
        if(nSpaces == 0) {return ' ';}
        write.print(" ");
        return draw_space(nSpaces - 1);
    }

    public char draw_star(int nStar){
        if(nStar == 0){return ' ';}
        write.print("* ");
        return draw_star(nStar - 1);
    }

    public char draw_pattern(int n, int m){
        if(n==0){return ' ';}
        draw_space(n-1);
        draw_star(m-n+1);
        write.println("");
        return draw_pattern(n-1, m);
    }


}
