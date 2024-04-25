import java.sql.*;
 class JDBCCreate{
	public static void main(String[] args) {
		// JDBC driver name and database URL
		String jdbcDriver = " com.mysql.jdbc.Driver.";
		String dbURL= "jdbc:mysql://localhost:3306/sonoo";
		// Database credentials
		String user = "root";
		String pass = "jkclab"; 
		Connection conn = null;
		Statement stmt = null;
		try{
            //STEP 2: Register JDBC driver
			Class.forName(jdbcDriver);
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(dbURL,user,pass);
			//STEP 4: Execute a query
			System.out.println("Creating database...");
			stmt = conn.createStatement();
			if(stmt!=null){
				System.out.println("connection established");
				String sqlq ="insert table aitsgoogle7('101','lalli','cse')";
             stmt.executeUpdate(sqlq);
				System.out.println("Table insert successfully...");
		    }
        }
        catch(ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
        finally{
			try{
                conn.close();
                stmt.close();	
			}	
            catch(SQLException e){
			   e.printStackTrace();
			}   
		}   
    }//end main
}