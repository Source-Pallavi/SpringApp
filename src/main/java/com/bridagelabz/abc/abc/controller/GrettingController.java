package com.bridagelabz.abc.abc.controller;
import com.bridagelabz.abc.abc.model.Greeting;
import com.bridagelabz.abc.abc.model.User;
import com.bridagelabz.abc.abc.service.IGreetingService;
import com.bridagelabz.abc.model.User;
import com.bridagelabz.abc.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/hello")

public class GrettingController {
    @Autowired
    private IGreetingService greetingService;


    @PostMapping("/post")
    public Greeting greeting(@RequestParam String name) {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/getGreeting/{id}")
    public Optional<Greeting> findGreetingById(@PathVariable(value = "id") long id) {
        Optional<Greeting> greetingById = greetingService.getGreetingById(id);
        return  greetingById;
    }
    @GetMapping("/getAllGreetings")
    public List<Greeting> getAllGreetingById() {
        return greetingService.getAllGreeting();
    }
    @DeleteMapping("/deleteGreeting/{id}")
    public String deleteById(@PathVariable long id){
        greetingService.deleteGreeting(id);
        return "Greeting Deleted successfully";
    }

    @PutMapping("/updateGreetings/{id}")
    public String updateGreetingById(@PathVariable long id, @RequestParam String name ){
        greetingService.updateGreeting(id, name);
        return "Greeting Updated!!!!";
    }
}
