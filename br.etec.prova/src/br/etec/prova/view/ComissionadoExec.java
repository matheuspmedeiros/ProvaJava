package br.etec.prova.view;

		import java.sql.Connection;
		
		import br.etec.prova.model.Comissionado;

		import br.etec.prova.persistence.*;
	
public class ComissionadoExec {
	public static void main (String args[]) {
		Comissionado comissionado = new Comissionado();
		try {	
		
			comissionado.setTotal_vendas("989");
			comissionado.setTaxa_Comissionado("8");
			
			
			
			Connection connection = Conexao.getConnection();
			ComissionadoJdbcDao ComissionadoJdbcDao = new ComissionadoJdbcDao(connection);
			
			
				ComissionadoJdbcDao.salvar(comissionado);
				ComissionadoJdbcDao.listar();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
