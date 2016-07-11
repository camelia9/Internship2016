package p3;

public class e {
	
	void method(){
		try{
			guru();
		    return;
		}
		finally{
			System.out.println("finally something");
		}
	}
	void guru(){
		System.out.println("Guru method");
		throw new StackOverflowError();
	}
	
	public static void main (String args[]){
		e var= new e();
		var.method();
	}

}
