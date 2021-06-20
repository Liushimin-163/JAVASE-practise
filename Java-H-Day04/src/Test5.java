package Tompeixun;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        HashMap<Car, Double> car=new HashMap<>();
        car.put(new Car("truck"),300000.00);
        car.put(new Car("transit"),4000000.00);
        car.put(new Car("pickUp"),2500000.00);
        Set<Car> key1=car.keySet();
        for(Car k:key1){
            System.out.print(k+": ");
            System.out.print(car.get(k));
            System.out.println();
        }
        System.out.println("------------");
        Set<Map.Entry<Car, Double>> key2 = car.entrySet();
        for(Map.Entry<Car,Double> k:key2){
            System.out.print(k.getKey()+": ");
            System.out.print(k.getValue());
            System.out.println();

        }

    }
}
