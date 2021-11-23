package lab3.characters;
import lab3.enums.Adjective;
import lab3.enums.Names;
public abstract class Julio {
    private String who;

    public Julio(String who){
        this.who = who;
    }
    public Julio(){
        this.who = Adjective.UNKNOWN.getValueOfAdjective();
    }

    public String getWho(){
        return who;
    }

    public void setWho(String who){

        this.who = who;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Julio obj2 = (Julio) obj;
        return this.getWho().equals(obj2.getWho()) && this.getWho() != null;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getWho() == null) ? 0: this.getWho().hashCode());
        return result;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", whose name is " +this.getWho();
    }
}