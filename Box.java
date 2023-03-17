import java.util.ArrayList;
public class Box {
    public Box() {
    System.out.println("Box créee");
    }

    ArrayList<String> contents = new ArrayList<String>();
    public void add(String truc) {
        this.contents.add(truc);
    }

}
