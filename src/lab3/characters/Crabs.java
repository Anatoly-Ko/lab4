package lab3.characters;
import lab3.enums.Adjective;
import lab3.enums.Adverbs;

import lab3.enums.Names;
import lab3.exception.Sameobject;
import lab3.interfaces.*;
public class Crabs extends Wherecrabsgo implements surprise, Understand{

    public Crabs(){
        super("Crabs");
    }
    public Pool pool = new Pool(Adjective.SWIMMING);
    public Hotel hotel = new Hotel(Adjective.OWN);
    public Theatre theatre = new Theatre(Adjective.NIGHT);
    public Restaurant res = new Restaurant(Adjective.TASTY);
    public static int id = 0;
    {
        id++;
        if (id > 1){
            try {
                throw new Sameobject("There can't be more than 1 Crabs", id);
            }catch(Sameobject ex){
                System.out.println("-----------------------------------------------------------\n" + ex.getMessage());
                System.out.println("Number of objects: " + ex.getValue()+"\n-----------------------------------------------------------");
            }
        }
    }


    @Override
    public void understand() {
        System.out.println(this.getWho() + " understand that " + Sproots.class.getSimpleName() + " can give another million later," + Adverbs.Alright.getAdverb());
    }

    @Override
    public void notsurprise() {
        System.out.println(this.getWho() + " not suprised, " + Adverbs.Notatall.getAdverb());
    }
    public void go(String str) {
        System.out.println(this.getWho() + ", After that, went to his " + str);
    }
    public void Eat(String str) {
        System.out.println("In the evening " + this.getWho() + " had a lunch in the " + str);
    }

}

