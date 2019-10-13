package pl.coderslab;

import pl.coderslab.Model.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User newUser = new User("admin","admin@gmail.com" ,"admin" );
        System.out.println(newUser.toString());
    }
}
