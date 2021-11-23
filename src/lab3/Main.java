package lab3;
import lab3.characters.*;
import lab3.interfaces.*;
import lab3.enums.*;
import lab3.characters.Crabs;
import lab3.characters.Sproots;

public class Main {

    public static void main(String[] args) {
        Crabs crabs = new Crabs();
        //Crabs crabs2 = new Crabs();
        Sproots sproots = new Sproots();
        //Sproots sproots2 = new Sproots();
        System.out.println(sproots.toString());
        sproots.decide();
        System.out.println(crabs.toString());
        crabs.notsurprise();
        crabs.understand();
        crabs.go(crabs.hotel.getTypeOfLocationAsString() + ", and visited " + crabs.pool.getTypeOfLocationAsString());
        crabs.Eat(crabs.res.getTypeOfLocationAsString() + ", and later came to the " + crabs.theatre.getTypeOfLocationAsString());
    }
}
