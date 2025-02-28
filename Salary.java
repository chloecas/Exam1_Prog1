
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    /**
     * Exam Answer question 14
     */
    public void getSalary(int workedHours, double wage)
    {
        double taxes= 0.30;
        double grossSalary= workedHours * wage;
        double netSalary= grossSalary - (grossSalary * taxes);
        System.out.println(netSalary);
    }
}
