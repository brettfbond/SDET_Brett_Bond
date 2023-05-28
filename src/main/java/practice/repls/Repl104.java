package practice.repls;

import java.util.Scanner;

public class Repl104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nameArr = new String[5];
        for (int i = 0; i < nameArr.length; i++) {
            nameArr[i] = scan.next();
        }
        for (int i = 0; i < nameArr.length; i++) {
            System.out.print(nameArr[i].substring(0,3));
            System.out.println();
        }
    }
}
