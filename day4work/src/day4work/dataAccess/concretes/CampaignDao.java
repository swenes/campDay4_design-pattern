package day4work.dataAccess.concretes;

import day4work.dataAccess.abstracts.ICampaignDao;
import day4work.entities.concretes.Campaign;

public class CampaignDao implements ICampaignDao{

	@Override
	public void add(Campaign campaign) {
System.out.println(campaign.getName()+" adl� kampanyam�z yeni geldi..!");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanyam�z sistemden silindi..!");		
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanyam�z� g�ncelledik..!");		
		
	}

	
}
