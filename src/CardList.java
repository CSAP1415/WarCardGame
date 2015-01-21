import java.util.*;
public class CardList
{
  private ArrayList<Card> cards=new ArrayList<Card>(52);
  private Random random=new Random();
  public CardList()
  {
    for(int i=1;i<=4;i++)
    {
      for(int x=1;x<=26;x++)
      {
        Card tempCard=new Card(i,x);
        cards.add(tempCard);
      }
    }
  } 
  public int size()
  {
    return cards.size();
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
  
  public Card takeCardFromTop()
  {
    Card temp=cards.get(0);
    cards.remove(0);
    return temp;
  }
  public Card get(int location)
  {
    return cards.get(location);
  }
  public Card removeRandomCard()
  {
    return cards.remove(random.nextInt(cards.size()));
  }
}






