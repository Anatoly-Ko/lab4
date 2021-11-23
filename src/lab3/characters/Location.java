package lab3.characters;

import lab3.enums.Adjective;
import lab3.exception.Unknownlocation;

import java.util.Arrays;

public abstract class Location {
    private final Adjective [] typeOfLocation;
    private final String location;

    public Location(String location, Adjective ... adj) {
        this.location = location;

        typeOfLocation = new Adjective[adj.length];

        for (int i = 0; i < adj.length; i++) {
            typeOfLocation[i] = adj[i];
        }

        if(typeOfLocation.length > 1){
            try{
                for (Adjective a : typeOfLocation){
                    if (a == Adjective.UNKNOWN) throw new Unknownlocation("\"Unknown\" adjective when others when there are other ones", typeOfLocation);
                }
            }catch(Unknownlocation ex){
                System.out.println(ex.getMessage());
                for (int i = 0; i < ex.getAdjective().length; i++){
                    System.out.println(ex.getAdjective()[i]);
                }
            }
        }
    }
    public Location(String location){
        typeOfLocation = new Adjective[1];
        typeOfLocation[0] = Adjective.UNKNOWN;

        this.location = location;
    }

    public Adjective[] getTypeOfLocation(){
        return typeOfLocation;
    }

    public String getTypeOfLocationAsString(){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < getTypeOfLocation().length; i++){
            sb.append(typeOfLocation[i].getValueOfAdjective());
            if (i < this.getTypeOfLocation().length - 1){
                sb.append(", ");
            }
        }
        return sb.toString() + " "+ this.getLocation();
    }

    private String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Location obj2 = (Location) obj;
        return Arrays.equals(this.getTypeOfLocation(), obj2.getTypeOfLocation()) && this.getTypeOfLocation() != null;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getTypeOfLocation() == null) ? 0: Arrays.hashCode(this.getTypeOfLocation())) + this.getClass().hashCode()*(13);
        return result;
    }
    @Override
    public String toString() {
        return (this.getLocation() + " -> type of location: " + Arrays.toString(this.getTypeOfLocation()));
    }
}
