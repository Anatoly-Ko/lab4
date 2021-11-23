package lab3.exception;

public class Sameobject extends RuntimeException{
    private int value;

    public Sameobject(String message, int val){
        super(message);
        value = val;
    }

    public int getValue(){
        return value;
    }
}