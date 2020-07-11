/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.net.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
	    FileOutputStream fout=new FileOutputStream(path where you want to save file);
		URLConnection con=url.openConnection();
		InputStrean in=con.getInputStream();
		int x;
		do{
		    x=in.read();
		    if(x!=-1){
		        fout.write(x);
		    }
		}while(x!=-1);
		fout.close();
		System.out.println("file saved");
	}
}
