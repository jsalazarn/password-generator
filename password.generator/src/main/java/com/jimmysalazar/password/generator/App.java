package com.jimmysalazar.password.generator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String myPass = generateBasicPass(12);
        System.out.println(myPass);
        
    }
    
    public static String generateBasicPass(int chars) {
    	
    	String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    	Boolean isValid = false;
    	String pwd = "";
    	
        do {
        	System.out.println("Generando contraseña");
        	pwd = "";
            for(int i=0; i < chars; i++){
                pwd += letters.charAt((int) Math.floor(Math.random() * letters.length()));
            }
            isValid = passIsValid(pwd);
			
		} while (!isValid);
        
        return pwd;
    	
    }
    
    public static boolean passIsValid(String pass) {
    	
    	int count = 0;

    	   if( 5 <= pass.length() && pass.length() <= 32  )
    	   {
    	      if( pass.matches(".*\\d.*") )
    	         count ++;
    	      if( pass.matches(".*[a-z].*") )
    	         count ++;
    	      if( pass.matches(".*[A-Z].*") )
    	         count ++;
    	   }

    	   return count >= 3;
    	
    }
}
