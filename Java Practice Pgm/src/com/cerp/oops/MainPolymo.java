package com.cerp.oops;

public class MainPolymo {

	public static void main(String[] args) {
		AnimalPolymo myAnimal = new AnimalPolymo();
		AnimalPolymo pigAnimal = new PigPolymo();
		AnimalPolymo dogAnimal = new DogPolymo();
		myAnimal.animalSound();
		pigAnimal.animalSound();
		dogAnimal.animalSound();
	}

}
