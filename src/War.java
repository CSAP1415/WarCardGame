public class War {
public static void main(String[] args) {
CardDeck cd=new CardDeck();
CardList p1=new CardList();
CardList p2=new CardList();
CardList s1=new CardList();
CardList s2=new CardList();

 cd.Shuffle();
 // deal the cards
 Card c1;
 Card c2;
 for(int count=1; count<=cd.getSize(); count++)
 {
 c1=cd.takeCardFromTop();
 p1.addCardToBottom(c1);
 c2=cd.takeCardFromTop();
 p2.addCardToBottom(c2);
 }
 System.out.println("A --- player --- B");
 Card a;
 Card b;
 int round=1;
 while(p1.getSize()>0 && p2.getSize()>0)
 {
 System.out.println(p1.getSize()+" --- round "+round+" --- "+p2.getSize());
 a=p1.getCard(0);
 p1.takeCardFromTop();
 s1.addCardToTop(a);
 b=p2.getCard(0);
 p2.takeCardFromTop();
 s2.addCardToTop(b);
 System.out.println(a.toString()+" : "+b.toString());
 while(s1.getCard(0).compareTo(s2.getCard(0))==0)
 {
 System.out.println(p1.getSize()+" --- WAR --- "+p2.getSize());
 for (int i=1; i<=4; i++)
 {
 Card c=p1.getCard(0);
 p1.takeCardFromTop();
 s1.addCardToTop(c);
 }
 for (int i=1; i<=4; i++)
 {
 Card c=p2.getCard(0);
 p2.takeCardFromTop();
 s2.addCardToTop(c);
 }
 if(s1.getCard(0).compareTo(s2.getCard(0))>0)
 {
 for(int i=0; i<s1.getSize(); i++)
 {
 p1.addCardToBottom(s1.getCard(i));
 }
 }
 else if(s1.getCard(0).compareTo(s2.getCard(0))<0)
 {
 for(int i=0; i<s1.getSize(); i++)
 {
 p2.addCardToBottom(s2.getCard(i));
 }
 }

 }
 if(s1.getCard(0).compareTo(s2.getCard(0))>0)
 {
 s1.takeCardFromTop();
 s2.takeCardFromTop();
 p1.addCardToBottom(a);
 p1.addCardToBottom(b);
 }
 else if(s1.getCard(0).compareTo(s2.getCard(0))<0)
 {
 s1.takeCardFromTop();
 s2.takeCardFromTop();
 p2.addCardToBottom(a);
 p2.addCardToBottom(b);
 }
 }

 }
}
