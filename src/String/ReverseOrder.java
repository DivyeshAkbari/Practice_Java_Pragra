package String;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String [] words=str.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        for(int i=words.length-1;i>=0;i--)
        {
            reversedSentence.append(words[i]);
            if(i>0)
            {
                reversedSentence.append(" ");
            }
        }

        System.out.println(reversedSentence);
    }
}
