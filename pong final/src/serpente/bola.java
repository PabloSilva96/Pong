package serpente;

import java.awt.*;
import java.awt.geom.Ellipse2D;;

public class bola {
	private double x = 0;
	private double y = 0;
	private int xPos = 1, yPos = 1;
	private static final int ballSize = 15;
	private int score1 = 0, score2 = 0;
	public static boolean finJuego = false;
	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, ballSize, ballSize);
	}

	public void moverbola(Rectangle limites, boolean colisionR1, boolean colisionR2) {
		x += xPos;
		y += yPos;

		if (colisionR1) {
			xPos = +1;

		}
		if (colisionR2) {
			xPos = -1;

		}

		if (x < limites.getMinX()) { // se vai por a esquerda
			score2++;

			x = limites.getCenterX(); // saca desde o medio
			y = limites.getCenterY();
			xPos = -xPos; // saca hacia a dereita
			
		}

		if (x + ballSize >= limites.getMaxX()) { 
			score1++;

			x = limites.getCenterX();
			y = limites.getCenterY();
			xPos = -xPos;
		}

		if (y < limites.getMinY()) { // rebota abaixo

			y = limites.getMinY();

			yPos = -yPos;
		}

		if (y + ballSize >= limites.getMaxY()) {

			y = limites.getMaxY() - ballSize;

			yPos = -yPos;
		}
	}

	public int getScore1() {
		return score1;
	}

	public int getScore2() {
		return score2;
	}
}
