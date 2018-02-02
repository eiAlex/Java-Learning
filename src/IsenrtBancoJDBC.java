import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IsenrtBancoJDBC {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "INSERT INTO pessoa values (?,?,?,?)";
		String[] pessoas = { "Sandra", "Julia", "Fernanda", "Alessandra" };
		try (Connection con = DriverManager.getConnection(url, "alex", "Alex123");

				PreparedStatement stm = con.prepareStatement(sql);) {

			for (int i = 0; i < pessoas.length; i++) {
				stm.setInt(1, i + 4);
				stm.setString(2, pessoas[i]);
				stm.setString(3, "F");
				stm.setString(4, pessoas[i].toLowerCase() + "email.com");
				stm.addBatch();

			}

			{
				stm.executeBatch();
			}

		}
	}
}
