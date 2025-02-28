
/**
 * Write a description of class Bird here.
 *
 * @author Chloe Castrataro
 * @version 02/28/2025
 */
public class Bird
{
    private String color;
    private String breed;
    private int age;

    /**
     * Constructor for objects of class Bird
     */
    public Bird(String color, String breed, int age)
    {
        this.color = color;
        this.breed= breed;
        this.age= age;
    }

    /**
     *
     */
    public void sing()
    {
        System.out.println("Bird vocalization in action...");
    }
}
