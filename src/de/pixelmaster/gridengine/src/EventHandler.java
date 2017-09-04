package de.pixelmaster.gridengine.src;

import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.MouseEvent;

public interface EventHandler {
	public void onKeyPressedEvent(KeyEvent event);

	public void onMouseAction(MouseEvent event);

	public void onStart(GameEvent event);

	public void onTick(GameEvent event);
}
