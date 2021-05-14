package day4work.dataAccess.abstracts;

import day4work.entities.concretes.Campaign;

public interface ICampaignDao {

	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	
}
