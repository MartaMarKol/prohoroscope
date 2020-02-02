package org.example;

import org.jsoup.Jsoup;

import java.io.IOException;

public class Connector {
    public static final String NOT_FOUND = "NOT FOUND";
    private static final String URL_TEMPLATE = "https://horoskopy.gazeta.pl/horoskop/[placeholder]/dzienny";
    public static String getPage(String zodiackSign) {
        String fullurl =  URL_TEMPLATE.replace("[placeholder]", zodiackSign);
        String requestResult;
        try {
            requestResult = Jsoup.connect(fullurl).get().html();
        } catch (IOException e) {
            requestResult= "not found";
            e.printStackTrace();
        }
        return requestResult;
    }
}