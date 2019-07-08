package conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
	

private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;
	
	public void conectar() {
		//Program Files (x86)/MySQL/MySQL Connector J/mysql-connector-java-5.1.30-bin
		//String servidor = "jdbc:mysql:localhost:3306/consultemed";
		String servidor = "jdbc:mysql://localhost:3306/consultemed?useSSL=false&serverTimezone=UTC";
		String usuario = "root";
		String senha = "";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			this.connection = (Connection) DriverManager.getConnection(servidor,usuario,senha);
			this.statement = this.connection.createStatement();
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
	public boolean estaConectado() {
		if(this.connection != null){
			return true;
		  }else {
			  return false;
		}
	}
		
		public void listarContatos() {
			try {
				String query = "Select * from agenda";
				this.resultset = this.statement.executeQuery(query);
		//		this.statement = this.connection.createStatement();
				while(this.resultset.next()) {
					System.out.println("ID:" + this.resultset.getString("id")+ "-Nome " + this.resultset.getString("nome") +  " - Telefone :" + this.resultset.getString("telefone"));		 	 
				
				}
			}catch(Exception e) {
				System.out.println("Erro :" + e.getMessage());
			}
		}
		
		public void inserirContato(String nome,String telefone) {
			try {
				String query = "INSERT INTO AGENDA 	(nome,telefone) VALUES ('"+ nome +"','"+ telefone +"');";
				this.statement.executeUpdate(query);
				} catch(Exception e) {
					System.out.print("Erro :"+ e.getMessage());
				}
		}
		public void editarContato(String id, String nome, String telefone) {
			try {
				String query = "UPDATE AGENDA SET nome = '"+ nome +"', telefone = '"+ telefone +"' WHERE id = "+ id +";";
				this.statement.executeUpdate(query);
				} catch(Exception e) {
					System.out.print("Erro :" + e.getMessage());
				}
		}
		public void apagarContato(String id) {
			try {
				String query = "DELETE FROM AGENDA WHERE ID = "+ id +";";
				this.statement.executeUpdate(query);
			}catch(Exception e) {
				System.out.print("Erro : " + e.getMessage());
			}
		}
		public void desconectar() {
			try{
				this.connection.close();
			} catch (Exception e) {
			System.out.println("Erro : " + e.getMessage());
		}

		}
}



//create database agenda;
//use agenda;
//create table contato(
//		id int not null auto_increment,
//		nome varchar(50) null,
//		telefone varchar(20) null,/
//		primary key (id)
//		);
//select * from agenda

