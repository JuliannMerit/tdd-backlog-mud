import java.util.ArrayList;
public class Box {
    public Box() {
        System.out.println("Box créee");
    }

    private ArrayList<String> contents = new ArrayList<String>();
    private boolean isOpen = false;
    
    public void add(String truc) {
        this.contents.add(truc);
    }

    public boolean contient(String truc){
        return this.contient(truc);
    }

    public void remove(String truc) throws RemoveException{
        if(!this.contient(truc)){
            throw new RemoveException();
        }else{
            this.contents.remove(truc);
        }
    }

    public boolean isOpen(){
        return this.isOpen;
    }

    public void open(){
        this.isOpen = true;
    }

    public void close(){
        this.isOpen = false;
    }

    public String actionLook(){
        String retour = "";
        if(isOpen){
            retour = "la boite contient: ";
            for(String truc:this.contents){
                retour += truc;
            }
        }else{
            return "la boite est fermee.";
        }
        return retour;
    }
}
