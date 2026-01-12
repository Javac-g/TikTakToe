import java.util.ArrayList;
import java.util.List;

public class Field {
    List<Integer> y1;
    List<Integer> y2;
    List<Integer> y3;

    public Field(){
        y1 = new ArrayList<>(java.util.Collections.nCopies(3, 0));
        y2 = new ArrayList<>(java.util.Collections.nCopies(3, 0));
        y3 = new ArrayList<>(java.util.Collections.nCopies(3, 0));

    }

    public List<Integer> getY1() { return List.copyOf(y1); }
    public List<Integer> getY2() { return List.copyOf(y2); }
    public List<Integer> getY3() { return List.copyOf(y3); }

    public void set(int row, int col ){
       switch (row) {
           case 1 -> y1.set(col, col);
           case 2 -> y2.set(col, col);
           case 3 -> y3.set(col, col);
       }
    }
    public void reset(){
        y1.clear();
        y2.clear();
        y3.clear();
    }






}
