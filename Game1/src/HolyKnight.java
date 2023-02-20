public class HolyKnight extends Knight{

    void attack(Ogre ogre) {
		ogre.energy = (int) (0.5 * ogre.energy); // (int) just casts a float result into an int
        this.energy = (int) (1.1 * this.energy);
		ogre.revenge(this); // this represents a reference to the current knight object
		System.out.println(this); //Printing adress of current class
	}
}
