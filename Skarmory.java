import ru.ifmo.se.pokemon.*;

public class Skarmory extends Pokemon{
	public Skarmory() {
		super("Skarmory",65);
		setType(Type.FLYING, Type.STEEL);
		setStats(65.0,80.0,140.0,40.0,70.0,70.0);
		addMove(new BraveBird());
	}
}
