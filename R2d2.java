package r2d2;
import robocode.*;
import java.awt.Color;

/**
 * r2d2 - a class by (rodrigo nascimento)
 */
public class R2d2 extends Robot {
	public void run() {
			setColors(Color.darkGray, Color.black, Color.lightGray, Color.white, Color.green);
			while (true){
				ahead(100);
			    turnRight(90);
				
			}
		}
		//TANK ROBO INIMIGO DETECTADO
		public void onScannedRobot(ScannedRobotEvent e) {
        	fire(1);
			}
		}
		
		
	//COLISÃO COM A PAREDE
	public void onHitWall(HitWallEvent e){
		back(50);
		turnRight(90);
	}
}

	

