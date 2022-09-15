
public class Horse extends Runner{

    public Horse(int currentPosition, int lane, String name){

        this.currentPosition=currentPosition;
        this.lane=lane;
        this.name=name;
        runnerSymbol="Z";
        moveDescription=name+" is Ready! SET GO";
        allRunners.add(this);
    }
    @Override
    public void calculateMove(){
        int move=getMoveType();

        if (move>=1 && move<=50){
            makeMove(MoveType.FAST_PLOD);
            moveDescription=name+ " moved Fast Plod(+3)";

        } else if (move>=51&& move<=70) {
            makeMove(MoveType.SLIP);
            moveDescription=name+ " Slipped (-6)";


        }else {
            makeMove(MoveType.SLOW_PLOD);
            moveDescription=name+ " moved Slow Plod(+1)";

        }

    }

}
