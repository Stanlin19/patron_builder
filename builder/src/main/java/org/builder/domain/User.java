package org.builder.domain;

import org.builder.builders.Builder;

public class User {

    private Long id;
    private String username;
    private String password;
    private String email;
    private Rol rol;

    public User(){}

    public User(Long id, String username, String password, String email, Rol rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.rol = rol;
    }

    public static class Builder implements org.builder.builders.Builder {

        private Long id;
        private String username;
        private String password;
        private String email;
        private Rol rol;

        public Builder setId(Long id){
            this.id = id;
            return this;
        }

        public Builder setUsername(String username){
            this.username = username;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPassword(String password){
            this.password = password;
            return this;
        }

        public Builder setRol(Rol rol){
            this.rol = rol;
            return this;
        }

        public Builder setRol(String name, String permission){
            this.rol = new Rol(name, permission);
            return this;
        }

        @Override
        public User build() {
            return new User(id, username, password, email, rol);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", rol=" + rol +
                '}';
    }
}
