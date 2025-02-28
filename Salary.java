
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    /*
     * 1) get the values of worked hours and hourly wage.
     * 2) set taxes and dedcutions to 0.3.
     * 3) set total salary to worked hours * hourly wage.
     * 4) set net payt to total salary - (total salary * dedcution)
     * 5) Print " what the employee really gets; after taxes being deducted: " +
     * net pay. 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */    
    
    public void getSalary(int hours, double wage){
        double totalSalary = hours * wage;
        double deduction = 0.3;
        double netPay;// should be printed
        netPay = totalSalary - (totalSalary * deduction);
        System.out.println("What the employee relly gets;  " + netPay);
        
    }

    
    
    
   
    
    
    
}

