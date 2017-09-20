
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        for(int i = 0; i < 5; i++) {
          move();
          checkRoom(); 
        }
    }
    public void checkRoom() {
        if(nextToABeeper()) {
            checkRight();
            checkLeft();
        }
        else {
            eliminateVoters();
        }
    }
    public void checkRight() {
        faceNorth();
        move();
        if(!nextToABeeper()) {
            putBeeper();
        }
    }
    public void checkLeft() {
        faceSouth();
        move();
        move();
        if(!nextToABeeper()) {
            putBeeper();
        }
        faceNorth();
        move();
        faceEast();
        move();
    }
    public void eliminateVoters() {
        faceNorth();
        move();
        if(nextToABeeper()) {
            pickBeeper();
        }
        faceSouth();
        move();
        move();
        if(nextToABeeper()) {
            pickBeeper();
        }
        faceNorth();
        move();
        faceEast();
        move();
    }
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }
    }
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
}

