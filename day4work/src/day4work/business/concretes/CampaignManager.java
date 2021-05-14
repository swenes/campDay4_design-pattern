package day4work.business.concretes;

import day4work.business.abstracts.CampaignService;
import day4work.entities.concretes.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void applyCampaign(Game game) {
		System.out.println("Bu kampanyam�zda t�m oyunlarda %30 indirim ge�erlidir..!");
		System.out.println("Oyunun normal fiyat�: " + game.getUnitPrice());
		double newPrice =game.getUnitPrice() * 0.7;
		System.out.println("Oyunun kampanyal� fiyat�: " + newPrice);
		game.setUnitPrice(newPrice);
		System.out.println("\n");

	}

}
