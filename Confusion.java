import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {
	public Confusion() {
		super(Type.PSYCHIC, 50, 100);
	}
	protected String describe() {
		return "применяет способность Confusion";
	}
	protected void applyOppEffects(Pokemon p) {
		new Effect().chance(0.1).turns(4).confuse(p);
	}
}
