package p5;

import java.util.ArrayList;

public class Localitate {
	
	private String Nume;
	private String tip;
	private Integer NumarLocuitori;
	private List<Persoana>Locuitori= new ArrayList<>();
 
	public Localitate(){
		
	}
	
	public Localitate(String n){
		this.Nume=n;
	}
}
