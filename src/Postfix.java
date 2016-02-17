import java.util.Stack;


public class Postfix {
	
	 Stack<String> calc = new Stack<String>();
	 
	 
    public static void main(String[] args) {
    String input = ("5 + 3");
        }
    
    
       
    public void convert(String input){
    	String delims = "[ ]";
    	String[] tokens = input.split(delims);
    	String output = "";
    	for (String t : tokens){
    		
    		if( (!t.equals("+")) &&(!t.equals("-")) && (!t.equals("/")) && (!t.equals("*")) && (!t.equals("^")) ){
    			
    			output += t;
    		}
    		
    		else
    	}
    	
    	
    	
    }
}
