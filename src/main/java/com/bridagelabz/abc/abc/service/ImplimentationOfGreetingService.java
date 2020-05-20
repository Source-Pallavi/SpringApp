package com.bridagelabz.abc.abc.service;

public class ImplimentationOfGreetingService implements IGreetingService {
    GreetingRepo greetingRepo;
    @Override
    public GreetingUser addGreeting(User user) {
        return greetingRepo.save(new GreetingUser(counter.incrementAndGet(),message));
    }

    @Override
    public Optional<GreetingUser> getGreetingById(long id) {
        return greetingRepo.findById(id);
    }

    @Override
    public List<GreetingUser> getAllGreeting() {
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
