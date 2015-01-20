// create class CardList

 import java.util.*;
public class CardList
{
 private ArrayList<Card> cards;
 private Random random=new Random();
 public CardList()
 {
 cards=new ArrayList<Card>();
 }
 public int getSize()
 {
 return cards.size();
 }
 public void addCardToBottom(Card card)
 {
 cards.add(card);
 }
 public void addCardToTop(Card card)
 {
 cards.add(0,card);
 }
 public void takeCardFromTop()
 {
 cards.remove(0);
 }
 public Card removeRandomCard()
 {
 int randCardNum=random.nextInt(cards.size());
 cards.remove(cards.get(randCardNum));
 return cards.get(randCardNum);
 }
}

