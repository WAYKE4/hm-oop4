package com.company;

public class User0 implements Cloneable {
    public String name = "User0";
    public int age = 20;
    User1 user1 = new User1();

    @Override
    public String toString() {
        return "User0{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", user1=" + user1 +
                '}';
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object clone(int num) throws CloneNotSupportedException {
        User0 user0clone = (User0) super.clone();
        user0clone.user1 = (User1) user1.clone();
        return user0clone;
    }
}
