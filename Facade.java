import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
	public Facade() {
		super(Type.NORMAL,70,100);
	}
	protected String describe() {
		return "применяет способность Facade";
	}
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		if (att.getCondition() == Status.BURN || att.getCondition() == Status.POISON || att.getCondition() == Status.PARALYZE) {
			return 2.0;
		}
		return 1.0;
	}
}
