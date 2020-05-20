package com.bridagelabz.abc.abc.service;

import com.bridagelabz.abc.abc.model.Greeting;
import com.bridagelabz.abc.abc.model.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    Greeting addGreeting(User user);

    Optional<Greeting> getGreetingById(long id);

    List<Greeting> getAllGreeting();

    void deleteGreeting(long id);

    void updateGreeting(long id, String name);
}
