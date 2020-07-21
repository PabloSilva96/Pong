package serpente;

import java.util.logging.Level;
import java.util.logging.Logger;

public class movilidad extends Thread { ///////////////////////////////////mirar o videotutorial de q fai esto 
	private final game lamina;

	public movilidad(game lamina) {
		this.lamina = lamina;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				Logger.getLogger(movilidad.class.getName()).log(Level.SEVERE, null, ex);
			}
			lamina.repaint();
		}
	}
}
