import java.util.ArrayList;
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private ArrayList<Bird> zooBirds;

    /**
     * Constructor for objects of class Zoo
     */
    public Zoo()
    {
        // initialise instance variables
        zooBirds = new ArrayList<>();
        zooBirds.add(new Bird("blue", "blue jay", 2));
        zooBirds.add(new Bird("red", "red cardinal", 1));
        zooBirds.add(new Bird("blue", "blue jay", 2));
        zooBirds.add(new Bird("red", "red cardinal", 1));
        zooBirds.add(new Bird("blue", "blue jay", 2));
        zooBirds.add(new Bird("red", "red cardinal", 1));
        zooBirds.add(new Bird("blue", "blue jay", 2));
        zooBirds.add(new Bird("red", "red cardinal", 1));
    }

    /**
     * Exam Question 16
     */
    public int countBlueBirds() {
        int blueBirds= 0;
        for(Bird b: zooBirds) {            
            if(b.color.equals("blue")) {
                blueBirds= blueBirds +1;
                System.out.println(blueBirds);
            } 
    }
    return blueBirds;
    }   
}

