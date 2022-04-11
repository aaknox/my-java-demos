package repos;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import models.Player;

@Repository
public class PlayerDaoImpl implements PlayerDao {
	private static Logger logger = Logger.getLogger(PlayerDaoImpl.class);

	@Override
	public List<Player> getAll() {
		//this logger is using the Object class to get info about the method being executed 
		//just like with the ReflectionsAPI
		logger.info(String.format("%s --> getting all players from database...", 
					getClass().getMethods()[0].getName()));
		
		List<Player> players = new ArrayList<>();
		
		players.add(new Player("Ash", "Ketchum", 250021));
		players.add(new Player("Misty", "Waters", 23098));
		players.add(new Player("Azhya", "Knox", 270022));
		players.add(new Player("Revature", "Associate", 50089));
		
		return players;
	}

}
