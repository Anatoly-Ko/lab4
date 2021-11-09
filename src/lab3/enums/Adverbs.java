package lab3.enums;

public enum Adverbs {
    Notatall("not at all"),
    Alright(" it's alright"),
    prudently(" prudently");
    private String adverb;

    Adverbs(String str){
        adverb = str;
    }

    public String getAdverb() {
        return adverb;
    }
}