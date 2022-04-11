package services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Player;
import repos.PlayerDao;
import java.lang.reflect.*;

@Service
public class PlayerService {
	private static Logger logger = Logger.getLogger(PlayerService.class);
	
	private PlayerDao playerDao;
	
	@Autowired //this is using constructor injection here
	//autowired takes care of deps for this instance for us
	public PlayerService(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}
	
	public List<Player> getAllPlayers(){
		//this is using the ReflectionsAPI
		//used to examine/modify the behavior of methods, classes, interfaces at runtime
		//here we are using a generic class to make a instance of PlayerService
		Class<?> ps = PlayerService.class;
		Method[] methods = ps.getMethods();
		logger.info(String.format("%s --> service call to get a list of players...", 
					methods[0].getName()));
		return playerDao.getAll();
	}
}
