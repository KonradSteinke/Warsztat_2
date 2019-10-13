package pl.coderslab;

import pl.coderslab.DAO.UserDAO;
import pl.coderslab.Model.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User newUser = new User("admin","admin@gmail.com" ,"admin" );
        System.out.println(newUser.toString());
        UserDAO userDAO = new UserDAO();
        userDAO.create(newUser);
        System.out.println(newUser.toString());
    }
}
