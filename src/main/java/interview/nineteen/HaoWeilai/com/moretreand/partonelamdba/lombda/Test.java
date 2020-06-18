package interview.nineteen.HaoWeilai.com.moretreand.partonelamdba.lombda;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import interview.nineteen.HaoWeilai.com.moretreand.partonelamdba.lombda.testentity.Aaa;
import interview.nineteen.HaoWeilai.com.moretreand.partonelamdba.lombda.testentity.Bbb;
import interview.nineteen.HaoWeilai.com.moretreand.partonelamdba.lombda.testentity.Ccc;
import io.micrometer.core.instrument.util.JsonUtils;
import org.checkerframework.checker.units.qual.C;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
        List list = Lists.newArrayList();
        List sona = Lists.newArrayList();
        List sonb = Lists.newArrayList();
        List sonc = Lists.newArrayList();

        list.add(sona);
        list.add(sonb);
        list.add(sonc);

        Map<String,String> map = Maps.newConcurrentMap();

        for(Map.Entry<String, String> it : map.entrySet()){
            System.out.println(it.getKey()+"="+it.getValue());
            System.out.println(it);
        }
        map.put("2","333");
        map.put("3","333");
        map.put("5","222");

        Map<String,String> maps = Maps.newConcurrentMap();
        maps.put("444","222");
        maps.put("3","333");
        maps.put("5","2");

        for(Map.Entry<String, String> it : map.entrySet()){
           String dayKey = maps.get(it.getKey())==null?"0":maps.get(it.getKey());
            BigDecimal realTimePrice=new BigDecimal(dayKey);
            BigDecimal clientPrice=new BigDecimal(it.getValue());
            if(realTimePrice.compareTo(clientPrice) != 0){
                System.out.println("放假变动");
            }
        }






    }

    private static void lma() {
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