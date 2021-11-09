package lab3;

import lab3.characters.Crabs;
import lab3.characters.Sproots;

public class Main {

    public static void main(String[] args) {
        Crabs crabs = new Crabs();
        Sproots sproots = new Sproots();
        System.out.println(sproots.toString());
        sproots.decide();
        System.out.println(crabs.toString());
        crabs.notsurprise();
        crabs.understand();

    }
}
