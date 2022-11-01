import java.rmi.*;
import java.io.*;

public class MyClient{

	public static void main(String args[]){
		try{
			Method stub=(Method)Naming.lookup("rmi://192.168.217.24:5009/lab6");  //replace 35.39.165.77 with your server's IP address
			System.out.println(stub.action(3,4));

		}catch(Exception e){System.out.println(e);}
	}
}
