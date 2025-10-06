package com.topsify.cli.models;


import com.topsify.cli.utils.SQLInsertable;

public class User implements SQLInsertable {

    public static String TABLE = "users";

    private long id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String avatar;
    private String password;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String getSQLInsert() {
        return String.format("INSERT INTO %s VALUES( %d,\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\");\n",
                User.TABLE,
                id,
                username,
                first_name,
                last_name,
                email,
                avatar,
                password);
    }
}

