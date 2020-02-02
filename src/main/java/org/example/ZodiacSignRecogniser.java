package org.example;

public class ZodiacSignRecogniser {
        public static String getSign(int day, int month) {
            String resultSign = "";
            if (month == 1 && day <= 19) {
                resultSign = "koziorożec";
            } else if ((month == 1) || (month == 2 && day <= 18)) {
                resultSign = "wodnik";
            } else if ((month == 2) || (month == 3 && day <= 20)) {
                resultSign = "ryby";
            } else if ((month == 3) || (month == 4 && day <= 19)) {
                resultSign = "baran";
            } else if ((month == 4) || (month == 5 && day <= 20)) {
                resultSign = "byk";
            } else if ((month == 5) || (month == 6 && day <= 20)) {
                resultSign = "bliźnięta";
            } else if ((month == 6) || (month == 7 && day <= 22)) {
                resultSign = "rak";
            } else if ((month == 7) || (month == 8 && day <= 22)) {
                resultSign = "lew";
            } else if ((month == 8) || (month == 9 && day <= 22)) {
                resultSign = "panna";
            } else if ((month == 9) || (month == 10 && day <= 22)) {
                resultSign = "waga";
            } else if ((month == 10) || (month == 11 && day <= 21)) {
                resultSign = "skorpion";
            } else if ((month == 11) || (month == 12 && day <= 21)) {
                resultSign = "strzelec";
            }
            return resultSign;
        }
    }
