package com.example.demo;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoApplication {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        // stream.forEach(p -> System.out.println(p));

        Stream<Date> stream2 = Stream.generate(() -> {
            return new Date();
        });

        // stream2.forEach(p -> System.out.println(p));


        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                list.add(i);
            }
        }
        List<Integer> testList = list.stream().filter(p -> p % 4 == 0).collect(Collectors.toList());
        testList.forEach(t -> System.out.println(t));
        // list.forEach(i -> System.out.println(i));
        //Stream<Integer> stream3 = list.stream();
        // stream3.filter(i2 -> i2 % 2 == 0);
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + "  FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println(i + "  FIZZ");
            } else if (i % 5 == 0) {
                System.out.println(i + "  BUZZ");
            }

        }
       WebDriver driver;
    }
}