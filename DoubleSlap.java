import ru.ifmo.se.pokemon.*;

public class DoubleSlap extends PhysicalMove {
	public DoubleSlap() {
		super(Type.NORMAL,15,85);
	}
	protected String describe() {
		return "применяет способность Double Slap";
	}
	protected double calcBaseDamage(Pokemon att, Pokemon def) {
		double dmg = 15.0;
		double rnd = Math.random();
		if (rnd <= 0.375) {
			dmg += 30;
		}
		rnd = Math.random();
		if (rnd <= 0.375) {
			dmg += 45;
		}
		rnd = Math.random();
		if (rnd <= 0.375) {
			dmg += 60;
		}
		rnd = Math.random();
		if (rnd <= 0.375) {
			dmg += 70;
		}
		return dmg;
	}
}
