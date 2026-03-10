package Zbirke.collectionsMethods.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] codeArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(codeArray,aceOfHearts);
        Card.printDeck(Arrays.asList(codeArray),"Ace of hearts",1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards,aceOfHearts); // ne radi ništa ako je lista prazna inače bi prepisala to kaj je untar liste
        System.out.println(cards);
        System.out.println("card.size() = " + cards.size());

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB,'K');
        List<Card> kingsOfClubs = Collections.nCopies(13,kingOfClubs); // n.Copies() radi točno ono što smo priželjkival iod Collections.fill()
        System.out.println(kingsOfClubs);

    }

}
