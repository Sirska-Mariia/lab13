package ucu.edu.ua.task1.twitter;

import java.time.LocalDate;


public class XUser {

    private String email;
    private String userCountry;
    private LocalDate userActiveTime;

    public XUser(String email, String userCountry, LocalDate userActiveTime) {
        this.email = email;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public LocalDate getUserActiveTime() {
        return userActiveTime;
    }
}
