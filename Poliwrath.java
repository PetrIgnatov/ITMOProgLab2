import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl {
	public Poliwrath(String name, int lvl) {
		super(name, lvl);
		setType(Type.WATER, Type.FIGHTING);
		setStats(90.0,95.0,95.0,70.0,90.0,70.0);
		addMove(new DoubleSlap());
	}
}
