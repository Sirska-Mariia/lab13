package ucu.edu.ua.task1.meta;

import java.time.LocalDate;

public class FacebookUser {

    private String email;
    private String country;
    private LocalDate lastActiveTime;

    public FacebookUser(String email, String country, LocalDate lastActiveTime) {
        this.email = email;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }
    
    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getLastActiveTime() {
        return lastActiveTime;
    }
}
