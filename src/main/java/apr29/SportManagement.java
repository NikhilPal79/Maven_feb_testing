package apr29;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SportManagement {

/// how to modify the local variable use atmomic
    int counter = 0;

    public void run(){


        AtomicInteger counter = new AtomicInteger(0);

        AtomicReference<SportManagement> counter1 = new AtomicReference<>(new SportManagement());
        int random = Integer.valueOf( (int)(Math.random()*10.0));

        IPlay play = () -> System.out.println("Playing " + counter.get()+1  + " time");

        for (int i = 0; i < random; i++) {
            play.play();

        }
    }
}
