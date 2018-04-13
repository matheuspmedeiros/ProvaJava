package br.etec.prova.view;

	import java.sql.Connection;


	import br.etec.prova.model.Empregado;
	import br.etec.prova.persistence.*;
	
public class ConexaoView {
	public static void main (String args[]) {
		Empregado empregado = new Empregado();
		try {	
		
			empregado.setNome("Matheus");
			empregado.setSobrenome("Medeiros");
			empregado.setCPF("46075153888");
			
			
			Connection connection = Conexao.getConnection();
			EmpregadoJdbcDao EmpregadoJdbcDao = new EmpregadoJdbcDao(connection);
			
			
				EmpregadoJdbcDao.salvar(empregado);
				EmpregadoJdbcDao.listar();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
