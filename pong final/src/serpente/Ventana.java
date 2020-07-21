package serpente;

import javax.swing.JFrame;

@SuppressWarnings("serial") // sin esto non funcionan as clases que usan JFrame
public class Ventana extends JFrame {

	private final int ANCHO = 800, ALTO = 500;
	private game lamina;
	private movilidad hilo;

	public Ventana() {
		setTitle("Pong");
		setSize(ANCHO, ALTO);
		setLocationRelativeTo(null); //a ventana aparece no centro da pantalla
		setResizable(false); // o ampliar a ventana se descolocaba todo asique esto non deixa ampliala
		lamina = new game();
		add(lamina);
		addKeyListener(new teclado());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hilo = new movilidad(lamina); // hilo = Thread 
		hilo.start();

	}
}