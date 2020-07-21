package serpente;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class game extends JPanel {

	Raqueta r1 = new Raqueta(10, 150);
	Raqueta r2 = new Raqueta(794 - 10 - Raqueta.ANCHO, 150);
	bola b = new bola();

	public game() {
		this.setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.WHITE);
		puntuacion(g2);
		dibujar(g2);

	}

	private void dibujar(Graphics2D g) {
		Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(),
				getBounds().getMaxY()); // posiciona a linea exactamente no medio

		g.draw(linea);

		g.fill(r1.getRaqueta());
		update();

		g.fill(r2.getRaqueta());
		update();

		g.fill(b.getShape());
		update();
	}

	private void update() {

		b.moverbola(getBounds(), colision(r1.getRaqueta()), colision(r2.getRaqueta()));

		r1.moverR1(getBounds());
		r2.moverR2(getBounds());
	}

	private boolean colision(Rectangle2D r) {
		return b.getShape().intersects(r);
	}

	private void puntuacion(Graphics2D g) {

		Font score = new Font("Comic Sans", Font.BOLD, 30);
		g.setFont(score);

		g.drawString(Integer.toString(b.getScore1()), (float) getBounds().getCenterX() - 50, 30); // dereita
		g.drawString(Integer.toString(b.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        if (b.getScore1() == 5) {
            g.drawString("PLAYER 1 WINS  GAME OVER", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            bola.finJuego = true;
        }
        if (b.getScore2() == 5) {
            g.drawString("PLAYER 2 WINS  GAME OVER", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            bola.finJuego = true;
        }
		
	}

}
