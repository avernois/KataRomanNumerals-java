package fr.craftinglabs.dojo;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;


public class Roman {

    private static String [][]alphabet = {{"I", "V", "X"}, {"X", "L", "C"}, {"C", "D", "M"}, {"M", "", ""}};

    static public String convert(int arabic) {

        String roman = "";        
        int position = 0;

        for (String digit : reverseDigits(arabic)) {
            roman = convertDigit(digit, alphabet[position]).concat(roman);
            position++;
        }
        
        return roman;
    }

    static private String convertDigit (String digits, String[] alphabet) {
        String roman = "";
        switch (digits) { 
        case "0":
            roman = "";
            break;
        case "1":
        case "2":
        case "3":
            roman = StringUtils.repeat(alphabet[0], Integer.valueOf(digits));
            break;
        case "4":
            roman = alphabet[0].concat(alphabet[1]);
            break;
        case "5":
            roman = alphabet[1];
            break;
        case "6":
        case "7":
        case "8":
            roman = alphabet[1].concat(StringUtils.repeat(alphabet[0], Integer.valueOf(digits) - 5));
            break;
        case "9":
            roman = alphabet[0].concat(alphabet[2]);
            break;
        default:
            break;
        }

        return roman;
    }

    static private String[] reverseDigits(int number) {
        String[] digits = String.valueOf(number).split("");
        digits = ArrayUtils.removeElement(digits, ""); // due to split(""), there is a useless "" element in our array
        ArrayUtils.reverse(digits);
        
        return digits;
    }
}