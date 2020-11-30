package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.sql.Time;
@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal1;
    private Animal animal2;
    private Timer time;

    public AnimalsCage(@Qualifier("cat") Animal animal1, @Qualifier("dog") Animal animal2, Timer time) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.time = time;
    }




    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString() +", " + animal2.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }


    public Timer getTimer() {
        return time;
    }
}
