package day4work.business.concretes;

import day4work.business.abstracts.UserService;
import day4work.entities.concretes.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+"isimli kullanýcý sisteme eklendi !");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+"isimli kullanýcý sistemden silindi !");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+"isimli kullanýcý bilgilerini güncelledi !");

		
	}

}
