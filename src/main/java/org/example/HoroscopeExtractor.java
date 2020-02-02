package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoroscopeExtractor {
    private static final String PATTERN =  "<p class=\"lead\">.+";
    public static String getText(String pageAsText) {
        Pattern horoPat = Pattern.compile(PATTERN);
        Matcher horoMatcher = horoPat.matcher(pageAsText);
        String foundText = "";
        if (horoMatcher.find()) {
            foundText = horoMatcher.group().replace("<p class=\"lead\">", "").replace("</p>", "").replace(". ", ".\n");
        }
        return foundText;
    }
}