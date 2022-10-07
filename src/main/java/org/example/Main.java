package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("This project has a library");
        List<String> list = new ArrayList<>();
        list.add("qwww");  list.add("qwyy");  list.add("qwyuu");  list.add("qwyutt");  list.add("qwhnjtyueee");
        System.out.println(StringListHandler.listHandler(list) + "  in this project");
    }
}