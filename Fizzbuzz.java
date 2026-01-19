import java.util.Scanner;
public class practice{
    public static String[] getFizzBuzz(String[] n){
        String[] a = new String[n.length];
        for (int i = 0;i<n.length;i++){
          int val = Integer.parseInt(n[i];
          if (val % 3 == 0 && val % 5 == 0) {
            a[i] = val + ": FizzBuzz";
        } 
        // 2. Then check individual conditions
        else if (val % 3 == 0) {
            a[i] = val + ": Fizz";
        } 
        else if (val % 5 == 0) {
            a[i] = val + ": Buzz";
        } 
        // 3. Default case
        else {
            a[i] = String.valueOf(val); //Convert a string to integer
        }
              
            

        return a;
    }
    public static void main(String[] args){
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String[] a = (inputs.nextLine()).split(" ");
        String[] b = getFizzBuzz(a);
        inputs.close();
        for (int i = 0; i<b.length;i++){
            System.out.println(b[i]);
        }

    }

}
/*

Goal: Instead of just printing, create a method that returns an array of Strings.

Method Signature: public static String[] getFizzBuzz(int n)

Logic: * Create a String array of size n.

For each number from 1 to n:

If divisible by 3, the entry is "Fizz".

If divisible by 5, the entry is "Buzz".

If divisible by both, "FizzBuzz".

Otherwise, just the number as a String (e.g., "1").

Hint: Use String.valueOf(i) to convert an integer to a string

*/
