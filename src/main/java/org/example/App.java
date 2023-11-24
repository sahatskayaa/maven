package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person();

        ObjectMapper om = new ObjectMapper();
        System.out.println(om.writeValueAsString(person));
    }
}
