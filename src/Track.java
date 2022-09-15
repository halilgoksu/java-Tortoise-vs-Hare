

public class Track {
    public static final int TRACK_LENGTH=15;
    public  static final int NUM_OF_RUNNERS=3;

    public String[][] tracks;
    public Track(){
        tracks= new String[TRACK_LENGTH+1][NUM_OF_RUNNERS];

    }

    public void displayRaceTrack(){
        System.out.println("");
        for(int i=0;i<=TRACK_LENGTH; i++){
            System.out.print(" | ");

            for (int c=0;c<NUM_OF_RUNNERS;c++){
                if(tracks[i][c] ==null){
                    System.out.print(" | ");
                }else {
                    System.out.print(tracks[i][c]+ " | ");
                }
            }
            System.out.println("");
        }
    }

    public void runnerPosition(Runner runner){
        tracks[runner.origPosition][runner.lane]=null;
        tracks[runner.currentPosition][runner.lane]=runner.runnerSymbol;



    }



}
