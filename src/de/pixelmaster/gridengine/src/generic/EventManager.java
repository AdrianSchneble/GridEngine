package de.pixelmaster.gridengine.src.generic;

import java.util.EventObject;
import java.util.HashSet;
import java.util.Set;

import de.pixelmaster.gridengine.src.interfaces.eventhandling.EventHandler;


public class EventManager implements de.pixelmaster.gridengine.src.interfaces.eventhandling.EventManager {

	private static EventManager instance;
	private Set<EventHandler> eventHandlers;

	static {
		instance = new EventManager();
	}

	private EventManager() {
		this.eventHandlers = new HashSet<EventHandler>();
	}

	public static EventManager getInstance() {
		return instance;
	}

	public void fire(EventObject event) {
		for (EventHandler handler : eventHandlers) {
			handler.receiveEvent(event);
		}
	}

	public void register(EventHandler handler) {
		eventHandlers.add(handler);
	}

	public void unregister(EventHandler handler) {
		eventHandlers.remove(handler);
	}

}
