import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<Integer,String> cards=new HashMap<>();
        ArrayList<String> colors=new ArrayList<String>();
        ArrayList<String> numbers=new ArrayList<>();
        Collections.addAll(colors, "♦","♣","♥","♠");
        Collections.addAll(numbers,"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4",
                "3");
        cards.put(1,"大王");
        cards.put(2,"小王");
        int count=3;
        for(String n:numbers){
            for(String c:colors){
                String card=c+n;
                cards.put(count++,card);
            }
        }
        Set<Integer> cardSet=cards.keySet();
        ArrayList<Integer> cardList=new ArrayList<>(cardSet);
        Collections.shuffle(cardList);
        ArrayList<Integer> player1=new ArrayList<>();
        ArrayList<Integer> player2=new ArrayList<>();
        ArrayList<Integer> player3=new ArrayList<>();
        ArrayList<Integer> diPai=new ArrayList<>();
        for(int i=0;i<cardList.size();i++){
            Integer num=cardList.get(i);
            if(i>=51){
                diPai.add(num);
            }else if(i%3==0){
                player1.add(num);
            }else if(i%3==1){
                player2.add(num);
            }else{
                player3.add(num);
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);
        ArrayList<String> p1card=new ArrayList<>();
        ArrayList<String> p2card=new ArrayList<>();
        ArrayList<String> p3card=new ArrayList<>();
        ArrayList<String> daPaiCard=new ArrayList<>();
        for(Integer i:player1){
            String c=cards.get(i);
            p1card.add(c);
        }
        for(Integer i:player2){
            String c=cards.get(i);
            p2card.add(c);
        }
        for(Integer i:player3){
            String c=cards.get(i);
            p3card.add(c);
        }
        for(Integer i:diPai){
            String c=cards.get(i);
            daPaiCard.add(c);
        }
        System.out.println(p1card);
        System.out.println(p2card);
        System.out.println(p3card);
        System.out.println(daPaiCard);
    }
}
