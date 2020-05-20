package com.bridagelabz.abc.abc.service;

import com.bridagelabz.abc.abc.Repository.Repository;
import com.bridagelabz.abc.abc.model.Greeting;
import com.bridagelabz.abc.abc.model.User;

import java.util.List;
import java.util.Optional;

public class ImplimentationOfGreetingService implements IGreetingService {
    Repository greetingRepo;
    @Override
    public Greeting addGreeting(User user) {
        return greetingRepo.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public Optional<Greeting> getGreetingById(long id) {
        return greetingRepo.findById(id);
    }

    @Override
    public List<Greeting> getAllGreeting() {
        return greetingRepo.findAll();
    }

    @Override
    public void deleteGreeting(long id) {
        return greetingRepo.findAll();
    }

    @Override
    public void updateGreeting(long id, String name) {
        greetingRepo.deleteById(id);
    }
}
