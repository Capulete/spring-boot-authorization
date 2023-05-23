package com.example.springbootauthorization;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class User {
    private String user;
    private String password;
    private List<Authorities> authorities;


    public User(String user, String password, Authorities ... authorities) {
        this.user = user;
        this.password = password;
        this.authorities = Arrays.stream(authorities).toList();
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(user, user1.user) && Objects.equals(password, user1.password) && Objects.equals(authorities, user1.authorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password, authorities);
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
