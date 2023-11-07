package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("Tip klonirovaniya? 1 - poverhnostnoe ; 2 - glubokoe");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        User0 user0 = new User0();
        switch (num) {
            case 1 -> {
                System.out.println("Bilo vibrano poverhnostnoe klonirovanie... " );
                User0 user0clone = (User0) user0.clone();
                System.out.println("User0: " + user0);
                System.out.println("User0Clone: " + user0clone);
                System.out.println();
                user0.name = "AntiUser";
                user0clone.user1.id = 100;
                System.out.println("User0: " + user0);
                System.out.println("User0Clone: " + user0clone);
            }
            case 2 -> {
                System.out.println("Bilo vibrano glubokoe klonirovanie... " );
                User0 user0clone = (User0) user0.clone(0);
                System.out.println("User0: " + user0);
                System.out.println("User0Clone: " + user0clone);
                System.out.println();
                user0.name = "AntiUser";
                user0clone.user1.id = 100;
                user0clone.age = 654;
                System.out.println("User0: " + user0);
                System.out.println("User0Clone: " + user0clone);
            }
            default -> {
                System.out.println("Ne pravilno vveden tip klonirovaniya");
                System.exit(0);
            }
        }
    }
}
