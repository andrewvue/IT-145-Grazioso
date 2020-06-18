//Andrew Vue
//IT-145 Project 2
//April, 2020
import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    }

 // Add Accessor Methods/Getters here
    public String getname(String name) {
    	return name;
    }
    
    public String gettype(String type) {
    	return type;
    }
    
    
    public String getgender(String gender) {
    	return gender;
    }
    
    public int getage(int age) {
    	return age;
    	
    }
    
    public float getweight(float weight) {
    	return weight;
    }
    
    public SimpleDateFormat getacquisitionDate(SimpleDateFormat acquisitionDate) {
    	return acquisitionDate;
    }
    
    public  SimpleDateFormat getstatusDate(SimpleDateFormat statusDate) {
    	return statusDate;
    }
    
    public String getacquisitionSource(String acquisitionSource) {
    	return acquisitionSource;
    }
    public Boolean getreserved(Boolean reserved) {
    	return reserved;
    }

    public String gettrainingLocation(String trainingLocation) {
    	return trainingLocation;
    }
    
    public SimpleDateFormat gettrainingStart(SimpleDateFormat trainingStart) {
    	return trainingStart;
    }
    
    public SimpleDateFormat gettrainingEnd(SimpleDateFormat trainingEnd) {
    	return trainingEnd;
    }
    
    public String gettrainingStatus(String trainingStatus) {
    	return trainingStatus;
    }

    public String getinServiceCountry(String inServiceCountry) {
    	return inServiceCountry;
    }
    
    public String getinServiceCity(String inServiceCity){
    	return inServiceCity;
    }
    public String getinServiceAgency(String inServiceAgency) {
    	return inServiceAgency;
    }
    
    public String getinServicePOC(String inServicePOC) {
    	return inServicePOC;
    }
    
    public String getinServiceEmail(String inServiceEmail) {
    	return inServiceEmail;
    }
    
    public String getinServicePhone(String inServicePhone) {
    	return inServicePhone;
    }
    
    public String getinServicePostalAddress(String inServicePostalAddress) {
    	return inServicePostalAddress;
    }
   

    // Add Mutator Methods/Setters here
    public void setName(String name) {
    	this.name = name;
    }
    
    public void settype(String type) {
    	this.type = type;
    }
    
    public void setgender(String gender) {
    	this.gender = gender;
    }
    
    public void setage(int age) {
    	this.age = age;
    }
    
    public void setweight(float weight) {
    	this.weight = weight;
    }
    
    public void setacquisitionDate(SimpleDateFormat acquisitionDate) {
    	this.acquisitionDate = acquisitionDate;
    }
    
    public void  setstatusDate(SimpleDateFormat statusDate) {
    	this.statusDate = statusDate;
    }
    
    public void setacquisitionSource(String acquisitionSource) {
    	this.acquisitionSource = acquisitionSource;
    }
    public void setreserved(Boolean reserved) {
    	this.reserved = reserved;
    }

    public void settrainingLocation(String trainingLocation) {
    	this.trainingLocation = trainingLocation;
    }
    
    public void settrainingStart(SimpleDateFormat trainingStart) {
    	this.trainingStart = trainingStart;
    }
    
    public void settrainingEnd(SimpleDateFormat trainingEnd) {
    	this.trainingEnd = trainingEnd;
    }
    
    public void settrainingStatus(String trainingStatus) {
    	this.trainingStatus = trainingStatus;
    }

    public void setinServiceCountry(String inServiceCountry) {
    	this.inServiceCountry = inServiceCountry;
    }
    
    public void setinServiceCity(String inServiceCity){
    	this.inServiceCity = inServiceCity;
    }
    public void setinServiceAgency(String inServiceAgency) {
    	this.inServiceAgency = inServiceAgency;
    }
    
    public void setinServicePOC(String inServicePOC) {
    	this.inServicePOC = inServicePOC;
    }
    
    public void setinServiceEmail(String inServiceEmail) {
    	this.inServiceEmail = inServiceEmail;
    }
    
    public void setinServicePhone(String inServicePhone) {
    	this.inServicePhone = inServicePhone;
    }
    
    public void setinServicePostalAddress(String inServicePostalAddress) {
    	this.inServicePostalAddress = inServicePostalAddress;
    }
    
 
    // a method from Specification Doc.
    public void aMethodFromSpecDoc(String name, String Species, String age) {
    	System.out.println("A method place holder from Spec Doc");
    }
    
    public void bMethodFromSpecDoc(String species,double double1, double double2) {
    	System.out.println("B method place holder from Spec Doc");
    }

	public void requestRescueAnimal(String species, String type) {
		System.out.println("Request a rescue animal that is: ");
		// TODO Auto-generated method stub
		
	}

	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}


}
