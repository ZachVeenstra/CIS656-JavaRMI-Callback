import java.rmi.*;
import java.rmi.server.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodRemote extends UnicastRemoteObject implements Method{

	MethodRemote()throws RemoteException{
		super();
	}

	public String action(String s){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		if (s.equals("time")){
			return formatter.format(date);
		}
		else {
			return s.toUpperCase();
		}
	}
}
