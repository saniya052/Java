package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

import com.exp.TrainDoesNotexistException;


public class TrainDAO {
  final  static String DRIVER_Name="oracle.jdbc.OracleDriver";
  final  static String DB_URL="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
  final  static String USER_NAME= "hr" ;
  final  static String PASSWORD="saniya";
 

	public static Train findTrain(int trainNo) throws ClassNotFoundException, SQLException {
		        
		        //step 1 - register the driver
		        Class.forName(DRIVER_Name);
		        //Step 2 - establish a connection
		        Connection connection = DriverManager.getConnection(DB_URL,USER_NAME, PASSWORD);
		        //Step 3 - create a statement
		        Statement statement = connection.createStatement();
		        ResultSet resultSet = statement.executeQuery("SELECT * FROM Train where train_no="+ trainNo);
		        boolean status=(resultSet.next());
		       
		        try {
		        	if(!status) {
		        		throw new TrainDoesNotexistException();
		        	}
		        	
		        }catch(TrainDoesNotexistException e) {
		        	System.out.println(e.getMessage());
					return null;
		        }
		        
		        if(status)
		        { 	
		        String trainName = resultSet.getString(2);
				String source = resultSet.getString(3);
				String destination =resultSet.getString(4);
				double ticketPrice = resultSet.getDouble(5);
				Train t=new Train(trainNo, trainName, source, destination, ticketPrice);
				
				
				Statement st = connection.createStatement();
		        ResultSet TrainNo = st.executeQuery("select * from NoTicket");
		        boolean checkCount=(TrainNo.next());
				if(checkCount) {
					 int no=TrainNo .getInt(1)+1;
					 ResultSet TrainNo1 = st.executeQuery("update NoTicket set TicketCount="+no); 
				}
				
				return t;
	        	}
		        
		        connection.close();
		        return null;
		        
		    }
    
		   /* public static void main(String[] args) throws ClassNotFoundException, SQLException {
		        // TODO Auto-generated method stub
		    	
		    	Train t= TrainDAO.findTrain(1001);
		    	System.out.println(t);
		    }
	*/
	
			
}

