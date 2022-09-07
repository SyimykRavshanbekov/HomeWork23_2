package company.service;

import company.model.User;

import java.util.ArrayList;

public interface UserService {
    void addUser(User user);
    void searUserID(int n);
    void removeUser(int n);
    void getUsers();
}
