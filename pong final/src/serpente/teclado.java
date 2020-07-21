package serpente;

import java.awt.event.*;

public class teclado extends KeyAdapter {
	static boolean w, s, arriba, abaixo;

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			w = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			s = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			arriba = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			abaixo = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			w = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			s = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			arriba = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			abaixo = false;
		}
	}

}
