import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Squarebot;

public class TestChallenge1 {   

	public static void main(String[] args) {
   		Squarebot shaurya = new Squarebot(9, 3);
         shaurya.layCorners(5);
         Sentry alex = new Sentry(4, 3);
		   alex.patrol(5);
	}

}
