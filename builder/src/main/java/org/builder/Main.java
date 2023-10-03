package org.builder;

import org.builder.builders.UserBuilder;
import org.builder.domain.Rol;
import org.builder.domain.User;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder().
                setId(1L)
                .setUsername("jezabala")
                .setEmail("jezabala@gmail.com")
                .setPassword("jezabala123")
                .setRol(new Rol("Admin", "All"))
                .build();
        System.out.println(user);
    }
}