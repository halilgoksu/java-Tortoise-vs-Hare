import java.util.Scanner;
import java.io.IOException;


public class Race {
    private Track track;
    private boolean raceOver;

    public Race(){
        track=new Track();
        new Tortoise(0,0,"Tortoise");
        new Hare(0,1,"Hare");
        new Horse(0,2, "Horse");
        raceOver=false;

    }
    public  void racing(){
        setUpRace();
        do {
            Scanner s=new Scanner(System.in);
            s.hasNextLine();
            for (Runner runner:Runner.allRunners){
                runner.calculateMove();
                track.runnerPosition(runner);
                System.out.println(runner.moveDescription);


            if (runner.isWinner(runner)){
                raceOver=true;
            }

            }
            track.displayRaceTrack();


        }while (!raceOver);
        getPlace();
    }

    private void getPlace(){
        for (Runner runner:Runner.allRunners){
            if (runner.currentPosition==Track.TRACK_LENGTH){
                System.out.println("The winner(s) is : "+ runner.name);

            }
        }

    }


    private void setUpRace(){
        for (Runner runner:Runner.allRunners){
            track.runnerPosition(runner);
            System.out.println(runner.moveDescription);
        }
        track.displayRaceTrack();
    }




}
