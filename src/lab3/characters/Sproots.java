package lab3.characters;

import lab3.enums.Adverbs;
import lab3.enums.Names;
import lab3.interfaces.*;
public class Sproots extends Julio implements Decide {

    public Sproots() {
        super("Sproots");
    }

    @Override
    public void decide() {
        System.out.println(this.getWho() + Adverbs.prudently.getAdverb() +" decide give 1 million " );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Sproots obj2 = (Sproots) obj;
        return this.getWho().equals(obj2.getWho()) && this.getWho() != null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getWho() == null) ? 0 : this.getWho().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return (Names.Sproot.getNAME() + ":");
    }
}
