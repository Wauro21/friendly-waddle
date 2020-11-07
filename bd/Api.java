package bd;
import java.sql.*;
import misc.Consts;
import java.io.File;
public class Api {

	// DEBUG ONLY
	public static Connection connect(String dbName){
		// Location String
		String dbLocation = locationString(dbName);
		// Check if the DB file exists:
		File fileDB = new File(dbLocation);
		Connection link = null;
		if(fileDB.exists()){
			try{
				link = DriverManager.getConnection("jdbc:sqlite:"+dbLocation);
				System.out.println("BD abierta");
				//The connection element is returned and the connection is kept open.
				return link;
			}
			catch(Exception e ){
				System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				return null;
			}
		}
		else{
			System.out.println("¡No se encontro BD!");
			return null;
		}
	}

	// FROM CONSTA DB NAME
	public static Connection connect(){
		// Location String
		String dbLocation = locationString(Consts.bdName);
		// Check if the DB file exists:
		File fileDB = new File(dbLocation);
		Connection link = null;
		if(fileDB.exists()){
			try{
				link = DriverManager.getConnection("jdbc:sqlite:"+dbLocation);
				System.out.println("BD abierta");
				//The connection element is returned and the connection is kept open.
				return link;
			}
			catch(Exception e ){
				System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				return null;
			}
		}
		else{
			System.out.println("¡No se encontro BD!");
			return null;
		}
	}

	private static String locationString(String dbName){
		return Consts.pathDB+dbName+".db";
	}


	// GET STATUS FROM MAIN TABLE
	
}
