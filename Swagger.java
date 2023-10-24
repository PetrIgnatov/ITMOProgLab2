import ru.ifmo.se.pokemon.*;

public class Swagger extends SpecialMove {
	public Swagger() {
		super(Type.NORMAL,0,85);
	}
	protected String describe() {
		return "применяет способность Swagger";
	}
	protected void applyOppEffects(Pokemon p) {
		new Effect().chance(0.1).turns(4).confuse(p);
		p.setCondition(new Effect().turns(2).stat(Stat.ATTACK, 2));
	}
}
