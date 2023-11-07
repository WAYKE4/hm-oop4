package com.company;

public class User1 implements Cloneable {
    public int id = 77;

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
