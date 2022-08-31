import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();
        for (char c:input.toCharArray()){
            if (input.indexOf(c)!=input.lastIndexOf(c)){
                System.out.println("The string is not isogram, there are some '"+c+"'.");
                return;
            }
        }
        System.out.println("The string is isogram");
    }
}