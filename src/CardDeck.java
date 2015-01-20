// create class CardDeck that extends 
public class CardDeck extends CardList
{
 private int suits;
 private int ranks;
 private int swaps=10000;

 public CardDeck()
 {
 Card temp;
 for(int suit=1; suit<=suits; suit++)
 {
 for(int rank=1; rank<=ranks; ranks++)
 {
 temp=new Card(suit, rank);
 this.addCardToBottom(temp);
 }
 }
 }
public void Shuffle()
{
 
for(int count=0; count<10000; count++)
{
 Card card=removeRandomCard();
 addCardToTop(card);
 Card card2=removeRandomCard();
 addCardToBottom(card2);
 card=this.removeRandomCard();
 this.addCardToBottom(card);
}
}
}
