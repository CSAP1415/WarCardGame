// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard implements Comparable<Card>
{
 public Card(int suit, int rank)
 {
 super(suit, rank);
 }
 public String toString()
 {
 return this.getRank()+" of "+this.getSuit();
 }
 public int compareTo(Card other)
 {
 return this.getRank()-other.getRank();
 }
}
