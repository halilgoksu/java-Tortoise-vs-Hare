
import  java.util.List;
import java.util.ArrayList;
import java.util.Random;

public abstract class Runner {
    private static Random rand=new Random();
    public int origPosition;
    public String runnerSymbol;
    public int currentPosition;
    public int lane;
    public String name;
    public String moveDescription;
    public static List<Runner> allRunners=new ArrayList<Runner>();

    public int getMoveType(){
        return rand.nextInt(100)+1;

    }

    public void makeMove(int spaces){
        origPosition=currentPosition;
        if (currentPosition+spaces<0){
            currentPosition=0;

        } else if (currentPosition+spaces>Track.TRACK_LENGTH) {
            currentPosition=Track.TRACK_LENGTH;

        }else {
            currentPosition=+spaces;
        }
    }

 public  boolean isWinner(Runner runner){
   if (runner.currentPosition==Track.TRACK_LENGTH)
       return true;
   return false;
 }

public abstract void calculateMove();



}
