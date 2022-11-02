import java.rmi.*;
import java.util.Scanner;
import java.io.*;

public class MyClient{

	public static void main(String args[]){
		Scanner scnr = new Scanner(System.in);
		try{
			Method stub=(Method)Naming.lookup("rmi://192.168.217.24:5009/lab6");  //replace 35.39.165.77 with your server's IP address
			System.out.println("Enter a String.");
			String input = scnr.nextLine();
			System.out.println(stub.action(input));

		}catch(Exception e){System.out.println(e);}
	}
}
