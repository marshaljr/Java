package work6feb;

class Animal {
	void sound() {
		System.out.println("Some Animal Sound");
	}

}

class Dog extends Animal {
	void sound() {
		System.out.println("Bark");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("Meow");
	}

}

