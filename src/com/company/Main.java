package com.company;

public class Main {

    public static void main(String[] args) {

    UserService userService = new UserService();

	User userOne = new User(1, "Misha",29,"Male");
    User userTwo = new User(2,"Yura", 34,"Male");
    User userThree = new User(3,"Ira",43,"Female");

    userService.saveUser(userOne);
    userService.saveUser(userTwo);
    userService.saveUser(userThree);
        System.out.println(userOne.getName());

    }
}
