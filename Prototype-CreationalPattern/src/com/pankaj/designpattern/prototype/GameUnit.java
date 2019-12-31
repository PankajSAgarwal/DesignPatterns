package com.pankaj.designpattern.prototype;
import javafx.geometry.*;
/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
	
	private Point3D position;
	
	public GameUnit() {
		this.position = Point3D.ZERO;
	}
	
	
	
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit unit = (GameUnit)super.clone();
		unit.initilaize();
		return unit;
	}

	// reset the position to origin on clone
	
	protected void initilaize() {
		this.position = Point3D.ZERO;
		reset();
	}


	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}
	
	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}
	
	protected abstract void reset();

}
