package special;

public class RepeatCharacters {

	    public static void main(String[] args) 
	    {
	        String str = "Programming";
	        str = str.toLowerCase();
	        
	        for (int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);
	            
	            if (str.indexOf(ch) == i) 
	            {
	                int count = 0;
	                
	                for (int j = i; j < str.length(); j++) 
	                {
	                    if (str.charAt(j) == ch) {
	                        count++;
	                    }
	                }
	                
	                if (count > 1) 
	                {
	                    System.out.println(ch + " appears " + count + " times");
	                }
	            }
	        }
	    }
	}


