package org.example;

import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj dane: IMIE!");
        String userName = scan.next();
        System.out.println("dzien");
        Integer day = scan.nextInt();
        scan.nextLine();
        System.out.println("miesiac");
        Integer month = scan.nextInt();
        String sign = ZodiacSignRecogniser.getSign(day, month);
        String requestResult = Connector.getPage(sign);
        String horoscopeMess = " ";
        if (!requestResult.equals(Connector.NOT_FOUND)) {
            horoscopeMess = HoroscopeExtractor.getText(requestResult);
        }
        System.out.println(horoscopeMess);
    }
}