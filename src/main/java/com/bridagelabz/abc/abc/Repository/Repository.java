package com.bridagelabz.abc.abc.Repository;


import com.bridagelabz.abc.abc.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Greeting, Long> {}
