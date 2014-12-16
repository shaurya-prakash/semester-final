import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Wanderer;

public class Horse extends Wanderer {

	public Horse()
  {
     super(1, 1);
  }
   public Horse(int i, int j)
  {
     super(i, j);
  }
  
	public void wander(int count, int timer) {
      int a = 1;
      int numTimes = count / timer;
      for (int z = 1; z <= numTimes; z++) {
		while (a <= timer && a <= count) 
     {
      wander();
      a++;
     }
      putBeeper();
      a = 1;
     }
	}
}
