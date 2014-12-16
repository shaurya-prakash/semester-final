import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Wanderer;

public class TestChallenge2 {
	// TODO Complete the Horse class, provided

	public static void main(String[] args) {
		Display.openWorld("maps/pasture.map");
            Display.setSize(15, 15);
		// TODO Create an instance of a Horse inside the pasture
		Horse shaurya = new Horse(5, 2);
      shaurya.wander(36, 7);
		shaurya.explode();
	}

}
