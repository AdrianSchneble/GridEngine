package de.pixelmaster.gridengine.src.lib;

/**
 * Saves a 2-dimensional array of Fields
 */
public interface Grid {

	public Field getField(int x, int y);

	public void setField(int x, int y, Field field);

}
