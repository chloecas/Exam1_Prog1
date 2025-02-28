
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
        //int workedHours= 80;
        //double wage= 20.00;
        double taxes= 0.30;
        double grossSalary= workedHours * wage;
        double netSalary= grossSalary + (grossSalary * taxes);
        System.out.println(netSalary);
    }
}
