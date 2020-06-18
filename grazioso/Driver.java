//Andrew Vue
//IT-145 Project 2
//April, 2020

//Import Java Scanner class so that Scanner object will work
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;		//Java ArrayList class to facilitate ArrayList
import java.text.ParseException; //This is to create a place for the animal objects
import java.text.SimpleDateFormat;//This is so that the SimpleDateFormat class will work
import java.util.Date; // Date class to support Date types 


public class Driver {

    public static void main(String[] args) {

    	//Scanner object to get user inputs
    	Scanner scnr = new Scanner(System.in);
    	
    	//Place holder to test code
    	System.out.println("Grazioso Salvare\n" +
    			"International Rescue Animal Training Company\n");
    	
    	//Creating an option selection menu at the start to prompt user input/engagement
    	
    	String userOptions = "Please select one of the following.\n"
    			+ "R - Request for new service animal\n"
    			+ "U - Update existing animal records\n"
    			+ "P - Print animals by training phase\n"
    			+ "L - Print animals by location\n"
    			+ "I - Intake new animal\n"
    			+ "E - Process the end of service animal\n"
    			+ "Q - Quit application\n";
    	
    	char userSelection;
    	
    	ArrayList<RescueAnimal> animalStore = newArrayList<RescueAnimal>();
    	
    	System.out.println("Welcome to Grazioso Salvare International Rescue Animal Training Company.");
    	
    	/*Application START.
    	 * Presents user with an option menu to select processes they want
    	 */

    	System.out.println(optionsMenu);
    	
    	userSelection = scnr.hasNextLine().toUpperCase().charAt(0);
    	
    	//While loop is created to ensure program is ran through and the menu options are selected before quiting the program
    	while (userSelection != 'Q') {
    		break;
    	}
    	
    	if(userSelection == 'R') {
    		System.out.println("FIXME; Process request for a rescue animal (Not enought information)");
    	}
    	
    	if(userSelection == 'U') {
    		System.out.println("FIXME; Process request for a rescue animal (Not enought information)");
    	}
    	
    	if(userSelection == 'P') {
    		System.out.println("FIXME; Process request for a rescue animal (Not enought information)");
    	}
    	
    	if(userSelection == 'L') {
    		System.out.println("FIXME; Process request for a rescue animal (Not enought information)");
    	}
    	
    	if(userSelection == 'I') {
    		String animalTypeMenu = "Please select the animal type to process intake\n" 
    				+ "1 - Dog\n"
    				+ "2 - Monkey";
    		
    		System.out.println(animalTypeMenue);
    	}
    	
    	//nextInt() does not read the new line to get around this the input must be captured as a String then converted using Inter.parseInt
    	
    	int intakeSelection = Integer.parseInt(scnr.nextLine());
    	
    	//using a loop to process user input
    	
    	while(intakeSelection != 1 && intakeSelection != 2) {
    		System.out.println("Invalid selection.");
    		System.out.println(animalTypeMenu);
    		
    		intakeSelection = Integer.parseInt(scnr.nextLine());
    		System.out.println("Selection in Invalid Loop: " + intakeSelection);
    	}
    	
    	if(intakeSelection ==1) {
    		System.out.println("Dog Intake.");
    		Dog newAnimal = new Dog();
    		newAnimal.settype("dog");
    		
    		//add teh animal to the data store
    		animalStore.add(newAnimal);
    		
    		//call Method to add animal
    		intakeAnimal(newAnimal);
    		
    	}
    	
    	else {
    		System.out.println("Monkey Intake.");
    		Monkey newAnimal = new Monkey();
    		newAnimal.settype("monkey");
    		
    		//add the animal to the data store
    		animalStore.add(newAnimal);
    		
    		//call Method to add animal
    		intakeAnimal(newAnimal);
    	}
    	
    	if(userSelection == 'E') {
    		System.out.println("FIXME; Process request for a rescue animal (Not enought information)");
    	}
    	
    	
    	System.out.println(optionsMenu);
    	userSelection = scnr.hasNextLine().toupperCase().charAt(0);

    	
    System.out.println("Thank you for coming, good bye.");
    }    
    scnr.close();
    return;
}
        // Instance variables
    	String breed;
        String species;
        double tailLength;
        double height;
        double bodyLength;
        double measurementsForTorso;
        double measurementsForSkull;
        double measurementsForNeck;


        // Create New Dog
    	Dog dog1 = new Dog();
    	
    	// *aMethodFromSpecDoc placeholder
    	dog1.aMethodFromSpecDoc("Spike", "Beagle", "5");


        // Create New Monkey
    	Monkey monkey1 = new Monkey();
    	


    	// *aMethodFromSpecDoc place holder
    	
    	monkey1.aMethodFromSpecDoc("Capuchin", "momo", "red");
    	
    
        // Method to process request for a rescue animal
    	RescueAnimal RescueAnimal = new RescueAnimal();
    	RescueAnimal.requestRescueAnimal("animal", "animal");

        // Method(s) to update information on existing animals



        // Method to display matrix of animals based on location and status/training phase



        // Method to add animals



        // Method to out process animals for the farm or in-service placement



        // Method to display in-service animals



        // Process reports from in-service agencies reporting death/retirement



    }// outside of Main
    

}// outside of class
