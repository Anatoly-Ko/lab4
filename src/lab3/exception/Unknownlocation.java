package lab3.exception;

import lab3.enums.Adjective;

public class Unknownlocation extends Exception {

    private Adjective [] adjective;

    public Unknownlocation(String message, Adjective [] adjective){
        super(message);
        this.adjective = adjective;
    }

    public Adjective [] getAdjective() {
        return adjective;
    }
}