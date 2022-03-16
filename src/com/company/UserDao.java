package com.company;

public class UserDao {
    private User[] users = new User[10];
    public User[] getUser(){
        return users;
    }
    public void setUser(User[] user){
        this.users = user;
    }
}
