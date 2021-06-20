package Tompeixun;

public class Test8 {
    public static void main(String[] args) {
        Card card1=new Card("黑桃",'A');
        card1.showCard();
    }

    public static class Card {
        private char number;
        private String color;
        public Card(String color,char number){
            this.number=number;
            this.color=color;

        }


        public void showCard(){
            System.out.println(color+number);

        }
    }
}
