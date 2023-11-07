package com.company;

import java.util.Objects;

public class User1 {
    public int id;

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return id == user1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public User1(int id) {
        this.id = id;
    }
}
