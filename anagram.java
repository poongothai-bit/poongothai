import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader ip=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ip);
		String s1=br.readLine(),s2=br.readLine();
	    int count = s1.length(),flag=0;
	    if(count==s2.length())
	    {for(int i=0;i<count;i++)
	    {
	    	char c = s1.charAt(i);
	    	int s2size=s2.length(),f=0;
	    	
	    	while(f < s2size)
	    	{
	    		if(s2.charAt(f)==c)
	    		{
	    			flag++;
	    			break;
	    		}	
	    		f++;
	    	}
	    	
	    	
	    }
		
	    if(flag==count)
	    	System.out.println("Anagram");
	    else
	    	System.out.println("Not a Anagram");
	    }
	    else
	    	System.out.println("Not a Anagram");
		
		
	}

}
