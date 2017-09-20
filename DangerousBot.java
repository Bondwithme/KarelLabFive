
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int beepers;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        if(beepers%2==0) {
            turnRight();
            beeperPile();
        }
        else {
            turnLeft();
            beeperPile();
        }
    }
    public void beeperPile() {
        move();
        while(nextToABeeper()) {
            pickBeeper();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

