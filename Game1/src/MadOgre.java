public class MadOgre extends BadOgre{
    void revenge(Knight knight) {
		if (hungry)
			eat(knight);
            System.out.println("You made me mad");
	}
	void eat(Knight knight) {
		knight.energy = 0;
        this.energy += 20;
	}
}
