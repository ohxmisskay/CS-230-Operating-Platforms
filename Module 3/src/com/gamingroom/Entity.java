package com.gamingroom;

public class Entity {
	
	// Private attributes
	private long id;
	private String name;

	
	// Added methods of Entity class based on UML Diagram
	// Default constructor
	private Entity() {
	}
	
	/**
	 * Constructor with an identifier and name
	 */
	public Entity(long id, String name) {
	this(); // Call default constructor
	this.id = id;
	this.name = name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
