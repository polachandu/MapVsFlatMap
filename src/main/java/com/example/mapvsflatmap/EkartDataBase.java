package com.example.mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"john","john@gmail.com", Arrays.asList("1234567890","0987654321")),
                new Customer(102,"peter","peter@gmail.com", Arrays.asList("1234567890","0987654321")),
                new Customer(103,"smith","smith@gmail.com", Arrays.asList("1234567890","0987654321")),
                new Customer(104,"katy","katy@gmail.com", Arrays.asList("1234567890","0987654321"))
        ).collect(Collectors.toList());
    }
}

