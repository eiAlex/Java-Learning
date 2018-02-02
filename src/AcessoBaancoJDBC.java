import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcessoBaancoJDBC {

	public static void main(String[] args) throws SQLException {

		// String sql = "SELECT CODIGO, NOME, SEXO,EMAIL FROM PESSOA";
		String sql = "SELECT * FROM PESSOA "; // SE PODE ADICIONAR UM ';' NA QUERE POIS SE RECEBE UM CARACTERE INVALIDO
												// COMO EXPTION

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		try (Connection con = DriverManager.getConnection(url, "alex", "Alex123"); // coneção com o banco

				PreparedStatement stm = con.prepareStatement(sql);

				ResultSet rs = stm.executeQuery()) {

			// Exceções lançadas no main.
			while (rs.next()) {

				System.out.println(rs.getString("nome"));
			}

		}
	}

}
