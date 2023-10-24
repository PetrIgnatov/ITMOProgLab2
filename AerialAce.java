import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
	public AerialAce() {
		super(Type.FLYING, 60, 1000000);
	}
	protected String describe() {
		return "применяет способность Aerial Ace";
	}
}
