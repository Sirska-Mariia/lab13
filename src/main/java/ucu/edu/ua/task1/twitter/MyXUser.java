package ucu.edu.ua.task1.twitter;

import java.time.LocalDate;

import ucu.edu.ua.myuser.User;

public class MyXUser implements User, ucu.edu.ua.task1.myuser.User{

    private ucu.edu.ua.task1.twitter.XUser xUser;

    public MyXUser(ucu.edu.ua.task1.twitter.XUser xUser){
        this.xUser = xUser;
    }
    @Override
    public String getEmail(){
        return xUser.getEmail();
    }

    @Override
    public String getCountry(){
        return xUser.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime(){
        return xUser.getUserActiveTime();
    }


}
