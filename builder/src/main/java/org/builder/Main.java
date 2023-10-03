package org.builder;

import org.builder.domain.Rol;
import org.builder.domain.User;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .id(1L)
                .username("jezabala")
                .email("jezabala@gmail.com")
                .password("jezabala123")
                .rol(new Rol("Admin", "All"))
                .build();
        System.out.println(user);
    }
}