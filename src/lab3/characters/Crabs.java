package lab3.characters;
import lab3.enums.Adverbs;
import lab3.enums.Names;
import lab3.interfaces.*;
public class Crabs extends Julio implements surprise, Understand{

     public Crabs(){
        super("Crabs");
    }


    @Override
    public void understand() {
        System.out.println(this.getWho() + " understand that " + Sproots.class.getSimpleName() + " can give another million later," + Adverbs.Alright.getAdverb());
    }

    @Override
    public void notsurprise() {
        System.out.println(this.getWho() + " not suprised, " + Adverbs.Notatall.getAdverb());
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Crabs obj2 = (Crabs) obj;
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
        return (Names.Crab.getNAME() + ":");
    }
}

