import ru.ifmo.se.pokemon.*;

public class SilverWind extends SpecialMove {
	public SilverWind() {
		super(Type.BUG, 60, 100);
	}
	public String describe() {
		return "применяет способность Silver Wind";
	}
	protected void applySelfEffects(Pokemon p) {
		super.applyOppEffects(p);

		Effect boostAtt = new Effect().chance(0.1).turns(1).stat(Stat.ATTACK, 1);
		Effect boostDef = new Effect().chance(0.1).turns(1).stat(Stat.DEFENSE, 1);
		Effect boostSAt = new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_ATTACK, 1);
		Effect boostSDf = new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_DEFENSE, 1);
		Effect boostSpd = new Effect().chance(0.1).turns(1).stat(Stat.SPEED, 1);
		p.addEffect(boostAtt);
		p.addEffect(boostDef);
		p.addEffect(boostSAt);
		p.addEffect(boostSDf);
		p.addEffect(boostSpd);
	}
}
