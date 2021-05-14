package day4work.business.abstracts;

import day4work.entities.concretes.User;

public interface UserService {

	
	void add(User user);
	void delete(User user);
	void update(User user);
}
