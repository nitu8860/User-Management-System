package com.example.usermanagementsystem.service;
import com.example.usermanagementsystem.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;

    static {
        users.add(new User(++userCount, "John ", "john@email.com", "123 Main St.",23456789));
        users.add(new User(++userCount, "Ram", "janeram@email.com", "13 Street",9876543));
        users.add(new User(++userCount, "Bob ", "bobsmith@email.com", "66 Main Street",74327898));
        users.add(new User(++userCount, "Amy ", "amyjohnson@email.com", "1 main street",999776652));
        users.add(new User(++userCount, "Naman", "markbrown@email.com", "789 Pine Rd.",92134455));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getUserId() == id) {
                return user;
            }
        }
        return null;
    }

    public User addUser(User user) {
        if (user.getUserId() == 0) {
            user.setUserId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User updateUser(int id, User user) {
        int index = -1;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return null;
        }
        user.setUserId(id);
        users.set(index, user);
        return user;
    }

    public void deleteUser(int id) {
        User user = findById(id);
        if (user != null) {
            users.remove(user);
        }
    }
}

