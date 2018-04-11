package br.etec.prova.view;

		import java.sql.Connection;
		
		
		
		import br.etec.prova.model.Assalariado;
		
		import br.etec.prova.persistence.*;

public class AssalariadoExec {
	public static void main (String args[]) {
		Assalariado empregado = new Assalariado();
		try {	
		
			empregado.setSalario("Matheus");
			
			
			
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
