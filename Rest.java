import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
	public Rest() {
		super(Type.PSYCHIC, 0, 0);
	}
	protected String describe() {
		return "применяет способность Rest";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setCondition(new Effect().turns(2).condition(Status.SLEEP));
		p.setMod(Stat.HP, -6);
	}
}
