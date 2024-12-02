package ucu.edu.ua.task1.meta;

import java.time.LocalDate;

import ucu.edu.ua.task1.myuser.User;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;
    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();

    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();

    }

    @Override
    public LocalDate getLastActiveTime() {
        return facebookUser.getLastActiveTime();

    }

}
