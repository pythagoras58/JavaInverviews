import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String initialWord, reversedWord = "";

        //Accept the string
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ENTER A WORD]");
        initialWord = scanner.nextLine();

        int lenght = initialWord.length();

        for(int i= lenght-1; i>=0; i--){
            reversedWord = reversedWord + initialWord.charAt(i);
        }

        if(initialWord.equals(reversedWord))
            System.out.println("[THE WORD IS PALINDROME]");

        else
            System.out.println("[THE WORD IS NOT PALINDROME]");
    }

}
