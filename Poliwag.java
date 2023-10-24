import ru.ifmo.se.pokemon.*;

public class Poliwag extends Pokemon {
	public Poliwag(String name, int lvl)
	{
		super(name, lvl);
		setType(Type.WATER);
		setStats(40,50,40,40,40,90);
		addMove(new Facade());
		addMove(new Rest());
	}
}
