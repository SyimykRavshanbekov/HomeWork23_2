package company;

import company.dao.UserDao;
import company.impl.UserServiceImpl;
import company.model.Gender;
import company.model.User;



public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Syimyk", 15, Gender.MALE);
        User user2 = new User(2, "Bakai", 35, Gender.MALE);
        User user3 = new User(3, "Argen", 18, Gender.MALE);

        UserDao userDao = new UserDao();
        userDao.setUsers(user1);
        userDao.setUsers(user2);
        userDao.setUsers(user3);

        UserServiceImpl userService = new UserServiceImpl(userDao);

        userService.searUserID(1);

        userService.getUsers();

        userService.removeUser(2);

        userService.getUsers();

    }
}