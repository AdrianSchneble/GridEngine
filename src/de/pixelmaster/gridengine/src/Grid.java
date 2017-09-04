package de.pixelmaster.gridengine.src;

public interface Grid {
	public Field getField(int x, int y);

	public void setField(int x, int y, Field field);
}
