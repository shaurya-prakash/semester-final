import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Uberbot;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

	public Sentry()
  {
     super(1, 1, Display.NORTH, Display.INFINITY);
  }
   public Sentry(int x, int y)
  {
     super(x, y, Display.NORTH, Display.INFINITY);
  }
  
  
	public void patrol(int sideLength) {
   int k = 0;
   while (k == 0)
  {
    for (int z = 1; z <= 4; z++)
   {
    for (int a = 1; a <= sideLength; a++)
   {
    move();
   }
    turnRight();
   }
  }	
 }
}
