import ru.ifmo.se.pokemon.*;

public class Skarmory extends Pokemon{
	public Skarmory(String name, int lvl) {
		super(name, lvl);
		setType(Type.FLYING, Type.STEEL);
		setStats(65.0,80.0,140.0,40.0,70.0,70.0);
		addMove(new BraveBird());
		addMove(new AirCutter());
		addMove(new AerialAce());
		addMove(new Slash());
	}
}
