package p3;

public class MyException extends Exception {
	
	public MyException () {
		super();
	}
	
	 public void doStuff() throws MyException {  
	        try{  
	            throw new MyException();  
	        }  
	        catch (MyException me){ 
	        	Message();
	            throw me;  
	        }  
	    }  
	
	public void Message(){
		System.out.println("This is an exception");
	}

	public static void main(String[] args) {
      doStuff();
	}

}
