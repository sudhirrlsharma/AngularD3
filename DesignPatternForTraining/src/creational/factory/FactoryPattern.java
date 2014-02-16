package creational.factory;

public class FactoryPattern {
	public Connection createConnection(String type)
	{
		Connection connection;
		if (type.equals("Oracle")){
		connection= new OracleConnection();
		}
		else if (type.equals("SQL Server")){
		connection = new SqlServerConnection();
		}
		else {
		connection = new MySqlConnection();
		}
		return connection;
	}
}
