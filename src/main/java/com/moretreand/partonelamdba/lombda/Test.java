package com.moretreand.partonelamdba.lombda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java Program to demonstrate how to use the flatMap() function in Java 8.
 * The flatMap() function is used to convert a Stream of list of values to
 * just a Stream of values. This is also called flattening of stream.
 *
 * @author Javin Paul
 */
public class Test {

    public static void main(String args[]) {

        List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
        List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
        List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
        List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
        List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf");
        List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
        List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan");
        List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");
        
        List<List<String>> playersInWorldCup2016 = new ArrayList<>();
        playersInWorldCup2016.add(teamIndia);
        playersInWorldCup2016.add(teamAustralia);
        playersInWorldCup2016.add(teamEngland);
        playersInWorldCup2016.add(teamNewZeland);
        playersInWorldCup2016.add(teamSouthAfrica);
        playersInWorldCup2016.add(teamWestIndies);
        playersInWorldCup2016.add(teamSriLanka);
        playersInWorldCup2016.add(teamPakistan);
        
        // Let's print all players before Java 8
        List<String> listOfAllPlayers = new ArrayList<>();
        
        for(List<String> team : playersInWorldCup2016){
            for(String name : team){
                listOfAllPlayers.add(name);
            }
        }
        
        System.out.println("Players playing in world cup 2016");
        System.out.println(listOfAllPlayers);
        
        
        // Now let's do this in Java 8 using FlatMap
        List<String> flatMapList = playersInWorldCup2016.stream()
                                                        .flatMap(pList -> pList.stream())
                                                        .collect(Collectors.toList());
        
        System.out.println("List of all Players using Java 8");
        System.out.println(flatMapList);
    }

}