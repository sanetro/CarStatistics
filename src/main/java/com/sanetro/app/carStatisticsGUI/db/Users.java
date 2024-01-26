package com.sanetro.app.carStatisticsGUI.db;

import com.sanetro.app.carStatisticsGUI.model.User;

import java.util.HashMap;
import java.util.Map;

public class Users {
    private static Users instance;
    private Map<String, User> userMap = new HashMap<>();

    private Users() {
        this.userMap.put("user1", new User("user1", "password123", "Wick", "jhon@example.com", "Jhon", 30));
        this.userMap.put("user2", new User("user2", "password234", "White", "walter@example.com", "Walter", 25));
        this.userMap.put("user3", new User("user3", "password345", "Runner", "runner@example.com", "Tom", 40));
    }

    public static Users getInstance() {
        if (instance == null) {
            instance = new Users();
        }
        return instance;
    }

    public boolean authenticate(String username, String password) {
        User user = userMap.get(username);
        return user != null && user.getPassword().equals(password);
    }
}
