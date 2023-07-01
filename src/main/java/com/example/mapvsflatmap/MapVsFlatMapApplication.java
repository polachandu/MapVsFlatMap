package com.example.mapvsflatmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class MapVsFlatMapApplication {

    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAll();

        //List<Customer> convert List<String> -> Data Transformation
        //customer -> customer.getEmail() one to one mapping
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        //customer -> customer.getPhoneNumbers() one to many mapping
        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        List<String> phoneNumbersFlatMap = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbersFlatMap);

    }

}
