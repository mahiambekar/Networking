/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.net.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		InetAddress ob= InetAddress.getByName("www.google.com");
		System.out.println(ob.getHostAddress());
		byte[] arr=ob.getAddress();
		for(byte b:arr){
		    System.out.println(b);
		    
		}
		System.out.println(ob.getHostName);
	}
}
