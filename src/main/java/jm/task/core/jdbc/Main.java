package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();


        userService.createUsersTable();


        userService.saveUser("Василий", "Ермолов", (byte) 33);
        userService.saveUser("Пётр", "Романов", (byte) 40);
        userService.saveUser("Екатерина", "Белова", (byte) 21);
        userService.saveUser("Ольга", "Островская", (byte) 39);


        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }


        userService.cleanUsersTable();


        userService.dropUsersTable();
    }
}