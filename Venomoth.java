import ru.ifmo.se.pokemon.*;

public class Venomoth extends Venonat {
	public Venomoth(String name, int lvl) {
		super(name, lvl);
		addMove(new SilverWind());
	}
}
