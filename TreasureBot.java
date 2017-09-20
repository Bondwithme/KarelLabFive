
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    //1 beeper means karel should go north, 2 means east, 3 means south, 4 means west
    public int beepers;
    public boolean treasureFound;
    public void findTreasure() {
      treasureFound = false;
      while(treasureFound == false) {
        while(!nextToABeeper()) {
            move();
        }
        if(nextToABeeper()) {
            while(nextToABeeper()) {
                pickBeeper();
                beepers++;
            }
            if(beepers==1) {
                faceNorth();
            }
            else if(beepers==2) {
                faceEast();
            }
            else if(beepers==3) {
                faceWest();
            }
            else if(beepers==4) {
                faceSouth();
            }
            else if(beepers==5) {
                treasureFound = true;
            }
            beepers=0;
        }
      } 
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

