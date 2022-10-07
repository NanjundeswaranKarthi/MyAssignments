package codePractice;

public class Car {
		
		public void printCarName()
	    {
	    	System.out.println("Scorpio");
	    }
	    
	    public int getRegNumber()
	    
	    {
	    	int regNumber = 7766;
	        return regNumber; 		
		}
	    
	    public String getColor()
	    {
	    	String color = "White";
	    	return color;
	    }
	    
	    public boolean isCarPuncture()
	    
	    {
	    	boolean isPuncture = false;
	    	return isPuncture;
	    }
	    
	    public int addNumbers(int num1,int num2)
	    
	    {
	    	int sum = num1+num2;
	    	return sum;
	    }
	    
	    private int subNumbers(int num1, int num2)
	    {
	    	int sub = num1-num2;
	    	return sub;
	    }
	    
	    float mulNumbers(float num1,float num2)
	    
	    {
	    	float mul = num1*num2;
	    	return mul;
	    }
	    public int divNumbers(int num1, int num2)
	    
	    {
	    	int  div=num1/num1;
	    	return div;
	    }

	    public static void main(String[] args) 
	    {		
	      
	    	Car scorpio = new Car();
	    	int addNumbers = scorpio.addNumbers(1,2);
	    	System.out.println("AddNumbers :" +addNumbers);
	    	
	    	int subNumbers = scorpio.subNumbers(2,1);
	    	System.out.println("SubNumbers :" +subNumbers);
	    	
	    	float mulNumbers = scorpio.mulNumbers(2,2);
	    	System.out.println("MulNumbers :" +mulNumbers);
	    }    
	    
	}

