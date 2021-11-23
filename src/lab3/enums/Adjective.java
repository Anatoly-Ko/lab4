package lab3.enums;

public enum Adjective {
    TASTY("tasty"),
    SWIMMING("swimming"),
    NIGHT("night"),
    OWN("own"),
    UNKNOWN("unknown");

    private final String value;

    Adjective(String str){
        value = str;
    }

    public String getValueOfAdjective() {
        return value;
    }
}
