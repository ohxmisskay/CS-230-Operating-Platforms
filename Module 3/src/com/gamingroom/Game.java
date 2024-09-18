package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

// Inherits Entity class
public class Game extends Entity {
	
	/**
	* Creates a list of active teams
	*/
	private List<Team> teams = new ArrayList<Team>();
	
	/**
	* Constructor with an identifier and name
	*/
	public Game(long id, String name) {
	super(id, name);
	}
	
	/**
	* Uses iterator pattern to find existing team with same name or
	* adds unique named team to list
	*
	* @param name
	* @return Team instance
	*/
	public Team addTeam(String name) {

	// a local team instance
	Team team = null;

	// Instance iterator
	Iterator<Team> teamsIterator = teams.iterator();

	// Iterate over teams list
	while (teamsIterator.hasNext()) {
		
		// Set local Team variable to next item in list
		Team teamInstance = teamsIterator.next();
		
		// If team name already exists, return the team instance
		// or else it will add the team to the team list
		if (teamInstance.getName().equalsIgnoreCase(name)) {
			team = teamInstance;
			} 
		else {
			teams.add(team);
		}
	}

	
	return team;
	}
	


	@Override
	public String toString() {
		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
		}

}
