package br.etec.prova.persistence;

		import java.sql.Connection;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.util.ArrayList;
		import java.util.List;

import br.etec.prova.model.Horista;
import br.etec.prova.model.Horista;
		

public class HoristaJdbcDao {
	
	private Connection conn;

	public HoristaJdbcDao(Connection conn) {
		this.conn = conn;
	}

	public void salvar(Horista c) throws SQLException {
		String sql = "insert into Horista(salario ) values ('"+c.getPrecoHora()+"','"+ c.getHorasTrabalhadas()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	public void listar1() {
		String sql = "select * from horista";
        System.out.println(sql);
        
	}
        
		public List<Horista> listar() {
			String sql = "select * from horista";
	        System.out.println(sql);
		List<Horista> horista = new ArrayList<Horista>();
		try {
			PreparedStatement prepareStatement1 = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement1.executeQuery();
			while (rs.next()) {

				String horasTrabalhadas = rs.getString("");
				
				Horista Horista = new Horista();

				Horista.setHorasTrabalhadas(horasTrabalhadas);
				

				System.out.println("\n" + Horista.getHorasTrabalhadas());
				System.out.println("\n" + Horista.getHorasTrabalhadas());
				

				System.out.println("\n**********outra pessoa*********");

			}
			prepareStatement1.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return horista;
	}

}
