//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package exercises;

public class Harry {
	private boolean cloakOn;

	public void Harry() {
		System.out.println("making Harry Potter...");
	}

	private Harry(boolean cloakOn) {
		this.cloakOn = cloakOn;
	}

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		if (this.cloakOn) {
			System.out.println("Harry is invisible");
		} else {
			System.out.println("Harry is visible");
		}

	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {

		exercises.Harry HarriPuttar = new exercises.Harry(false);

		HarriPuttar.Harry();
		HarriPuttar.makeInvisible(true);
		HarriPuttar.spyOnSnape();
		HarriPuttar.makeInvisible(false);
		HarriPuttar.castSpell("stupefy");




	}
}
