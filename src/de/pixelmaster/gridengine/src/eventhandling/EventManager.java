package de.pixelmaster.gridengine.src;

public interface EventManager {
	public void fire(GameEvent event);

	public void register(EventHandler handler);

	public void unregister(EventHandler handler);

}
