import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    private ArrayList<Bird> zooBirds;
    
    // int countBlueBirds(){
         // int countedBlueBirds = 0;
         // // search ("Blue");
         // // while (found){
             // // countedBlueBirds ++;
         // }
    public Zoo(){
        zooBirds = new ArrayList<>();
        zooBirds.add(new Bird ("blue", "BlueJay", 2));
    }
    int countBlueBirds(){
        int count = 0;
        for(Bird filename : zooBirds){
            if(filename.getColor().equals("Blue")){
                count++;                
            }
        }
        return count;
    }  
}

