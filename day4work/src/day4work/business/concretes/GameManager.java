package day4work.business.concretes;

import day4work.business.abstracts.GameService;
import day4work.entities.concretes.Game;
import day4work.entities.concretes.User;

public class GameManager implements GameService {
	private User user;

	public GameManager(User user) {

		this.user = user;
	}

	@Override
	public void buy(Game game) {

		if (user.getBalance() >= game.getUnitPrice()) {
			System.out.println(game.getUnitPrice() + " TL de�erindeki " + game.getName() + " isimli oyun "
					+ user.getFirstName() + " taraf�ndan sat�n al�nd�!");
			System.out.print("Kalan bakiyeniz: ");
			System.out.print(user.getBalance() - game.getUnitPrice());
			System.out.println("\n");
		}
		else {System.out.println("Bu i�lem i�in bakiyeniz yetersiz ! ");}

	}

	@Override
	public void sell(Game game) {
		System.out.println(game.getUnitPrice() + " TL de�erindeki " + game.getName() + " isimli oyun iade edildi !");
		System.out.print("Kalan bakiye:");
		System.out.print(user.getBalance() + game.getUnitPrice());
	}

}