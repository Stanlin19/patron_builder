package org.builder.domain;

public class Rol {

    private String name;
    private String permission;

    public Rol(){}

    public Rol(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "name='" + name + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
