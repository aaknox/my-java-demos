package drivers;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import models.Player;
import services.PlayerService;

public class MainDriver {

	static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		PlayerService playerService = appContext.getBean(PlayerService.class);
		
		List<Player> list = playerService.getAllPlayers();
		
		System.out.println("\nPlayer Summary:");
		list.forEach((Player player) -> {
			System.out.println(String.format("%s %s has a high score of %d.", player.getFirstName(), player.getLastName(), player.getHighScore()));
		});
	}

}
