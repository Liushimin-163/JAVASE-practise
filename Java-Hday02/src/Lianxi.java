import java.util.ArrayList;
import java.util.Collections;

public class Lianxi {
    public static void main(String[] args) {
        ArrayList <String> pokerBox= new ArrayList <String>();
        ArrayList <String> colors=new ArrayList <String>();
        ArrayList <String> numbers=new ArrayList<String>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        for(int i=2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        for(String color: colors){
            for(String number: numbers){
                String card=color+number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("小☺");
        pokerBox.add("大☠");
        Collections.shuffle(pokerBox);
        ArrayList <String> player1= new ArrayList <String>();
        ArrayList <String> player2= new ArrayList <String>();
        ArrayList <String> player3= new ArrayList <String>();
        ArrayList <String> diPai= new ArrayList <String>();
        for(int i=0;i<pokerBox.size();i++){
            String card=pokerBox.get(i);
            if(i>=51){
                diPai.add(card);
            }else{
                if(i%3==0){
                    player1.add(card);
                }else if(i%3==1){
                    player2.add(card);
                }else{
                    player3.add(card);
                }
            }
        }
        System.out.println("Tom"+player1);
        System.out.println("Kate"+player2);
        System.out.println("Judy"+player3);
        System.out.println("Dipai"+diPai);
    }
}
