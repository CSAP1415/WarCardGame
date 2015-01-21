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
    
    for(int i=0;i<swaps;i++)
    {
      addCardToBottom(removeRandomCard());
    }
  }
}
