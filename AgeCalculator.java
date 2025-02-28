
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    private int currentYear = 2025;
    /*
     * I didn'ty put the value of current year and needeYears.
     * 
     */
    public int age( int birthYear){
        int age = birthYear - currentYear;
        return age;
        // if(age>=16){
            // System.out.println("The user can drive");
            // }
            // else {
                // int neededYears = 16 - age;
                // System.out.println("How many years the user has to wait to start driving: " + neededYears + "years");
            // }
        }
    }
    
