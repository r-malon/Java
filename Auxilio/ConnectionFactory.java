import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
			System.out.println("Conectado.");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return conn;
	}
}