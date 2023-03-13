import jdk.dynalink.linker.LinkRequest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price = 13676;
        int rubles = 20;

        int miles = 1;

        // int  miles = (1>0) ? 1 : 0;

        int result = price / 20 * miles;
        System.out.println("Стоимость билета: " + price + "\nВаш бонус составляет: " + result);

    }
}
