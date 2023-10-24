import ru.ifmo.se.pokemon.*;

public class AirCutter extends SpecialMove {
	public AirCutter() {
		super(Type.FLYING, 60, 95);
	}
	protected String describe() {
		return "применяет способность Air Cutter";
	}
}
