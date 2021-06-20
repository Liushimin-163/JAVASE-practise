public class Demo02 {
    public static void main(String[] args) {
        boolean isHungry=true;//false ����
        boolean isThirsty=true;//����
        //�жϱ��ʽ
        //if(isHungry==true){
        if(isHungry){
            System.out.println("�Ҷ��ˣ���Ҫ�Է���");
        }
        if(isThirsty){
            System.out.println("�ҿ��ˣ��Һ�ˮ");

        }
//print whichday?Given a number 1,print Mon. Given 2,print Tue~~.if num out of [1,7],print None.
        int day=0;
        switch(day){
            case 1:
                System.out.println("Today is Mon");
                break;
            case 2:
                System.out.println("Today is Tue");
                break;
            default:
                System.out.println("invalid Num");
                break;
        }
        //int sum=0;
        //for(int i=0; i<=100;i++){
            //take meal,i<3 will judge whether execute(true) the iteration.if out of range,break
            //if(i%2==0){
               // sum=sum+i;//sedection add
                //System.out.println(sum);
           // }
           //do(){logic of loop},while(range of var)
        }
        int times=1;
        int sum1=0;
        while(times<=100){
            if(times%2==0){
                sum1+=times;
                System.out.println(sum1);
                times++;

            }
        }
        }


