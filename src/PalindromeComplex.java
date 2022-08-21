import java.util.Scanner;

public class PalindromeComplex {
    public static void main(String[] args) {
        String initialSentence, formattedSentence, reversedSentence = "";


        //Accept the string
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ENTER A WORD]");
        initialSentence = scanner.nextLine();

        System.out.println("[YOU ENTERRED]-> " + initialSentence);

        formattedSentence = initialSentence.replaceAll("\\s","");
        System.out.println("[AFTER FORMATTING]-> " + formattedSentence);

        System.out.println();

        int lenght = formattedSentence.length();

        for(int i= lenght-1; i>=0; i--){
            reversedSentence = reversedSentence + formattedSentence.charAt(i);
        }

        System.out.println("AFTER REVERSAL ->" + reversedSentence);
        if(formattedSentence.equals(reversedSentence))
            System.out.println("[THE WORD IS PALINDROME]");

        else
            System.out.println("[THE WORD IS NOT PALINDROME]");

    }
}
