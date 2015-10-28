
public class Puppy {
	
	 int puppyAge;
	 String puppyName;
	 String puppyColor;
	 
	public Puppy(String name){
		//This constructor has one parameter, name.
		puppyName = name;
		System.out.println("Puppy's name is: " + name);
	}
	
	public void setColor(String color){
		puppyColor = color;
	}
	
	public void setAge(int age){
		/*Lets you set up the age of the puppy and gives it a constructor name*/
		puppyAge = age;
	}
	
	public int getAge(){
		
		return puppyAge;
	}
	
	public static void main(String []args){
		//Following statement would create an object myPuppy
		Puppy myPuppy = new Puppy("Tommy");
		
		//Call class method to set puppy's age
		myPuppy.setAge(2);;
		
		//Call another class method to get puppy's age
		myPuppy.getAge();
		
		//Call class method to set puppy's fur color
		myPuppy.setColor("Brown");
		
		//You can access instance variables as follows
		System.out.println(myPuppy.puppyName + "'s age is: " + myPuppy.puppyAge);
		System.out.println(myPuppy.puppyName + "'s fur color is: " + myPuppy.puppyColor); 
	}
	
}
