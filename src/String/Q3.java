package String;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        String str;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        char[] ch = str.toCharArray();

        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == 'a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                vowelCount++;
            }
            else
            {
                consonantCount++;
            }
        }

        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
    }
}
