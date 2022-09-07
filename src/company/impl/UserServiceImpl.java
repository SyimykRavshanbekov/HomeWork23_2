package company.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.setUsers(user);
    }

    @Override
    public void searUserID(int n) {
        int counter = 0;
        try{
            for (int i = 0; i < userDao.getUsers().size(); i++) {
                if (userDao.getUsers().get(i).getId() == n){
                    System.out.println("-------------Пользователь с ID №" + userDao.getUsers().get(i).getId() +"------------"+ userDao.getUsers().get(i));
                    counter++;
                }

                if (counter==0){
                    throw new RuntimeException();
                }
            }
        }catch (RuntimeException e){
            System.out.println("Пользователь не найден!");
        }

    }

    @Override
    public void removeUser(int n) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == n){
                userDao.getUsers().remove(n);
                break;
            }
        }

    }

    @Override
    public void getUsers() {
        System.out.println("\n--------------ALL USERS------------------");
        userDao.getAllUsers();
    }
}
