/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    // Put your own methods here    
    public void setupBowling(){
       lineOne();
        lineTwo();
        lineLast(); 
    }
    
    public void lineOne() {
  plant();
 hop();
  hop();
  plant();
  hop();
  hop();
  plant();
  hop();
  hop();
  plant();
  turn(RIGHT);
  hop();
  turn(RIGHT);
  hop();
}
public void lineTwo() {
  plant();
  hop();
  hop();
  plant();
  hop();
  hop();
  plant();
  turn(LEFT);
  hop();
  turn(LEFT);
  hop();
}
public void lineLast() {
  plant();
  hop();
  hop();
  plant();
  turn(RIGHT);
  hop();
  turn(RIGHT);
  hop();
  plant();
  hop();
}
    
    


    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}
