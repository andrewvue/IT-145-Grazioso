//Andrew Vue
//IT-145 Project 2
//April, 2020
public class Monkey extends RescueAnimal{

	 // Instance variable
    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;
    private double measurementsForTorso;
    private double measurementsForSkull;
    private double measurementsForNeck;
    

    // Constructor
    public Monkey() {
    }

    // Accessor Method
    public String getSpecies() {
        return species;
    }
    
    public double gettailLength() {
    	return tailLength;
    }
    
    public double getheight() {
    	return height;
    }
    
    public double getbodyLength() {
    	return bodyLength;
    }
    
    public double getmeasurementsForTorso() {
    	return measurementsForTorso;
    }
    
    public double getmeasurementsForSkull() {
    	return measurementsForSkull;
    }
    
    public double getmeasurementsForNeck() {
    	return measurementsForNeck;
    }

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        this.species = monkeySpecies;
    }
    
    public void settailLength(double tailLength) {
    	this.tailLength = tailLength;
    }
    
    public void setheight(double height) {
    	this.height = height;
    }
    
    public void setbodyLength(double bodyLength) {
    	this.bodyLength = bodyLength;
    }
    
    public void setmeasurementsForTorso(double measurementsForTorso) {
    	this.measurementsForTorso = measurementsForTorso;
    }
    
    public void setmeasurementsForSkull(double measurementsForSkull) {
    	this.measurementsForSkull = measurementsForSkull;
    }
    
    public void setmeasurementsForNeck(double measurementsForNeck) {
    	this.measurementsForNeck = measurementsForNeck;
    }
    
	public void aMethodFromSpecDoc(String species, String string2, String string3) {
		System.out.println("A method place holder from Spec Doc");
	}
		// TODO Auto-generated method stub
	
    public void bMethodFromSpecDoc(String species,String double1, String double2) {
    	System.out.println("B method place holder from Spec Doc");
    }
    
}
//Attribute: tail length, height, body length, species, and measurements for torso, skull, and neck.