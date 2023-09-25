package mixProblemSolving;

import java.util.Scanner;

public class StringReverse {
    public static void reverseString(char[]ch, int length){
        if (length > 0){
            System.out.println(ch[length-1]);
            length --;
            reverseString(ch, length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String str = sc.nextLine();
//        char [] ch = str.toCharArray();
//        int length = ch.length;
//        reverseString(ch,length);
        int length = str.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

    }
}
