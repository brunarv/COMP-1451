import java.util.ArrayList;
import java.util.Random;

/**
 * 
 */

/**
 * @author bruna
 *
 */
public class Kennel {
	
	private ArrayList<Dog> dogs; //type safe, avoid error with type data. It is checked on run time.
	
	public Kennel(){
		
		dogs = new ArrayList<Dog>();
	}
	
	public void addDog(Dog newDog){
		
		if(newDog != null){
			
			dogs.add(newDog);
		}
	}
	
	public void displayDogs(){
		
		for(Dog aDog : dogs){
			System.out.println(aDog.getName() + " " + aDog.getBreed()+ " " +  aDog.getAge());
		}
	}
	
	public Dog getRandomDog(){
		
		Random rand = new Random();
		
		return dogs.get(rand.nextInt(dogs.size()));
		//return dogs.remove(rand.nextInt(dogs.size()));
		
	}
	
	public void adopt(){
		
		Dog adoptedDog = getRandomDog();
		
		System.out.println(adoptedDog);
	}
}
