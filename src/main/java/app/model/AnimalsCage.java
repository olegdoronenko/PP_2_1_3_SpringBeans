package app.model;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AnimalsCage {

    @Autowired
    @Qualifier( "dog")
    private Animal animal1;

    @Autowired
    @Qualifier("cat")
    private Animal animal2;

    @Autowired
    @Qualifier("timer")
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString() +", " + animal2.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }

}
