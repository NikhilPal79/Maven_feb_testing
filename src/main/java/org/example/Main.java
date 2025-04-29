package org.example;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "nikhil","nikhil7@gmail.com");
        System.out.println(e1);



        Cricket cricket = new Cricket();
        cricket.play();
        System.out.println();
        cricket.work();

        ISport SportLambda = new ISport() {
            @Override
            public void play() {
                    System.out.println("PLAYING SPORT");
            }
        };

    }
}
