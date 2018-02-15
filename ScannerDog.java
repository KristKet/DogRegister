//Kristoffer Rova Ketola, krke0142

import java.util.Scanner;

public class ScannerDog {
    private Scanner scan = new Scanner(System.in);

    public String readString(String prompt) {
        System.out.print(prompt);

        String s = scan.nextLine();
        return s;
    }
    public int readInt(String prompt){
        System.out.print(prompt);

        int i = scan.nextInt();
        scan.nextLine();
        return i;
    }
    public double readDouble(String prompt){
        System.out.print(prompt);

        double d = scan.nextDouble();
        scan.nextLine();
        return d;
    }
}
//        Scanner sc = new Scanner(System.in);
//        int number;
//        do {
//        System.out.println("Please enter a positive number!");
//        while (!sc.hasNextInt()) {
//        System.out.println("That's not a number!");
//        sc.next();
//        }
//        number = sc.nextInt();
//        } while (number <= 0);
//        System.out.println("Thank you! Got " + number);