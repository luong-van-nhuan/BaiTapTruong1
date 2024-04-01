package lab2;

import java.util.Random;

public class Ex9 {
    private static final String[] UNIT_WORDS = {
        "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
        "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"
    };
    private static final String[] UNIT_NAMES = {
        "", "mươi", "trăm"
    };

    public static String convertToWords(int number) {
        if (number == 0) {
            return "không";
        }

        StringBuilder words = new StringBuilder();

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        if (hundreds > 0) {
            words.append(UNIT_WORDS[hundreds]).append(" ").append(UNIT_NAMES[2]).append(" ");
        }

        if (tens > 0) {
            if (tens == 1) {
                words.append("mười").append(" ");
            } else {
                words.append(UNIT_WORDS[tens]).append(" ").append(UNIT_NAMES[1]).append(" ");
            }
        }

        if (ones > 0) {
            if (tens == 0) {
                words.append("lẻ").append(" ");
            }
            words.append(UNIT_WORDS[ones]).append(" ");
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(1000) + 1;
        String words = convertToWords(number);
        System.out.println(number + " đọc là " + words);
    }
}