package ucu.edu.ua.task1.myuser;

import ucu.edu.ua.myuser.User;

import java.time.LocalDateTime;

public class MessageSender {

    public void send(String text, User user, String country) {
        if (!user.getCountry().equalsIgnoreCase(country)) {
            System.out.println("User is not from the specified country.");
            return;
        }
        LocalDateTime lastActiveTime = user.getLastActiveTime().atStartOfDay();
        LocalDateTime now = LocalDateTime.now();

        if (lastActiveTime.isAfter(now.minusHours(1))) {
            System.out.printf("Sending message: '%s' to %s\n", text, user.getEmail());
        } else {
            System.out.println("User was not active in the last hour.");
        }
    }
}

