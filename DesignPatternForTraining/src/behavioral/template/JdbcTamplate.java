package behavioral.template;

import java.util.HashMap;
import java.util.Map;



public class JdbcTamplate {

	protected void openConnection() {
		System.out.println("COnnection is opned");

	}
	
	protected void closeConnection(){
		System.out.println("COnnection is closed");
		
	}
	
	protected void closeStatement(){
		System.out.println("closeStatement");
		
	}
	
	protected void closeResultSet(){
		System.out.println("closeResultSet");
		
	}
	
	protected void getPreparedStatement(String query){
		System.out.println("getting prepared statement");
		
	}
	
	protected Map<String,Object> iterateThroghResultSet(){
		System.out.println("iterating through result set");
		 Map<String,Object> data = new HashMap<String,Object>();
		 data.put("ColumnName", "Value");
		return data;
		
	}


	public  Map<String,Object> executeQuery(String query) {
		 Map<String,Object> data=null;
		openConnection();
		getPreparedStatement(query);
		data=iterateThroghResultSet();
		closeResultSet();
		closeStatement();
		closeConnection();
		return data;

	}

}
