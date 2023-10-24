import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
	public Slash() {
		super(Type.NORMAL, 70, 100);
	}
	protected String describe() {
		return "применяет способность Slash";
	}
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		double rnd = Math.random();
		if (rnd <= 0.125)
		{
			return 2.0;
		}
		return 1.0;
	}
}
