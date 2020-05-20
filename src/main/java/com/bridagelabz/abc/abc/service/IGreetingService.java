package com.bridagelabz.abc.abc.service;

public interface IGreetingService {
    GreetingUser addGreeting(User user);

    Optional<GreetingUser> getGreetingById(long id);

    List<GreetingUser> getAllGreeting();

    void deleteGreeting(long id);

    void updateGreeting(long id, String name);
}
