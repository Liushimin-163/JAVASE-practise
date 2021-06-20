package Test;

public class Test03 {
    static void decToHex(int num,NumberToString nts){

        String s=nts.convert(num);
        System.out.println(s);
    }

    public static void main(String[] args) {
        decToHex(1002,nts->Integer.toHexString(nts));
    }
}
