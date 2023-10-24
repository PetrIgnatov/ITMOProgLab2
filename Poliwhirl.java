import ru.ifmo.se.pokemon.*;

public class Poliwhirl extends Poliwag {
	public Poliwhirl(String name, int lvl) {
		super(name, lvl);
		setType(Type.WATER);
		setStats(65.0,65.0,65.0,50.0,50.0,90.0);
		addMove(new WakeUpSlap());
	}
}
