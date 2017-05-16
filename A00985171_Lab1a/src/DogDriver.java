
public class DogDriver {

	public static void main(String[] args) {
		
		new DogDriver().run();
	}

	public void run(){
		
		Dog dog1 = new Dog("Darby", "GDS", 10);
		Dog dog2 = new Dog("Myia", "Beagle", 5);
		Dog dog3 = new Dog("Luna", "GDS", 3);
		
		Kennel theKennel = new Kennel();

		theKennel.addDog(null);
		theKennel.addDog(dog1);
		theKennel.addDog(dog2);
		theKennel.addDog(dog3);
		
		theKennel.displayDogs();
		
		theKennel.adopt();
		
		theKennel.displayDogs();
	}
	
	
}
