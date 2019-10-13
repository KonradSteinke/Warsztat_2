package pl.coderslab;

import pl.coderslab.DAO.UserDAO;
import pl.coderslab.Model.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* User newUser = new User("admin","admin@gmail.com" ,"admin" );
        System.out.println(newUser.toString());
        UserDAO userDAO = new UserDAO();
        userDAO.create(newUser);
        System.out.println(newUser.toString());*/
        UserDAO userDAO = new UserDAO();
        /*User readUser = userDAO.read(1);
        System.out.println(readUser);
        readUser.setUserName("newUserName");
        userDAO.update(readUser);
        User updateUser = userDAO.read(1);
        System.out.println(updateUser);*/
       /* User toBeDeleted = userDAO.read(1);
        System.out.println(toBeDeleted);
        userDAO.delete(toBeDeleted.getId());
        User deleted = userDAO.read(1);*/
       for (int i = 0; i <5 ; i++){
           userDAO.create(
                   new User("user","email"+i+"@gmail.com","hasło")
           );
       }
    }
}
