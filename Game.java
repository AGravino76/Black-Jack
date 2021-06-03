import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        System.out.println("***********************************");
        System.out.println("* Welcome to the Black Jack Table *");
        System.out.println("***********************************");

        Deck d = new Deck();
        String restart;
        String hitting;

        //Stops dealer and player from drawing the same fourth card as the third
        int failSafeD = 0;
        int failSafeM = 0;

        //game statistics
        double playerWins = 0;
        double dealerWins = 0;


        Hand dealerHand = new Hand();
        Hand myHand = new Hand();

        Scanner keyboard = new Scanner(System.in);

        do{
            d.shuffle();

            myHand.addCard(d.drawCard(0));
            myHand.addCard(d.drawCard(1));
            dealerHand.addCard(d.drawCard(2));
            dealerHand.addCard(d.drawCard(3));

            //initial message
            System.out.println("Your hand is: \n" + myHand.cardMessages() + "<" + myHand.calculateHandValue() + " points>");

            //ask player if they want to hit
            System.out.println("Do you want to stand or hit? (stand/hit)");
            hitting = keyboard.nextLine();

            //going from there, hitting
            while(hitting.equalsIgnoreCase("hit")){
                failSafeM++;
                myHand.addCard(d.drawCard(4+failSafeM));
                System.out.println("\nYour hand is: \n" + myHand.cardMessages()
                + "<" + myHand.calculateHandValue() + " points>");
                //you got greedy
                if(myHand.calculateHandValue() > 21){
                    System.out.println("Bust! \n \nThe dealer wins!");
                    dealerWins++;
                    break;
                }
                //saying stand ends the while
                if(myHand.calculateHandValue() <= 21){
                    System.out.println("Do you want to stand or hit? (stand/hit)");
                    hitting = keyboard.nextLine();
                }
            }

            //standing
            if(hitting.equalsIgnoreCase("stand")){
                System.out.println("\nThe dealer's hand is: \n" + dealerHand.cardMessages() + "<" + dealerHand.calculateHandValue() + " points>");
                //unlucky right away
                if(dealerHand.calculateHandValue() > myHand.calculateHandValue() && dealerHand.calculateHandValue() != 21){
                    System.out.println("\nThe dealer wins!");
                    dealerWins++;
                }
                if(dealerHand.calculateHandValue() == 21){
                    System.out.println("\nThe dealer wins with a Blackjack!");
                    dealerWins++;
                }
                //lucky right away, bonus 2
                if(dealerHand.getSize() > 2 && (myHand.calculateHandValue() == 21 && myHand.getSize() == 2)){
                    System.out.println("Hooray, you win with a Blackjack!");
                    playerWins++;
                }
                while(dealerHand.calculateHandValue() <= myHand.calculateHandValue()){
                    System.out.println("\nThe dealer draws a card...\n");
                    failSafeD++; 
                    //20 is a high enough number so that the cards don't overlap between player and dealer
                    dealerHand.addCard(d.drawCard(20+failSafeD));
                    System.out.println("The dealer's hand is: \n" + dealerHand.cardMessages() + "<" + dealerHand.calculateHandValue() + " points>");
                    //you get lucky
                    if(dealerHand.calculateHandValue() > 21){
                        System.out.println("Bust! \n \nHooray, you win!");
                        playerWins++;
                        break;
                    }
                    //the dealer got lucky
                    if(dealerHand.calculateHandValue() < 21 && dealerHand.calculateHandValue() > myHand.calculateHandValue()){
                        System.out.println("\nThe dealer wins!");
                        dealerWins++;
                        break;
                    }
                    //the dealer got extra lucky
                    if(dealerHand.calculateHandValue() == 21){
                        System.out.println("\nThe dealer wins with a Blackjack!");
                        dealerWins++;
                        break;
                    }
                }
            }

            //bonus 1

            if(playerWins == 0){
                System.out.println("\nPlayer Win Percentage: 0%");
            }
            else{
                System.out.println("\nPlayer Win Percentage: " + ((playerWins*100)/(playerWins + dealerWins) + "%"));
            }
            System.out.println("\nDo you want to play again? (yes/no)");
            restart = keyboard.nextLine();
            if(restart.equalsIgnoreCase("yes")){
                myHand.removeCards();
                dealerHand.removeCards();
            }
            if(restart.equalsIgnoreCase("no")){
                System.out.println("Bye Bye");
                System.exit(0);
            }
        }while (true);
    }
}