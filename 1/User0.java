package com.company;

import java.util.Objects;

public class User0 {
    public int id;


    public User0(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User0 user0 = (User0) o;
        return id == user0.id;
    }


    @Override
    public String toString() {
        return "User0{" +
                "id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
