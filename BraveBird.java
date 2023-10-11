import ru.ifmo.se.pokemon.*;

public class BraveBird extends PhysicalMove {
	public BraveBird() {
		super(Type.FLYING, 120, 100);
	}
	protected String describe() {
		return "применяет способность Brave Bird";
	}
	public final void attack(Pokemon att, Pokemon def) {
		System.out.println("Тут могла быть ваша атака");
	}
}


