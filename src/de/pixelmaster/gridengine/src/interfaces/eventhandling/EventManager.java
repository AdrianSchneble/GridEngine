package de.pixelmaster.gridengine.src.eventhandling;

import java.awt.Event;

/**
 * 
 * This <u>has</u> to be a Singleton.
 *
 */
public interface EventManager {

	public void getInstance();

	public void fire(Event event);

	public void register(EventHandler handler);

	public void unregister(EventHandler handler);

}
