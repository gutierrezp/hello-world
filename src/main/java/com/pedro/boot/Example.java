package com.pedro.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.pedro.boot.model.Person;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World! Let´s read the REST app";
    }
    
    @RequestMapping("/probando")
    String probando() {
        return "Maybe some day I will understand what the hell I´m doing...";
    }
    
    @RequestMapping(value = "/rest/personas", method = RequestMethod.GET)
    @CrossOrigin
    List<Person> persona() {
    	List<Person> personList = new ArrayList<Person>();
    	
    	personList.add(new Person("Pedro",1234,1000.99));
    	personList.add(new Person("Racan",5678,7000.99));
    	personList.add(new Person("Alex",9999,666001.99));
        return personList;
    }
    
    @RequestMapping(value = "/rest/personasPost", method = RequestMethod.POST)
    List<Person> personaPost() {
    	List<Person> personList = new ArrayList<Person>();
    	
    	personList.add(new Person("Pedro",1234,1000.99));
    	personList.add(new Person("Racan",5678,7000.99));
    	personList.add(new Person("Alex",9999,666000.99));
        return personList;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
