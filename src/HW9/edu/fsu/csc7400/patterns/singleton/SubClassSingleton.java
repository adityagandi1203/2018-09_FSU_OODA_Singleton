/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9 - Singleton Problems
 * Student:Aditya (@01392300)
 * Date: 2017-11-11
 */
package HW9.edu.fsu.csc7400.patterns.singleton;

/**
 * Subclassed singleton. Will set the state to different value
 * 
 * @author orlando
 */
public class SubClassSingleton extends BaseSingleton {

	/**
	 * Simple function that sets state
	 *
	*I did the name corrections as the method name should be same as we are extending the base class
	 */
	@Override
	public void doSomething() {
		setSomeState(2);
	}

	/**
	 * This is a new function which will print a message
	 * 
	 * @returns 100
	 */
	public int newFunction() {
		System.out.println("NewFunction printout");
		return 100;
	}

	/**
	 * Single constructor must be private
	 * 
	 * it have a super constructor so this constructor must be made public and changing the super constructor to protected
	 */
	public SubClassSingleton() 
	{
	}
		/*singleton unique instance*/
	private static SubClassSingleton uniqueinstance;
	/*
	 * this method used to create the unique instance for subclasssingelton if it have no instance
	 * @return the new instance or return the old
	 */
	public static synchronized BaseSingleton getInstance()
	{
		if(uniqueinstance==null)
		
			uniqueinstance=new SubClassSingleton();
			
		
		return uniqueinstance;
			
	}
		
	
}
