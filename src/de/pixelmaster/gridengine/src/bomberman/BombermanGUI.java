package de.pixelmaster.gridengine.src.bomberman;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventObject;

import javax.swing.JFrame;

import de.pixelmaster.gridengine.src.bomberman.events.TickEvent;
import de.pixelmaster.gridengine.src.generic.EventManager;
import de.pixelmaster.gridengine.src.interfaces.gui.GUI;

@SuppressWarnings("serial")
public class BombermanGUI extends JFrame implements GUI, KeyListener {

	public BombermanGUI() {
		setLayout(null);
		int width = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2);
		int height = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
		setSize(width, height);
		setLocation(width / 2, height / 2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.addKeyListener(this);
		EventManager.getInstance().register(this);

		setVisible(true);
	}

	@Override
	public void receiveEvent(EventObject event) {
		if (event instanceof KeyEvent) {
			KeyEvent kevent = (KeyEvent) event;
			System.out.println(kevent.getKeyChar());
		} else if (event instanceof TickEvent) {
			System.out.println("Tick");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		EventManager.getInstance().fire(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
