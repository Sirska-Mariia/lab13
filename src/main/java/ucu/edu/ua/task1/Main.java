package ucu.edu.ua.task1;

import java.time.LocalDate;

import ucu.edu.ua.task1.meta.MyFacebookUser;
import ucu.edu.ua.task1.myuser.User;
import ucu.edu.ua.task1.meta.FacebookUser;
import ucu.edu.ua.task1.twitter.XUser;
import ucu.edu.ua.task1.twitter.MyXUser;
import ucu.edu.ua.task1.twitter.XCountry;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    User xUser = new MyXUser(new XUser("abc.gmail.com", XCountry.UKRAINE,LocalDate.of(2024,11,25)));

    User facebookUser = new MyFacebookUser(new FacebookUser("abc.gmail.com",XCountry.UKRAINE , LocalDate.of(2024,11,25)));


    public static void processInformation(User user){
        System.out.println(user.getEmail());
    }

//    void processInformation(xUser);

}