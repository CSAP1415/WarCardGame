public class Card extends PlayingCard implements Comparable<Card>
{
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  public String toString()
  {
    String suit2 = "";
    String rank2="";
    if(super.getRank()==11)
    {
      rank2="J";
    }
    else if(super.getRank()==12)
    {
      rank2="Q";
    }
    else if(super.getRank()==13)
    {
      rank2="K";
    }
    else if(super.getRank()==1)
    {
      rank2="A";
    }
    else
    {
      rank2=super.getRank()+"";
    }
    if(super.getSuit()==1)
    {
      suit2="H";
    }
    else if(super.getSuit()==2)
    {
      suit2="C";
    }
    else if(super.getSuit()==3)
    {
      suit2="D";
    }
    else if(super.getSuit()==4)
    {
      suit2="S";
    }
    return rank2 + "-" + suit2;
  }
  public int compareTo(Card other)
  {
    return this.getRank()-other.getRank();
  }
}
