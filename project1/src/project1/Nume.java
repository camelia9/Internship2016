package project1;

class Book
{
	private
		String Title;
	    Integer ID;   
	public  
	   Book(){
	};
	Void setTitle(String x){
		this.Title=x;
	}
	String getTitle(){
		return this.Title;
	}
	Void setID(Integer n){
		this.ID=n;}
	Integer getID(){
		return this.ID;
	}
}

class Journal extends Book{
}

class Magazine extends Book {}

class StudyBook extends Book{
}

class User
{
	private
	String name;
	
}

class Student extends User{	
}

class Faculty extends User{
}
}

class Tranzaction{
	public static void main (String[] args){
		
	}
	
}