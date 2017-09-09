package de.pixelmaster.gridengine.src.generic;

import static org.junit.Assert.*;

import java.util.EventObject;
import java.util.Optional;

import org.hamcrest.core.Is;
import org.junit.Test;

import de.pixelmaster.gridengine.src.interfaces.eventhandling.EventHandler;

public class EventManagerTest implements EventHandler
{
	private Optional<Object> o = Optional.ofNullable(null);

	@Test
	public void getInformed()
	{
		EventManager eventManager = EventManager.getInstance();
		eventManager.register(this);

		Object object = new Object();

		eventManager.fire(new EventObject(object));

		assertTrue(o.isPresent());
		assertThat(o.get(), Is.is(object));
	}

	@Test
	public void getNotInformedIfUnregistered()
	{
		EventManager eventManager = EventManager.getInstance();
		eventManager.register(this);
		eventManager.unregister(this);

		Object object = new Object();

		eventManager.fire(new EventObject(object));

		assertFalse(o.isPresent());
	}

	@Override
	public void receiveEvent(EventObject event)
	{
		o = Optional.ofNullable(event.getSource());
	}
}
