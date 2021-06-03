public class Card {
    private String face;
    private String suit;
    private int value;

    //standard constructor
    public Card(String f, String s, int v){
        face = f;
        suit = s;
        value = v;
    }

    //standard object getters
    public String getFace(){
        return face;
    }

    public String getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

}