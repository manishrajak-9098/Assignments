// 15) Program to check whether entered character is in uppercase or not using conditional operator 

import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase letter");
        } else {
            System.out.println("Not an Uppercase letter");
        }

    
    }
}