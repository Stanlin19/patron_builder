package org.builder.builders;

import org.builder.domain.Rol;
import org.builder.domain.User;

public class UserBuilder implements Builder{
    private Long id;
    private String username;
    private String password;
    private String email;
    private Rol rol;

    public UserBuilder setId(Long id){
        this.id = id;
        return this;
    }

    public UserBuilder setUsername(String username){
        this.username = username;
        return this;
    }

    public UserBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public UserBuilder setPassword(String password){
        this.password = password;
        return this;
    }

    public UserBuilder setRol(Rol rol){
        this.rol = rol;
        return this;
    }

    public UserBuilder setRol(String name, String permission){
        this.rol = new Rol(name, permission);
        return this;
    }

    @Override
    public User build() {
        return new User(id, username, password, email, rol);
    }
}
