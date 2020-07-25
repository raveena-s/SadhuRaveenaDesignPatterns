  
package singletonpattern;
public class ABC 
{ 

private ABC() 
{ 
	// private constructor 
} 

//Inner class to provide instance of class 
private static class BillPughSingleton 
{ 
	private static final ABC INSTANCE = new ABC(); 
} 

public static ABC getInstance() 
{ 
	return BillPughSingleton.INSTANCE; 
} 
} 