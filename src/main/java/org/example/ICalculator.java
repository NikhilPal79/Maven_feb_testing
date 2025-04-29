package org.example;


@FunctionalInterface /// only do validation
public interface ICalculator {
    void calculator();
    default void play(){
        System.out.println("playing calculator");
    };
    default void work(){
        System.out.println("working");
    };

    ///  add default

    static void info(){
        System.out.println("calculator info");
    }
}
