package de.pixelmaster.gridengine.src.interfaces.eventhandling;

import java.util.EventObject;

/**
 * 
 * This <u>has</u> to be a Singleton.
 *
 */
public interface EventManager {

	public void fire(EventObject event);

	public void register(EventHandler handler);

	public void unregister(EventHandler handler);

}
