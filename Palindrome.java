import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = inputs.next();
        boolean result = Palindrome(word);
        System.out.println("The fact that it's a palindrome is "+result);


    }

    public static boolean Palindrome(String a){ //Methods that don't use instance variables, meaning variables that are outside any methods, are static
        String b = a;
        char[] compare = new char[a.length()]; //Array of a string is made of chars
        int i = 0;
        for (int x = a.length()-1;x>=0;x--) {
            compare[i] = b.charAt(x); //Add a single value to an array by charAt
            i++;
        }
        String result = new String(compare);
        if (result.equalsIgnoreCase(a)){ //Ignore case
            return true;
        }
        else
            return false;



    }
}

