import ru.ifmo.se.pokemon.*;

public class Main {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon p1 = new Venomoth("Venomoth", 1);
		Pokemon p2 = new Skarmory("Skarmory", 1);
		Pokemon p3 = new Poliwag("Poliwag", 1);
		Pokemon p4 = new Poliwrath("Poliwrath", 1);
		Pokemon p5 = new Venonat("Venonat", 1);
		Pokemon p6 = new Poliwhirl("Poliwhirl", 1);
		b.addAlly(p1);
		b.addFoe(p2);
		b.addFoe(p3);
		b.addAlly(p4);
		b.addFoe(p5);
		b.addAlly(p6);
		b.go();
	}
}
