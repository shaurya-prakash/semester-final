import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Farmer;

public class TestChallenge3 {

	public static void main(String[] args) {
    
            Display.openWorld("maps/farm.map");
            Display.setSize(12, 12);
            
            BeepFarmer shaurya = new BeepFarmer();
            shaurya.teleport(3, 5);
            shaurya.reap(3, 5);
            

		// TODO Load the "farm" map at set its size to 12 by 12
		// TODO Create an instance of a BeepFarmer with no beepers, anywhere on the farm
		// TODO Have the farmer gather all the beepers from the garden plot in the center of the map
		// TODO Have the farmer drop at location (1, 1) all the beepers picked and then move aside.
	}

}
