package com.envisionscripts.app.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void addData(String data) {
		System.out.println("Data: "+data);
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.addData("Welcome");
    }
}
