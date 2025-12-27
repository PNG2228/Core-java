package com.stream;
import java.util.*;
public class StreamExample {
    public static void main(String[] args) {
        String arr[] = {"Anand Kumar","Dheeraj Kumar",null,"Vara laxmi Prajapathi","Dileep Malhothra","Pranay Gottipati","vara chandrakanth",
                null,"Dubasi sadha siva","Garre Prathyusha","Madugula Venkata Kiran",null,"Gandepalli Priya"};
        List<String> list = Arrays.asList(arr);
        list.stream().forEach(name -> System.out.print(name + " "));
        System.out.println();
        list.stream()
            .filter(name -> name != null)
            .forEach(name -> System.out.print(name + " "));
        System.out.println();
        long nullcount = list.stream().filter(name -> name == null).count();
        System.out.println(nullcount);
        list.stream()
            .filter(name -> name != null)
            .filter(name -> name.startsWith("Vara"))
            .map(name -> name.toUpperCase())
            .forEach(name -> System.out.println(name + " "));
        list.stream()
            .filter(name -> name != null)
            .filter(name -> name.endsWith("Kumar"))
            .map(name -> name.toUpperCase())
            .forEach(name -> System.out.println(name + " "));
        list.stream()
            .filter(name -> name != null)
            .sorted(Collections.reverseOrder())
            .forEach(name -> System.out.println(name + ", "));
    }
}
