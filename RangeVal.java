import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter some numbers separated by spaces: ");
        String numbers = inputs.nextLine();
        String[] numbs = numbers.split(" ");
        int[] numbs2 = new int[numbs.length];
        for (int i = 0; i <numbs.length;i++){
            numbs2[i] = Integer.parseInt(numbs[i]); //Turn a string to an integer
        }
        System.out.println(findRange(numbs2));



    }
    public static String findRange(int[] numbers){
        if (numbers.length == 0){
            return "None";
        }
        else{
            int largest = numbers[0];
            int smallest = numbers[0];
            for (int x = 1; x < numbers.length;x++){
                if (numbers[x] > largest)
                    largest = numbers[x];
                else if (numbers[x] < smallest)
                    smallest = numbers[x];
            }
            return "Largest: "+largest+"\nSmallest: "+smallest+"\nDifference: "+(largest-smallest);

        }
    }
}

/*

Goal: Create a method that finds the difference between the largest and smallest numbers in an integer array.

    Method Signature: public static String findRange(int[] numbers)

    Constraints: If the array is empty or has one element, return 0.

    Example: For {10, 3, 5, 20, 2}, the method should return 18 (since 20−2=18).
 */
