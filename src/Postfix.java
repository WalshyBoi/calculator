import java.util.Stack;


public class Postfix {
	
	 Stack<String> calc = new Stack<String>();
	 
	 
    public static void main(String[] args) {
    String input = ("51 + 3");
    Postfix app = new Postfix();
    app.convert(input);
        }
    
    
       
    public void convert(String input){
    	String delims = "[ ]";
    	String[] tokens = input.split(delims);
    	String output = "";
    	for (String t : tokens){
    		
    		
    		if( (!t.equals("+")) &&(!t.equals("-")) && (!t.equals("/")) && (!t.equals("*")) && (!t.equals("^")) ){
    			
    			output += t;
    			calc.push(t);
    		}
    		
    		else if(t.equals("+")){
    			int a = Integer.valueOf(calc.pop());
    			int b = Integer.valueOf(calc.pop());
    			calc.push(String.valueOf(a + b));
    	        
    	    }
    		
    		else if(t.equals("-")){
    			int a = Integer.valueOf(calc.pop());
    			int b = Integer.valueOf(calc.pop());
    			calc.push(String.valueOf(a - b));
    	        
    	    }
    		
    		else if(t.equals("*")){
    			int a = Integer.valueOf(calc.pop());
    			int b = Integer.valueOf(calc.pop());
    			calc.push(String.valueOf(a * b));
    	        
    	    }
    		
    		else if(t.equals("/")){
    			int a = Integer.valueOf(calc.pop());
    			int b = Integer.valueOf(calc.pop());
    			calc.push(String.valueOf(a / b));
    	        
    	    }
    	
    	}	
    	
    	System.out.println(calc);
    	
    }
}
