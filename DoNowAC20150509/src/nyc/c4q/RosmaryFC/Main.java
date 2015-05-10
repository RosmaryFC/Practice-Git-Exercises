package nyc.c4q.RosmaryFC;

import com.sun.deploy.util.StringUtils;

/**
 * Create a new Java class to do the following string operations:

 Reverse - "Quispe" -> "epsiuQ"
 Uppercase words - "i love java" -> "I Love Java"
 Reverse words - "Java Love I" -> "I Love Java"
 Parse Addition Expression - "3 + (4 + 2)" -> "9". Assume that the only operations are "+" and parentheses.
 */

public class Main {


    public static void main(String[] args) {

        System.out.println(reverse("Quispe"));
        System.out.println(uppercaseWords("i love java"));
        System.out.println(reverseWords("Java Love I"));
    }


    // can also use StringBuilder(name).reverse().toString();
    public static String reverse (String word) {
        // Reverse - "Quispe" -> "epsiuQ"
        String reverseWord = "";

        for(int i = word.length()-1; i >= 0; i--){
            reverseWord += word.charAt(i);
        }

        return reverseWord;

    }

    //String output = input.substring(0, 1).toUpperCase() + input.substring(1);
    public static String uppercaseWords (String phrase) {
        // Uppercase words - "i love java" -> "I Love Java"
        String uppercase = "";

        for(int i = 0; i < phrase.length(); i ++){
            if(i == 0) {
                uppercase += phrase.substring(0,1).toUpperCase();
            } else if ( i == 0 || phrase.charAt( i-1) == ' ') {
                uppercase += phrase.substring(i,i+1).toUpperCase();
            } else {
                uppercase += phrase.charAt(i);
            }

        }

        return uppercase;
    }

    public static String reverseWords (String phrase) {
        // Reverse words - "Java Love I" -> "I Love Java"

        String reversePhrase = "";

        String parts [] = phrase.split(" ");
        for(int i = parts.length - 1; i >= 0; i --){
            reversePhrase += parts[i] + " ";
        }

        return reversePhrase;
    }

//    public static int parseAdditionExpression (String expression) {
//        // Parse Addition Expression - "3 + (4 + 2)" -> "9". Assume that the only operations are "+" and parentheses.
//
//        int answer = (Integer)
//        return 0;
//    }

}
