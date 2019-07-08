package conectar;

public class agenda {
	
	public static void main(String[] args)
	{
		BancoDeDados bancoDeDados = new BancoDeDados(); 
		bancoDeDados.conectar();
		if(bancoDeDados.estaConectado()) {
			bancoDeDados.listarContatos();
			//bancoDeDados.inserirContato("Jose","3334-5678");
			//bancoDeDados.editarContato("1","Paulo","1234-5678");
			//bancoDeDados.apagarContato("4");
			//bancoDeDados.conectar();
			
		}else {
			System.out.print("Não foi possivel conectar ao banco de dados");
		}
			
	}

}
