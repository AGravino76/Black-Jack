import java.util.ArrayList;
public class Hand {
    private ArrayList<Card> handOfCards = new ArrayList<Card>();

    public void addCard(Card inputCard){
        handOfCards.add(inputCard);
    }

    //gonna use the arraylist size, make a for loop that goes through
    //each of items in the hand list and adds them up
    public int calculateHandValue(){
        int handValue = 0;
        for(int i = 0; i < handOfCards.size(); i++){
            handValue += handOfCards.get(i).getValue();
        }
        return handValue;
    }

    //gonna do a similar thing but now it provides what is in hand
    public StringBuilder cardMessages(){
        StringBuilder message = new StringBuilder();
        for(int i = 0; i < handOfCards.size(); i++){
            message.append(handOfCards.get(i).getFace() + " of " + handOfCards.get(i).getSuit() + "\n");
        }
        return message;
    }

    //used for 
    public int getSize(){
        return handOfCards.size();
    }

    public void removeCards(){
        handOfCards.clear();
    }
}