import java.util.ArrayList;
public class Box {
    public Box() {
        System.out.println("Box créee");
    }

    private ArrayList<String> contents = new ArrayList<String>();
    
    public void add(String truc) {
        this.contents.add(truc);
    }

    public boolean contient(String truc){
        return this.contient(truc);
    }

    public void remove(String truc) throws{
        if(!this.contient(truc)){
            throw new RemoveException();
        }else{
            this.contents.remove(truc);
        }
    }
}
