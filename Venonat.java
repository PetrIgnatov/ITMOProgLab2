import ru.ifmo.se.pokemon.*;

public class Venonat extends Pokemon {
	public Venonat(String name, int lvl) {
		super(name, lvl);
		setType(Type.BUG, Type.POISON);
		setStats(60.0,55.0,50.0,40.0,55.0,45.0);
		addMove(new Confusion());
		addMove(new SignalBeam());
		addMove(new Swagger());
	}
}
