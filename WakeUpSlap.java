import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
	public WakeUpSlap() {
		super(Type.FIGHTING, 70, 100);
	}
	protected String describe() {
		return "применяет способность Wake-Up Slap";
	}
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		if (def.getCondition() == Status.SLEEP) {
			return 2.0;
		}
		return 1.0;
	}

}
