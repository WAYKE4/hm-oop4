package com.company;

public class Main {

    public static void main(String[] args) {
        User0 user0 = new User0(77);
        User0 user1 = new User0(77);
        System.out.println("user0 hashCode " + user0.hashCode() + " \n" + "user1 hashCode " + user1.hashCode());
        if (user0.hashCode() == user1.hashCode()) {
            System.out.println(user0.equals(user1)); // true
        }
        User1 user2 = new User1(77);
        System.out.println("user0 hashCode " + user0.hashCode() + " \n" + "user2 hashCode " + user2.hashCode());
        if (user0.hashCode() == user2.hashCode()) {
            System.out.println(user0.equals(user2)); // false
        }



    }
}
