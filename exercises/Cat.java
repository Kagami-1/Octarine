//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package exercises;

public class Cat {
	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (this.name == null) {
			System.out.println("i don't know my own name!");
		} else {
			System.out.println("my name is " + this.name);
		}

	}

	void kill() {
		--this.lives;
		if (this.lives > 0) {
			System.out.println("nice try, but I still have " + this.lives + " lives left");
		} else if (this.lives < 0) {
			System.out.println("that's overkill yo!");
		} else {
			System.out.println("DEAD CAT :(");
		}

	}

	public static void main(String[] args) {

		exercises.Cat niggre = new exercises.Cat("niggre");

		niggre.meow();
		niggre.printName();
		niggre.kill();
		niggre.kill();
		niggre.kill();
		niggre.kill();
		niggre.kill();
		niggre.kill();
		niggre.kill();
		niggre.kill();
		niggre.kill();
		niggre.kill();

	}
}
