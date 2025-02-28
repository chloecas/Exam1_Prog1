
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int currentYear= 2025;

    /**
     * Exam Question 15
     */
    public void getAge(int yearOfBirth)
    {
        int age= currentYear-yearOfBirth;
        if(age>=16){
            System.out.println("User is "+age + " years old. They can drive");
        }
        else {
            int yearsLeft= 16- age;
            System.out.println("User is " +age +" years old. They must wait "
            + yearsLeft+ "before eligible.");
        }
    }
}
