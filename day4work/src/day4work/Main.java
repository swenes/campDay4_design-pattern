package day4work;

import day4work.business.abstracts.CampaignService;
import day4work.business.abstracts.GameService;
import day4work.business.concretes.CampaignManager;
import day4work.business.concretes.GameManager;
import day4work.entities.concretes.Game;
import day4work.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("0123456789", "Enes", "Aydogdu", "2000", 200);
		
		Game game1 = new Game("PES 2013", 120);
		Game game2 = new Game("CS 1.6",80);

		GameService gameService = new GameManager(user1);
		
		CampaignService campaignService = new CampaignManager();
		campaignService.applyCampaign(game1);

		gameService.buy(game1);
		user1.setBalance(user1.getBalance()-game1.getUnitPrice());
		
		
		gameService.buy(game2);
		user1.setBalance(user1.getBalance()-game2.getUnitPrice());

		gameService.buy(game1);

	}
}
