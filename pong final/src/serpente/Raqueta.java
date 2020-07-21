package serpente;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Raqueta {

	private int x, y;
	static final int ANCHO = 10, ALTO = 40;

	public Raqueta(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Rectangle2D getRaqueta() {
		return new Rectangle2D.Double(x, y, ANCHO, ALTO);
	}

	public void moverR1(Rectangle limites) {
		if (teclado.w && y > limites.getMinY()) {
			y--;
		}
		if (teclado.s && y < limites.getMaxY() - ALTO) { //se lle resta a altura para que non se sala da ventana
			y++;
		}
	}

	public void moverR2(Rectangle limites) {
		if (teclado.arriba && y > limites.getMinY()) {
			y--;
		}
		if (teclado.abaixo && y < limites.getMaxY() - ALTO) {
			y++;
		}
	}
}