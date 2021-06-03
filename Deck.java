import java.util.Arrays;
import java.util.Collections;
public class Deck {
    private Card[] deckOfCards = new Card[52];

    //pain
    public Deck(){
        deckOfCards[0] = new Card("Two", "Spades", 2);
        deckOfCards[1] = new Card("Three", "Spades", 3);
        deckOfCards[2] = new Card("Four", "Spades", 4);
        deckOfCards[3] = new Card("Five", "Spades", 5);
        deckOfCards[4] = new Card("Six", "Spades", 6);
        deckOfCards[5] = new Card("Seven", "Spades", 7);
        deckOfCards[6] = new Card("Eight", "Spades", 8);
        deckOfCards[7] = new Card("Nine", "Spades", 9);
        deckOfCards[8] = new Card("Ten", "Spades", 10);
        deckOfCards[9] = new Card("Jack", "Spades", 10);
        deckOfCards[10] = new Card("Queen", "Spades", 10);
        deckOfCards[11] = new Card("King", "Spades", 10);
        deckOfCards[12] = new Card("Ace", "Spades", 11);
        deckOfCards[13] = new Card("Two", "Hearts", 2);
        deckOfCards[14] = new Card("Three", "Hearts", 3);
        deckOfCards[15] = new Card("Four", "Hearts", 4);
        deckOfCards[16] = new Card("Five", "Hearts", 5);
        deckOfCards[17] = new Card("Six", "Hearts", 6);
        deckOfCards[18] = new Card("Seven", "Hearts", 7);
        deckOfCards[19] = new Card("Eight", "Hearts", 8);
        deckOfCards[20] = new Card("Nine", "Hearts", 9);
        deckOfCards[21] = new Card("Ten", "Hearts", 10);
        deckOfCards[22] = new Card("Jack", "Hearts", 10);
        deckOfCards[23] = new Card("Queen", "Hearts", 10);
        deckOfCards[24] = new Card("King", "Hearts", 10);
        deckOfCards[25] = new Card("Ace", "Hearts", 11);
        deckOfCards[26] = new Card("Two", "Diamonds", 2);
        deckOfCards[27] = new Card("Three", "Diamonds", 3);
        deckOfCards[28] = new Card("Four", "Diamonds", 4);
        deckOfCards[29] = new Card("Five", "Diamonds", 5);
        deckOfCards[30] = new Card("Six", "Diamonds", 6);
        deckOfCards[31] = new Card("Seven", "Diamonds", 7);
        deckOfCards[32] = new Card("Eight", "Diamonds", 8);
        deckOfCards[33] = new Card("Nine", "Diamonds", 9);
        deckOfCards[34] = new Card("Ten", "Diamonds", 10);
        deckOfCards[35] = new Card("Jack", "Diamonds", 10);
        deckOfCards[36] = new Card("Queen", "Diamonds", 10);
        deckOfCards[37] = new Card("King", "Diamonds", 10);
        deckOfCards[38] = new Card("Ace", "Diamonds", 11);
        deckOfCards[39] = new Card("Two", "Clubs", 2);
        deckOfCards[40] = new Card("Three", "Clubs", 3);
        deckOfCards[41] = new Card("Four", "Clubs", 4);
        deckOfCards[42] = new Card("Five", "Clubs", 5);
        deckOfCards[43] = new Card("Six", "Clubs", 6);
        deckOfCards[44] = new Card("Seven", "Clubs", 7);
        deckOfCards[45] = new Card("Eight", "Clubs", 8);
        deckOfCards[46] = new Card("Nine", "Clubs", 9);
        deckOfCards[47] = new Card("Ten", "Clubs", 10);
        deckOfCards[48] = new Card("Jack", "Clubs", 10);
        deckOfCards[49] = new Card("Queen", "Clubs", 10);
        deckOfCards[50] = new Card("King", "Clubs", 10);
        deckOfCards[51] = new Card("Ace", "Clubs", 11);
    }

    public Card drawCard(int specific){
        return deckOfCards[specific];
    }

    public void shuffle(){
        Collections.shuffle(Arrays.asList(deckOfCards));
    }
}