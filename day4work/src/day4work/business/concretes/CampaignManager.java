package day4work.business.concretes;

import day4work.business.abstracts.CampaignService;
import day4work.entities.concretes.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void applyCampaign(Game game) {
		System.out.println("Bu kampanyamýzda tüm oyunlarda %30 indirim geçerlidir..!");
		System.out.println("Oyunun normal fiyatý: " + game.getUnitPrice());
		double newPrice =game.getUnitPrice() * 0.7;
		System.out.println("Oyunun kampanyalý fiyatý: " + newPrice);
		game.setUnitPrice(newPrice);
		System.out.println("\n");

	}

}
