import ru.ifmo.se.pokemon.*;

public class SignalBeam extends SpecialMove {
	public SignalBeam() {
		super(Type.BUG, 75, 100);
	}
	protected String describe() {
		return "применяет способность Signal Beam";
	}
	protected void applyOppEffects(Pokemon p) {
		new Effect().chance(0.1).turns(4).confuse(p);
	}
}
