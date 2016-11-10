/**
 * 
 */

/**
 * @author Dattatreya
 *
 */
import java.io.*;

import com.sun.org.apache.bcel.internal.generic.SWAP;
public class MyJava1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String s=new String("dattu");
		
		char ch=firstnonrepeat("dattu".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("ddptu".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("ddpupt".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("dadadat".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("ddddddddd".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("dddddddddk".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("racecar".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		
		
		

		
		ch=firstnonrepeat("prasanth".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("dadadada".toCharArray());
		System.out.println("non repeated one is "+ch);
		
	//	System.out.println("non repeated one is "+ch);
		System.out.println("Here I am back with more power");
	}
    static char firstnonrepeat(char str[]){
    	int count=0;
        char []tstr=str;
    	
    	for(int i=0;i<str.length;i++){    
    		count=0;
		for(int j=i+1;j<str.length;j++){	
			if(str[i]==str[j]){	 
					  char temp=tstr[i+1];
        			  tstr[i+1]=tstr[j];
        			  tstr[j]=temp;
        			  count++;
        		  }
        		  else 
        			  continue;
    	}
		if(count==0){
			if(i==0)
			{
				return tstr[i] ;
			}
			else if(tstr[i]!=tstr[i-1])
			 return tstr[i];
		}
		
		}
 		return '0';
	}
}


