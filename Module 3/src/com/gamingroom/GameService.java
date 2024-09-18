package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	
	/*
	* Holds the next team identifier
	*/
	private static long nextPlayerId = 1;

	/*
	* Holds the next player identifier
	*/
	private static long nextTeamId = 1;
	
	
	// Private variable that tracks existence of GameService
	private static GameService service;

	// Default constructor
	private GameService() {
	}

	/**
	* Check for existing instance of GameService
	* @return
	*/
	public static GameService getInstance() {

		// If the GameService exist, create a new instance
		// Else, outputs information it already exists.
		if (service == null) {
			service = new GameService();
			System.out.println("A New Game Service was created.");
		} 
		else {
			System.out.println("Game Service already exists, cannot create new Game Service.");
		}

	// Returns instance
	return service;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		Iterator<Game> gamesIterator = games.iterator();

		// Iterate over list of games
		while (gamesIterator.hasNext()) {

			// Set local Game variable to next item in list
			Game gameInstance = gamesIterator.next();

			// If game name already exists, return the game instance
			if (gameInstance.getName().equalsIgnoreCase(name)) {
				return gameInstance;
			}
		}
		

		// If game instance is not found, 
		// make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return back to game instance
		return game;
	}

	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same id
		// If current game equates to ID, assigns instance to the local variable
		Iterator <Game> gamesIterator = games.iterator();

		// Iterate over list of games
		while (gamesIterator.hasNext()) {

			// Set local Game variable to next item in list
			Game gameInstance = gamesIterator.next();

			// If game id already exists, return the game instance
			if (gameInstance.getId() == id) {
				return gameInstance;
			}
			
		}
		
	// return back to game instance
	return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name
		// If same name is found, assign instance to the local variable
		Iterator<Game> gamesIterator = games.iterator();

		// Iterate over games list
		while (gamesIterator.hasNext()) {

			// Set local Game variable to next item in list
			Game gameInstance = gamesIterator.next();

			// If game name already exists, return the game instance
			if (gameInstance.getName().equalsIgnoreCase(name)) {
				game = gameInstance;
			}
		}
		
	// return back to game instance	
	return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	/**
	* Returns the player whose turn is next
	*
	* @return the player whose turn is next
	*/
	public long getNextPlayerId() {
	return nextPlayerId;
	}

	/**
	* Returns the team whose turn is next
	*
	* @return the team whose turn is next
	*/
	public long getNextTeamId() {
	return nextTeamId;
	}
	
}
