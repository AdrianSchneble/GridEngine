package de.pixelmaster.gridengine.src.eventhandling;

public interface EventManager {
	public void fire(GameEvent event);

	public void register(EventHandler handler);

	public void unregister(EventHandler handler);

}
