package studio7;

public class Die {

	//instance variable 
	private int n;

	//constructor method 
	public Die(int n){
		this.n=n;
	}
	
	//method to get a random integer
	public int throwDie() {
		int integer = (int)((Math.random()*n)+1);
		return integer;
	}
	
	//main method to roll die 
	public static void main (String[]args) {
		Die d1= new Die(12);
		int rollDie = d1.throwDie();
		System.out.println(rollDie);
	}	
}