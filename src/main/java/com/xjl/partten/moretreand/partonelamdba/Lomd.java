package com.xjl.partten.moretreand.partonelamdba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by xiaojinlu1990@163.partten on 2019/11/24.
 *
 * Java8 lambda表达式  专题
 */
public class Lomd {
    private  final static Logger log = LoggerFactory.getLogger(Lomd.class);


    //替代匿名内部类
    public static void inClassNewAndOld(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("old");
            }
        }).start();
        new Thread(() -> {
            System.out.println("new ");
        }).start();
    }
    //使用lambda表达式对集合进行迭代
    public static void collectionIterateNewAndOld(){
        List<String> list = Arrays.asList("111","222","333");
        for (String str:list) {
            System.out.println(str);
        }
        list.forEach(x -> {
            System.out.println(x);
        });
        list.forEach(System.out::println);
    }
    //用lambda表达式实现map
    public static void mapIterateNewAndOld(){
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);

        double sum = 0;
        for(double each:cost) {
            each += each * 0.05;
            sum += each;
        }
        System.out.println(sum);


        cost.stream().map(x -> x + x*0.05).forEach(x -> System.out.println(x));
    }

    //用lambda表达式实现map与reduce
    public static void mapReduceTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        double allCost = cost.stream().map(x -> x+x*0.05).reduce((sum,x) -> sum + x).get();
        System.out.println(allCost);
    }
    //filter操作
    public static void filterTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0,40.0);
        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0 && x <10).collect(Collectors.toList());
        filteredCost.forEach(x -> System.out.println(x));

    }
    //与函数式接口Predicate配合
    public static void filterTest(List<String> languages, Predicate<String> condition) {
        languages.stream().filter(x -> condition.test(x)).forEach(x -> System.out.println(x + " "));
    }

    public static void main(String[] args) {
      /*  List<String> languages = Arrays.asList("Java","Python","scala","Shell","R");
        System.out.println("Language starts with J: ");
        filterTest(languages,x -> x.startsWith("J"));
        System.out.println("\nLanguage ends with a: ");
        filterTest(languages,x -> x.endsWith("a"));
        System.out.println("\nAll languages: ");
        filterTest(languages,x -> true);
        System.out.println("\nNo languages: ");
        filterTest(languages,x -> false);
        System.out.println("\nLanguage length bigger three: ");
        filterTest(languages,x -> x.length() > 4);*/
        filterTest();
    }
}
