import jdk.dynalink.linker.LinkRequest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price = 13676;
        int rubles = 20;
        boolean isRegistered =true;

        int miles;
        if(isRegistered) {
            miles = 1;
        } else {
            miles = 0;
        }

       // int  miles= isRegistered ? 1 : 0;

        int result = price / 20 * miles;

        if (miles > 500) {
            miles=500;
        }
        System.out.println( "Стоимость билета: "  + price + "\nВаш бонус составляет: " + result);

    }
}