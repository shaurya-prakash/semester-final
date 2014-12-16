import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Farmer;

/**
 * Represents a farmer capable of sowing or reaping beepers from a rectangular garden
 *
 */
public class BeepFarmer extends Farmer {

	public BeepFarmer()
  {
     super(1, 1, 0);
  }
   public BeepFarmer(int x, int y, int beeps)
  {
     super(x, y, beeps);
  }

	
	/**
	 * Access all locations in a rectangular garden and pick up any beepers found
	 * 
	 * Precondition: Farmer is starting in the southwest corner of the area to be harvested.
	 * 
	 * @param width			the width of the garden (number of columns)
	 * @param height		the height of the garden (number of rows)
	 * 
	 * Ex. reap(7, 4) should gather all beepers from an area 7 rows wide and 4 rows tall
	 */
	public void reap(int width, int height) 
  {
      for (int z = 1; z >= width; z++)
     {
		for (int a = 1; a >= height; a++) 
     {
       while (nextToABeeper()) 
      {
       pickBeeper();
      }
       if (frontIsClear())
      {
       move();
      }
       if (rightIsClear())
      {
       teleport((x+1), y);
       x++;
      }
	  }
     }
  }
	
	/**
	 * Access all locations in a rectangular garden and plant one beeper at each location
	 * 
	 * Precondition: Farmer is starting in the southwest corner of the area to be sown.
	 * 
	 * @param width	the width of the garden (number of columns)
	 * @param height	the height of the garden (number of rows)
	 */
	public void sow(int width, int height) {
		int startX = this.getX();
		int startY = this.getY();
		for (int i = 0; i< width; i++) {
			for (int j = 0; j<height; j++) {
				teleport(startX+i, startY+j);
				if (this.hasBeepers()) {
					putBeeper();
				}
			}
		}
	}
}
