package com.company;

public class UserService {
    private UserDao userDao = new UserDao();
    private int index = 0;

    public void saveUser(User user ){
        if (user != null) {
            userDao.getUser()[index] = user;
            index++;
        }else {
            System.out.println("Object pustoy bolboosu kerek");
        }
    }

}
