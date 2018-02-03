import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDComJDBC {

	public void criar(Connection con, Conta conta) throws SQLException {

		String sql = "insert into conta values (?,?,?)";

		try (PreparedStatement stm = con.prepareStatement(sql)) {

			stm.setInt(1, conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}

	}

	public List<Conta> ler(Connection con) throws Throwable {

		String sql = "select numero, cliente, saldo from  conta";
		List<Conta> lista = new ArrayList<>();

		try (PreparedStatement stm = con.prepareStatement(sql)) {
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}

		}
		return lista;

	}

	public void alterar(Connection con, Conta conta) throws SQLException {

		String sql = "update  conta set  cliente=?, saldo=? where numero=?";

		try (PreparedStatement stm = con.prepareStatement(sql)) {

			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}

	}

	public void excluir(Connection con, Conta conta) throws SQLException {

		String sql = "delete   conta where numero=?";

		try (PreparedStatement stm = con.prepareStatement(sql)) {

			stm.setInt(1, conta.numero);

			stm.executeUpdate();
		}

	}

	public static void main(String[] args) throws Throwable {

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		try (Connection con = DriverManager.getConnection(url, "alex", "Alex123")) {

			CRUDComJDBC comJDBC = new CRUDComJDBC();

			Conta conta1 = new Conta(1, "Alex", 1000.00);
			conta1.saldo = 80000.00;
			comJDBC.alterar(con, conta1);
			
			Conta conta3 = new Conta(3, "Lucia", 3000.00);
			comJDBC.excluir(con, conta3);
			
			/*Conta conta2 = new Conta(2, "Fernanda", 2000.00);
			

			comJDBC.criar(con, conta1);
			comJDBC.criar(con, conta2);
			comJDBC.criar(con, conta3);**/

			List<Conta> contas = comJDBC.ler(con);
			for (Conta conta : contas) {
				System.out.println(conta);
			}

		}

	}

}
