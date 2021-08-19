import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        this.hand.forEach(card -> {
            System.out.println(card);
        });
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator
                        .comparing(Card::getValue)
                        .thenComparing(Card::getSuit);
        
        Collections.sort(hand, comparator);
        
        
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        int thisValue = this.hand.stream().map(card -> card.getValue()).reduce(0, (a, b) -> a + b); //totals value of the hand
        int otherValue = hand.hand.stream().map(card -> card.getValue()).reduce(0, (a, b) -> a + b);

        return thisValue - otherValue;
    }
        
}
